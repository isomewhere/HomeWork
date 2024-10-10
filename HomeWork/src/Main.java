
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(10, 5));
        printPositiveOrNegative(-10);
        System.out.println(isNegative(0));
        repeatString("Hello", 3);

        System.out.println("Проверка високосного года:");
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2024));

        System.out.println("Замена элементов массива:");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 0};
        replaceBinaryArray(binaryArray);
        printArray(binaryArray);

        System.out.println("Заполнение массива значениями:");
        int[] hundredArray = new int[100];
        fillArrayWithValues(hundredArray);
        printArray(hundredArray);

        System.out.println("Умножение элементов массива на 2:");
        int[] specificArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleArrayElements(specificArray);
        printArray(specificArray);

        System.out.println("Диагональные элементы матрицы:");
        int[][] squareArray = new int[5][5];
        fillDiagonals(squareArray);
        print2DArray(squareArray);

        System.out.println("Создание массива с заданным значением:");
        int[] arrayWithValue = createArray(7, 99);
        printArray(arrayWithValue);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -5;
        int b = 10;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 15;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void repeatString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void replaceBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

    public static void fillArrayWithValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void doubleArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
    public static void fillDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
