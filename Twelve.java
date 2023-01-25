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


    //
    //


    //
    //


    //
    //


    //
    //


    //
    //


    //
    //
}
