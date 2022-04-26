Select student_id, 
count(absent_flag) as num_absent_dates

from attendance 
where absent_flag = TRUE
group by student_id
having count(absent_flag) >= 3;
