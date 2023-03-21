import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Создайте модель бухгалтерской книги — массив из случайных чисел от 100 000 до 200 000.
        // На основе этого массива решите задачи.
        // Бухгалтеры попросили посчитать сумму всех выплат за месяц
        // Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Сумма трат за месяц составила … рублей».

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary: salaryArray) {
            salarySum += salary; // salarySum = salarySum + salary;
        }

        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");

    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        // Напишите программу, которая решит эту задачу, и выведите в консоль результат в
        // формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма
        // трат за день составила … рублей».

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salaryMax = Integer.MIN_VALUE; // 99000
        int salaryMin = Integer.MAX_VALUE; // 200001

        for (int salary: salaryArray) {
            if (salary > salaryMax) {
                salaryMax = salary;
            }

            if (salary < salaryMin) {
                salaryMin = salary;
        }
    }

        System.out.println("Минимальная сумма трат за день составила " + salaryMin +
                " рублей. Максимальная трат за день составила " + salaryMax + " рублей.");

    }

    public static void task3 () {
        System.out.println("Задача 3");
        // Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        // Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму
        // всех трат за месяц поделить на количество дней), и выведите в консоль результат в
        // формате: «Средняя сумма трат за месяц составила … рублей».
        // Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary: salaryArray) {
            salarySum += salary;
        }

        double salaryAverage = (double) salarySum / salaryArray.length;

        System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        // В бухгалтерской книге появился баг. Что-то пошло нет так —
        // фамилии и имена сотрудников начали отображаться в обратную сторону.
        // Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
        // Данные с именами сотрудников хранятся в виде массива символов — char[ ].
        // Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников
        // в корректном виде. В качестве данных для массива используйте:
        // char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // В результате в консоль должно быть выведено: Ivanov Ivan.

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}