package com.cherkina.student_planner.data

data class Lesson(
    val id: String,
    val dayOfWeek: String,
    val pairNumber: Int,
    val time: String,
    val subjectName: String,
    val professor: String,
    val room: String,
    val type: String
)

val sampleSchedule = listOf(
    Lesson(
        id = "1",
        dayOfWeek = "Вторник",
        pairNumber = 1,
        time = "8:30–10:00",
        subjectName = "Системное программирование",
        professor = "Токаев Т.И.",
        room = "3-03",
        type = "лаб."
    ),
    Lesson(
        id = "2",
        dayOfWeek = "Вторник",
        pairNumber = 2,
        time = "10:10–11:40",
        subjectName = "Системное программирование",
        professor = "Токаев Т.И.",
        room = "2-20",
        type = "л."
    ),
    Lesson(
        id = "3",
        dayOfWeek = "Вторник",
        pairNumber = 3,
        time = "12:10–13:40",
        subjectName = "Разработка программных модулей",
        professor = "Донскова Д.А.",
        room = "3-12",
        type = "лаб."
    ),
    Lesson(
        id = "4",
        dayOfWeek = "Среда",
        pairNumber = 2,
        time = "10:10–11:40",
        subjectName = "* Менеджмент в профессиональной деятельности",
        professor = "Запорожская С.А.",
        room = "3-02",
        type = "лаб."
    ),
    Lesson(
        id = "5",
        dayOfWeek = "Среда",
        pairNumber = 2,
        time = "10:10–11:40",
        subjectName = "** Системное программирование",
        professor = "Токаев Т.И.",
        room = "3-09",
        type = "лаб."
    ),
    Lesson(
        id = "6",
        dayOfWeek = "Среда",
        pairNumber = 3,
        time = "12:10–13:40",
        subjectName = "Разработка программных модулей",
        professor = "Донскова Д.А.",
        room = "Актовый зал",
        type = "л."
    ),
    Lesson(
        id = "7",
        dayOfWeek = "Среда",
        pairNumber = 4,
        time = "13:50–15:20",
        subjectName = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        room = "1-02",
        type = "лаб."
    ),
    Lesson(
        id = "7",
        dayOfWeek = "Среда",
        pairNumber = 5,
        time = "15:30–17:00",
        subjectName = "* Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        room = "1-02",
        type = "лаб."
    ),
    Lesson(
        id = "8",
        dayOfWeek = "Четверг",
        pairNumber = 1,
        time = "08:30–10:00",
        subjectName = "* Менеджмент в профессиональной деятельности",
        professor = "Запорожская С.А.",
        room = "3-02",
        type = "л."
    ),
    Lesson(
        id = "9",
        dayOfWeek = "Четверг",
        pairNumber = 1,
        time = "08:30–10:00",
        subjectName = "** Обеспечение качества функционирования компьютеных систем",
        professor = "Ушакова М.А.",
        room = "3-02",
        type = "л."
    ),
    Lesson(
        id = "10",
        dayOfWeek = "Четверг",
        pairNumber = 2,
        time = "10:10–11:40",
        subjectName = "* Математическое моделирование",
        professor = "Трошина О.В.",
        room = "Актовый зал",
        type = "л."
    ),
    Lesson(
        id = "10",
        dayOfWeek = "Четверг",
        pairNumber = 2,
        time = "10:10–11:40",
        subjectName = "** Математическое моделирование",
        professor = "Трошина О.В.",
        room = "3-29",
        type = "пр."
    ),
    Lesson(
        id = "11",
        dayOfWeek = "Четверг",
        pairNumber = 3,
        time = "12:10–13:40",
        subjectName = "* Иностранный язык в профессиональной деятельность",
        professor = "Пенькова О.В.",
        room = "2-22",
        type = "пр."
    ),
    Lesson(
        id = "12",
        dayOfWeek = "Четверг",
        pairNumber = 3,
        time = "12:10–13:40",
        subjectName = "** Физическая культура",
        professor = "Магомедов С.К.",
        room = "Спортивный зал",
        type = "пр."
    ),
    Lesson(
        id = "13",
        dayOfWeek = "Четверг",
        pairNumber = 4,
        time = "13:50–15:20",
        subjectName = "** Обеспечение качества компьютерных систем",
        professor = "Ушакова М.А.",
        room = "3-12",
        type = "лаб."
    ),
    Lesson(
        id = "14",
        dayOfWeek = "Пятница",
        pairNumber = 1,
        time = "8:30–10:00",
        subjectName = "Управление проектами",
        professor = "Трошина О.В.",
        room = "3-03",
        type = "лаб."
    ),
    Lesson(
        id = "15",
        dayOfWeek = "Пятница",
        pairNumber = 2,
        time = "10:10–11:40",
        subjectName = "Инструментальные средства разработки ПО",
        professor = "Леонтьев Д.А.",
        room = "1-02",
        type = "лаб."
    ),
    Lesson(
        id = "16",
        dayOfWeek = "Пятница",
        pairNumber = 3,
        time = "12:10–13:40",
        subjectName = "Управление проектами",
        professor = "Трошина О.В.",
        room = "Актовый зал",
        type = "л."
    ),
    Lesson(
        id = "17",
        dayOfWeek = "Пятница",
        pairNumber = 4,
        time = "13:50–15:20",
        subjectName = "Инструментальные средства разработки ПО",
        professor = "Леонтьев Д.А.",
        room = "1-02",
        type = "лаб."
    )
)