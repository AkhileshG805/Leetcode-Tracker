-- Last updated: 7/9/2026, 3:10:32 PM
WITH RECURSIVE
level_cte AS (
    SELECT
        employee_id,
        manager_id,
        1 AS level,
        salary
    FROM Employees

    UNION ALL

    SELECT
        l.employee_id,
        e.manager_id,
        l.level + 1,
        l.salary
    FROM level_cte l
    JOIN Employees e
        ON l.manager_id = e.employee_id
),

employee_level AS (
    SELECT
        e.employee_id,
        e.employee_name,
        e.salary,
        l.level
    FROM Employees e
    JOIN (
        SELECT employee_id, level
        FROM level_cte
        WHERE manager_id IS NULL
    ) l
    ON e.employee_id = l.employee_id
)

SELECT
    el.employee_id,
    el.employee_name,
    el.level,
    COALESCE(x.team_size, 0) AS team_size,
    el.salary + COALESCE(x.budget, 0) AS budget
FROM employee_level el
LEFT JOIN (
    SELECT
        manager_id AS employee_id,
        COUNT(*) AS team_size,
        SUM(salary) AS budget
    FROM level_cte
    WHERE manager_id IS NOT NULL
    GROUP BY manager_id
) x
ON el.employee_id = x.employee_id
ORDER BY
    level,
    budget DESC,
    employee_name;