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
