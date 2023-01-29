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

}
