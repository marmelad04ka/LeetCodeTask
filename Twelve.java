import java.util.Set;

public class Twelve {
    //584. Find Customer Referee
    //https://leetcode.com/problems/find-customer-referee/?envType=study-plan&id=sql-i
//    Select name
//    From Customer
//    Where referee_id != 2 OR referee_id IS NULL;

    //183. Customers Who Never Order
    //https://leetcode.com/problems/customers-who-never-order/description/?envType=study-plan&id=sql-i
//    Select name AS 'Customers'
//    From Customers
//    Where id NOT IN (Select customerId from Orders);

    //1741. Find Total Time Spent by Each Employee
    //https://leetcode.com/problems/find-total-time-spent-by-each-employee/description/
//    Select event_day AS day, emp_id, SUM(out_time - in_time ) as 'total_time'
//    From Employees
//    Group By event_day, emp_id;

    //1729. Find Followers Count
    //https://leetcode.com/problems/find-followers-count/description/
//    Select user_id, Count(follower_id) as followers_count
//    From Followers
//    Group By user_id
//    Order by user_id;

    //1873. Calculate Special Bonus
    //https://leetcode.com/problems/calculate-special-bonus/description/?envType=study-plan&id=sql-i
//    Select employee_id,
//    if(employee_id%2 = 0 OR name Like 'M%', 0, salary) as bonus
//    From Employees
//    Order by employee_id;


    //627. Swap Salary
    //https://leetcode.com/problems/swap-salary/description/?envType=study-plan&id=sql-i
//    Update Salary Set sex = Case
//    When sex = 'f' Then 'm'
//    When sex = 'm' Then 'f'
//    End;

    //196. Delete Duplicate Emails
    //https://leetcode.com/problems/delete-duplicate-emails/description/?envType=study-plan&id=sql-i
//    Delete p1
//    From Person p1, Person p2
//    Where p1.email = p2.email and p1.id > p2.id;

    //175. Combine Two Tables
    //https://leetcode.com/problems/combine-two-tables/description/
//    Select firstName, lastName, city, state
//    from Person left join Address
//    using (personId);

    //1484. Group Sold Products By The Date
    //https://leetcode.com/problems/group-sold-products-by-the-date/description/?envType=study-plan&id=sql-i
//    Select sell_date, count(distinct product) as num_sold, group_concat(distinct product) as products
//    from activities
//    group by sell_date;


    //1667. Fix Names in a Table
    //https://leetcode.com/problems/fix-names-in-a-table/description/?envType=study-plan&id=sql-i
//    Select user_id, concat(upper(substring(name, 1,1)), lower(substring(name, 2, length(name) - 1))) as name
//    from Users
//    order by user_id;
}
