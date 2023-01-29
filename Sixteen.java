public class Sixteen {
    //175. Combine Two Tables
    //https://leetcode.com/problems/combine-two-tables/description/?envType=study-plan&id=sql-i
//    Select firstName, lastName, city, state
//    from Person left join Address
//    using (personId);

    //1148. Article Views I
    //https://leetcode.com/problems/article-views-i/description/?envType=study-plan&id=sql-i
//    select distinct author_id as id
//    from Views
//    where author_id = viewer_id
//    order by author_id;

    //1693. Daily Leads and Partners
    //https://leetcode.com/problems/daily-leads-and-partners/description/
//    select date_id, make_name, count(distinct lead_id) as 'unique_leads', count(distinct partner_id) as 'unique_partners'
//    from dailySales
//    group by date_id, make_name;

    //1587. Bank Account Summary II
    //https://leetcode.com/problems/bank-account-summary-ii/description/
//    Select name AS NAME, Sum(amount) As BALANCE
//    From Users Join Transactions
//    where users.account = transactions.account
//    group by name
//    HAving BALANCE > 10000;

    //1890. The Latest Login in 2020
    //https://leetcode.com/problems/the-latest-login-in-2020/description/
//    Select user_id, max(time_stamp) as last_stamp
//    from Logins
//    Where time_stamp like '2020%'
//    group by user_id;

    //1050. Actors and Directors Who Cooperated At Least Three Times
    //https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/description/
//    select actor_id, director_id
//    from ActorDirector
//    group by actor_id, director_id
//    having count(timestamp) >= 3;

    //1393. Capital Gain/Loss
    //https://leetcode.com/problems/capital-gainloss/description/
//    select stock_name, Sum(
//            case
//              when operation like 'Buy' then -price
//              when operation like 'sell' then price
//            end
//    ) as 'capital_gain_loss'
//    from stocks
//    group by stock_name
}
