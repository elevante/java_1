package ru.mail.java_1;

//  Task 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

public class Java_App {
    public static void main(String[] args) {
//  Task 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte byteVal = 25;
        short shortVal = 500;
        int intVal = 10000;
        long longVal = 100000000000000L;
        float floatVal = 12.35f;
        double doubleVal = -150.135;
        boolean boolVal = true;
/*
    Task 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.

*/
        System.out.println(calculator(1, 10, 5, 2));
/*
    Task 4. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
*/
        System.out.println(limitValue(12, 10));
/*
    Task 5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
 */
        positiveNegative(-100);
/*
    Task 6. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
*/
        System.out.println(valTrueFalse(-10));
/*
    Task 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
*/
        nameOutput("Adam");

/*
    Task 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
        leapYear(2021);

    }
    public static float calculator(float a, float b, float c, float d){
        return (a * (b + (c / d)));
    }

    public static boolean limitValue(int a, int b){
        int c = a + b;
        if(10 <= c && c <= 20)
            return (true);
        else
          return (false);
    }

    public static void positiveNegative(long a){
        if(a >= 0)
            System.out.println("Положительное число: " + a);
        else if(a < 0)
            System.out.println("Отрицательное число: " + a);
    }

    public static boolean valTrueFalse(int m){
        if (m < 0)
            return (true);
        else
            return (false);
    }

    public static void nameOutput(String name){
        System.out.println("Привет, " + name);
    }

    public static void leapYear(int a){
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
            System.out.println("Год високосный (366 дней)");
        else
            System.out.println("Год не високосный (365 дней)");
    }
}