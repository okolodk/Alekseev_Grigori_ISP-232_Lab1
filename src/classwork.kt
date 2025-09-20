fun main() {
//    Задание:
//    • Объявите переменные имя, год рождения и возраст (с помощью val и var).
//    • Измените значение возраста (например, прибавьте 10 лет).
//    • Выведите значения в консоль.
//    val name = readln()
//    var age = readln().toInt()
//    println("${name} ${age}")
//    age += 10
//    println("${name} ${age}")

//    Задание: Объявите переменные каждого из перечисленных типов, присвойте
//    им значения и выведите на консоль.
//    val i : Int = 1
//    val d : Double = 1.0
//    val b : Boolean = true
//    val s : String = "1"
//    val a : Any = 1
//    println("${i}")
//    println("${d}")
//    println("${b}")
//    println("${s}")
//    println("${a}")

//    Задание: Перепишите код ниже, закомментировав каждую строку, и
//    попробуйте объяснить, что она делает:
//    val name = "Denis" // Объявить переменную с именем 'name' и присвоить ей значение "Denis"
//
//    val age = 18 // Объявить переменную 'age' и присвоить ей значение 18
//
//    println("Hello") // Вывести в консоль строку "Hello"
//
//    println("My name is $name") // Вывести строку, вставив значение переменной name (выведет: My name is Denis)
//
//    println("My age is $age") // Вывести строку, вставив значение переменной age (выведет: My age is 18)
//
//    val a = 10 // Объявить переменную 'a' со значением 10
//
//    val b = 15 // Объявить переменную 'b' со значением 15
//
//    val c = a + b + 8 // Вычислить сумму a, b и 8 → 10 + 15 + 8 = 33, сохранить в переменную c
//
//    val str = c.toString() // Преобразовать число c в строку (например, "33")
//
//    println(str) // Вывести строковое значение str → выведет: 33
//
//    val numList = arrayOf(1, 2, 3) // Создать массив из трёх чисел: [1, 2, 3]
//
//    var x = 0 // Объявить изменяемую переменную x со значением 0
//
//    while (x < 3) { // Пока x меньше 3, выполнять тело цикла
//        println("Item $x is ${numList[x]}") // Вывести текущий индекс и значение элемента массива по этому индексу
//        x = x + 1 // Увеличить x на 1 (следующая итерация)
//    }
//    Задание:
//    1. Создайте переменные a: Int = 7 и b: Double = 3.5.
//    2. Преобразуйте b в Int и выполните операции:
//    o Сложение a + b
//    o Деление a / b
//    3. Выведите результаты в консоль.
//    var a: Int = 7
//    var b: Double = 3.5
//    var b_int: Int = b.toInt()
//    println("a + b = ${a + b_int}")
//    println("a - b = ${a - b_int}")

//    Задание:
//    1. Спросите у пользователя:
//    o имя
//            o возраст
//            2. Преобразуйте возраст в Int и выведите сообщение:
//    o "Через 5 лет вам будет X лет."
//    var age = readln().toInt()
//    println(" Через 5 лет тебе будет - ${age + 5}")

//    Задание:
//    1. Напишите программу, которая запрашивает у пользователя два числа.
//    2. Выполните над ними все вышеуказанные операции.
//    val a = readln().toInt()
//    val b = readln().toInt()
//
//    println("Сумма: ${a + b}")
//    println("Разность: ${a - b}")
//    println("Произведение: ${a * b}")
//    println("Частное: ${a / b}")
//    println("Остаток: ${a % b}")

    // === Шаг 1: Приветствие ===
    println("Hello, world!")

    // === Шаг 2: Исправленный вывод ===
    println("Today is sunny!")

    // === Шаг 4: Переменные и возраст ===
    val myName = "Анна"
    var myAge = 20
    myAge = myAge + 10
    println("Имя: $myName, Возраст: $myAge")

    // === Шаг 5: Все типы данных ===
    val intVal: Int = 42
    val longVal: Long = 1000L
    val doubleVal: Double = 3.1415
    val floatVal: Float = 2.71f
    val booleanVal: Boolean = true
    val charVal: Char = 'A'
    val stringVal: String = "Привет"
    val anyVal: Any = "Можно любое значение"

    println("Int: $intVal")
    println("Long: $longVal")
    println("Double: $doubleVal")
    println("Float: $floatVal")
    println("Boolean: $booleanVal")
    println("Char: $charVal")
    println("String: $stringVal")
    println("Any: $anyVal")

    // === Шаг 6: Шаблоны строк ===
    val a = 10
    val b = 15
    println("a = $a")
    println("b = $b")
    println("a + b = ${a + b}")

    // === Шаг 7: Основной пример из файла ===
    val name = "Denis"
    val age = 18
    println("Hello")
    println("My name is $name")
    println("My age is $age")
    val c = a + b + 8
    val str = c.toString()
    println(str)
    val numList = arrayOf(1, 2, 3)
    var x = 0
    while (x < 3) {
        println("Item $x is ${numList[x]}")
        x = x + 1
    }

    // === Шаг 9: Преобразование типов ===
    val numA: Int = 7
    val numB: Double = 3.5
    val numBAsInt = numB.toInt()
    println("Сложение: ${numA + numBAsInt}")
    println("Деление: ${numA / numB}")

    // === Шаг 10: Исправленный код ===
    val greeting = "Hello!"
    println(greeting)

    // === Шаг 11: Ввод имени, возраста, пола ===
    print("Введите ваше имя: ")
    val userName = readln()
    print("Введите ваш возраст: ")
    val userAgeStr = readln()
    val userAge = userAgeStr.toInt()
    print("Введите ваш пол: ")
    val gender = readln()
    println("Привет, $userName! Твой возраст: $userAge, Пол: $gender")

    // === Задание 4: Расчёт возраста на 2025 год ===
    print("Введите ваше имя: ")
    val finalName = readln()
    print("Введите ваш год рождения: ")
    val birthYear = readln().toInt()
    val futureAge = 2025 - birthYear
    println("$finalName, вам $futureAge лет.")

    // === Шаг 12: Подсчёт писем и математика ===
    val unreadCount = 5
    val readCount = 100
    println("Общее количество сообщений: ${unreadCount + readCount}")

    print("Введите первое число: ")
    val inputA = readln().toInt()
    print("Введите второе число: ")
    val inputB = readln().toInt()
    println("$inputA + $inputB = ${inputA + inputB}")
    println("$inputA - $inputB = ${inputA - inputB}")
    println("$inputA * $inputB = ${inputA * inputB}")
    println("$inputA / $inputB = ${inputA / inputB}")
    println("$inputA % $inputB = ${inputA % inputB}")

    // === Шаг 13: Инкремент и декремент ===
    var count = 10
    count = count + 1
    println(count)
    count++
    println(count)
    count--
    println(count)

    // === Шаг 14: Время и деление ===
    val totalSeconds = 7385
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60
    println("${hours}ч ${minutes}м ${seconds}с")

    // === Шаг 15: Температура ===
    print("Введите температуру в градусах Фаренгейта: ")
    val fahrenheit = readln().toDouble()
    val celsius = (fahrenheit - 32) * 5 / 9
    println("Температура в Цельсиях: $celsius°C")

    // === Самостоятельные задания ===
    val favoriteGame = "The Witcher 3"
    val favoriteDigit = 7
    val piValue = 3.14
    val favoriteLetter = 'K'
    println("Любимая игра: $favoriteGame")
    println("Любимая цифра: $favoriteDigit")
    println("Число Пи: $piValue")
    println("Любимая буква: $favoriteLetter")

    val circleArea = piValue * 5 * 5
    println("Площадь круга: $circleArea")

    print("Введите трёхзначное число: ")
    val threeDigit = readln().toInt()
    val digitSum = (threeDigit / 100) + (threeDigit % 100 / 10) + (threeDigit % 10)
    println("Сумма цифр: $digitSum")

    print("Введите разделитель: ")
    val sep = readln()
    print("Введите строку 1: "); val s1 = readln()
    print("Введите строку 2: "); val s2 = readln()
    print("Введите строку 3: "); val s3 = readln()
    println("$s1$sep$s2$sep$s3")

    print("Введите число: ")
    val start = readln().toInt()
    println(start)
    println(start + 1)
    println(start + 2)

    print("Введите трёхзначное число: ")
    val orig = readln().toInt()
    val rev = (orig % 10) * 100 + ((orig / 10) % 10) * 10 + (orig / 100)
    println("Перевёрнутое число: $rev")

    print("Введите число: ")
    val n = readln().toInt()
    val hundredsDigit = (n / 100) % 10
    println("Цифра сотен: $hundredsDigit")
}

