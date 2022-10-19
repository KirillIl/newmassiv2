public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println("Задание 1");
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        int sum = 0;
        int max = -1;
        int min = 300_000;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        System.out.println("Задание 2");
        //Следующая задача — найти минимальную и максимальную трату за день.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей\n");
        System.out.println();
        System.out.println("Задание 3");
        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        double average = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила " + average + " рублей\n");
        System.out.println();
        System.out.println("Задание 4");
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
