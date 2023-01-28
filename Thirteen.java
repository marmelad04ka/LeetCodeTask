public class Thirteen {
    //1527. Patients With a Condition
    //https://leetcode.com/problems/patients-with-a-condition/description/?envType=study-plan&id=sql-i
//    select patient_id, patient_name, conditions
//    from Patients
//    Where conditions like 'DIAB1%' or conditions like '% DIAB1%';

    //511. Game Play Analysis I
    //https://leetcode.com/problems/game-play-analysis-i/description/
//    select player_id, min(event_date) as first_login
//    from Activity
//    group by player_id;

    //1148. Article Views I
    //https://leetcode.com/problems/article-views-i/description/
//    select distinct author_id as id
//    from Views
//    where author_id = viewer_id
//    order by author_id;

    //620. Not Boring Movies
    //https://leetcode.com/problems/not-boring-movies/description/
//    select id, movie, description, rating
//    from Cinema
//    where id%2 = 1 and description not like 'boring'
//    order by rating desc;

    //596. Classes More Than 5 Students
    //https://leetcode.com/problems/classes-more-than-5-students/description/
//    select class
//    from courses
//    group by class
//    having count(student) >= 5;

    //176. Second Highest Salary
    //https://leetcode.com/problems/second-highest-salary/description/?envType=study-plan&id=sql-i
//    select max(salary) as SecondHighestSalary
//    from employee
//    where salary < (select max(salary) from employee);

    //1965. Employees With Missing Information
    //https://leetcode.com/problems/employees-with-missing-information/description/?envType=study-plan&id=sql-i
//    select employee_id
//    from employees
//    where employee_id not in (select employee_id from salaries)
//    union
//    select employee_id
//    from salaries
//    where employee_id not in (select employee_id from employees)
//    order by employee_id;

    //1795. Rearrange Products Table
    //https://leetcode.com/problems/rearrange-products-table/description/?envType=study-plan&id=sql-i
//    select product_id, 'store1' as store, store1 as price
//    from products
//    where store1 is Not Null
//            Union
//    select product_id, 'store2' as store, store2 as price
//    from products
//    where store2 is Not Null
//            union
//    select product_id, 'store3' as store, store3 as price
//    from products
//    where store3 is Not Null;

    //182. Duplicate Emails
    //https://leetcode.com/problems/duplicate-emails/description/
//    select email as Email
//    from person
//    group by email
//    having count(email) > 1;

    //
    //
}
