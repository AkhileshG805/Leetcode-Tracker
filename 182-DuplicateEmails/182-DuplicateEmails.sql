-- Last updated: 7/9/2026, 3:12:57 PM
select email as Email
from Person 
Group by email
Having Count(*)>1;