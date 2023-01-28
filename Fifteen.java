public class Fifteen {
    //Объедините таблицы Class и Student_in_class с помощью внутреннего соединения по полям Class.id и Student_in_class.class.
    //Выведите название класса (поле Class.name) и идентификатор ученика (поле Student_in_class.student).
//    select class.name, Student_in_class.student
//    from Class  join Student_in_class
//    on Class.id = Student_in_class.class;

    //Дополните запрос из предыдущего задания, добавив ещё одно внутреннее соединение с таблицей Student.
    //Объедините по полям Student_in_class.student и Student.id и вместо идентификатора ученика выведите его имя (поле first_name).
//    select class.name, Student.first_name
//    from Class join Student_in_class
//    on Class.id = Student_in_class.class
//    join Student on Student_in_class.student = Student.id;

    //Выведите названия продуктов, которые покупал член семьи со статусом "son".
    //Для получения выборки вам нужно объединить таблицу Payments с таблицей FamilyMembers по полям family_member и member_id, а также с таблицей Goods по полям good и good_id.
//    SELECT good_name
//    FROM Payments join FamilyMembers
//    on family_member = member_id
//    join Goods
//    on good = good_id
//    where status  = 'son';

    //Выведите идентификатор (поле room_id) и среднюю оценку комнаты (поле rating, для вывода используйте псевдоним avg_score), составленную на основании отзывов из таблицы Reviews.
    //Данная таблица связана с Reservations (таблица, где вы можете взять идентификатор комнаты) по полям reservation_id и Reservations.id.
//    select room_id, avg(rating) as 'avg_score'
//    from Reviews join Reservations
//    on reservation_id = Reservations.id
//    group by room_id ;

    //Отсортируйте список компаний (таблица Company) по их названию в алфавитном порядке и выведите первые две записи.
//    select *
//    from Company
//    order by name
//    limit 2;

    //Выведите начало (поле start_pair) и окончание (поле end_pair) второго и третьего занятия из таблицы Timepair.
//    select start_pair, end_pair
//    from Timepair
//    limit 1,2;

    //Выведите количество полётов каждого пассажира, представленного в таблице Passenger.
    // Список полётов находится в таблице Pass_in_trip. В качестве результата выведите количество полётов (используйте псевдоним count) и имя пассажира.
//    select (
//            select count(id)
//    from Pass_in_trip
//    where passenger = Passenger.id ) as count, name
//    from Passenger;

    //Выведите названия товаров из таблицы Goods (поле good_name), которые ещё ни разу не покупались ни одним из членов семьи (таблица Payments).
//    select good_name
//    from Goods
//    where good_id not in (select good from Payments);

    //Удалите все записи из таблицы Payments, используя оператор DELETE.
//    delete from Payments;

    //Удалить запись из таблицы Goods, у которой поле good_name равно "milk"
//    delete
//    from Goods
//    where good_name = 'milk';

    //Выведите имена (поле member_name) всех членом семьи (таблица FamilyMembers) в верхнем регистре. Для вывода имени используйте псевдоним name.
//    select Upper(member_name) as name
//    from FamilyMembers;

    //Выведите идентификаторы (поле good_id) всех товаров, дополнив идентификаторы незначащими нолями слева до 2-х знаков.
//    SELECT Lpad(good_id,2,'0') as ids FROM Goods

    //В базе данных имена и фамилии всех членов семьи (таблица FamilyMembers) хранятся в формате "имя фамилия" (поле member_name). Необходимо их разделить и вывести только имена.
//    SELECT Left(member_name, instr(member_name, ' ')-1) as firstName FROM FamilyMembers

    //Выведите среднюю стоимость бронирования для комнат, которых бронировали хотя бы один раз. Среднюю стоимость необходимо округлить до целого значения вверх.
//    select room_id, ceiling(avg(price)) as 'avg_price'
//    from Reservations
//    group by room_id ;

    //Выведите id тех комнат, которые арендовали нечетное количество раз.
    // В качестве результата выведите id комнаты и количество раз сколько ее брали в аренду (используйте псевдоним count).
//    select room_id, count(room_id) as 'count'
//    from Reservations
//    group by room_id
//    having count%2 = 1;

    //Вывести имя и возраст для всех членов семьи. Для вывода имени и возраста используйте псевдонимы member_name и age соответственно.
//    SELECT member_name, TIMESTAMPDIFF(year, birthday , curdate())   AS age
//    FROM FamilyMembers;
}
