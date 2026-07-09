-- Last updated: 7/9/2026, 3:10:19 PM
WITH top_students AS (
    SELECT user_id
    FROM course_completions
    GROUP BY user_id
    HAVING COUNT(*) >= 5
       AND AVG(course_rating) >= 4
),
course_pairs AS (
    SELECT
        cc.user_id,
        cc.course_name AS first_course,
        LEAD(cc.course_name) OVER (
            PARTITION BY cc.user_id
            ORDER BY cc.completion_date
        ) AS second_course
    FROM course_completions cc
    JOIN top_students ts
        ON cc.user_id = ts.user_id
)

SELECT
    first_course,
    second_course,
    COUNT(*) AS transition_count
FROM course_pairs
WHERE second_course IS NOT NULL
GROUP BY first_course, second_course
ORDER BY
    transition_count DESC,
    first_course ASC,
    second_course ASC;