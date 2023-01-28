public class Fourteen {
    //Выведите идентификаторы товаров (поле good) из таблицы Payments, стоимость которых больше 2000 единиц. Стоимость товара хранится в поле unit_price.
    //https://sql-academy.org/ru/guide/conditional-where-operator
//    select good from Payments
//    where unit_price >2000;

    //Выведите имена (поле member_name) членов семьи из таблицы FamilyMembers, чей статус (поле status) равен "father".
//    select member_name from FamilyMembers
//    where status = 'father';

    //Выведите имя (поле member_name) и дату рождения (поле birthday) членов семьи из таблицы FamilyMembers, чей статус (поле status) равен "father" или "mother".
//    select member_name, birthday from FamilyMembers
//    where status = 'father' Or status = 'mother';

    //Необходимо получить все комнаты, в которых есть как кухня (поле has_kitchen), так и интернет (поле has_internet). Напишите запрос, удовлетворяющий вышеописанному условию, который выводит все поля из таблицы Rooms.
    //Наличие обозначается 1 или true, а отсутствие 0 или false.
//    select * from Rooms
//    where has_kitchen = 1 And has_internet = 1;

    //Выведите резервации комнат (поля room_id, start_date, end_date) из таблицы Reservations, у которых итоговая стоимость аренды (поле total) находится в промежутке от 500 до 1200 включительно.
//    select room_id, start_date, end_date from Reservations
//    where total Between 500 and 1200;

    //Выведите всех членов семьи с фамилией "Quincey".
//    SELECT member_name
//    FROM FamilyMembers
//    where member_name like '% Quincey';

    //Выведите список членов семьи с фамилией Quincey, в отсортированном по возрастанию столбцам status и member_name виде.
//    select * from FamilyMembers
//    where member_name like '%Quincey%'
//    order by status, member_name;

    //Для каждого отдельного платежа выведите идентификатор товара и сумму, потраченную на него, в отсортированном по убыванию этой суммы виде. Список платежей находится в таблице Payments.
    //Для вывода суммы используйте псевдоним sum.
//    select good, unit_price * amount  as 'sum'
//    from Payments
//    order by sum desc;

    //Найдите самых старших членов семьи (используйте поле birthday) среди всех существующих семей на основании их статуса (поле status). Выведите статус и дату рождения.
//    select status, min(birthday) as birthday
//    from FamilyMembers
//    group by status ;


    //Получите среднее время полётов, совершённых на каждой из моделей самолёта. Выведите поле plane и среднее время полёта в секундах.
//    select plane, avg(TIMESTAMPDIFF(second, time_out, time_in)) as 'time'
//    from trip
//    group by plane;
}
