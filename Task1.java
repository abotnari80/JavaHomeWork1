import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Задание 1.");
    System.out.println("Введите число: ");
    int n = sc.nextInt();
    int factorial = 1;
    for (int i = 1;i <= n; i++) {
        if (i != n) {
            System.out.print(i + "+");
        } else {
            System.out.print(i + "=");
        }
    }
    System.out.println(n*(n+1)/2);

    for (int i = 1; i <= n; i++) {
        factorial = factorial * i;
        if (i != n) {
            System.out.print(i + "*");
        } else {
            System.out.print(i + "=");
        }
    }
    System.out.println(factorial);
    
    System.out.println("Задание 2.");
    System.out.println("Введите два числа для проверки их суммы:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (Task2(a, b) == true)
        System.out.println("True");
    else
        System.out.println("False");

    System.out.println("Задание 3.");
    System.out.println("Введите число положительное или отрицательное:");
    a = sc.nextInt();
    Task3(a);
    
    System.out.println("Задание 4.");
    System.out.println("Введите число:");
    a = sc.nextInt();
    System.out.println(Task4(a));

    /* 
    System.out.println("Задание 5.");
    System.out.println("Введите строку:");
    String str = sc.nextLine();
    System.out.println("Введите количество повторений:");
    a = sc.nextInt();
    Task5(str, a);
    */

    System.out.println("Задание 6.");
    System.out.println("Введите год:");
    a = sc.nextInt();
    System.out.println(Task6(a));

    System.out.println("Задание 7.");
    int[] array7task = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    Task7(array7task);
    System.out.println();

    System.out.println("Задание 8.");
    int[] array8task = new int[100];
    Task8(array8task);
    System.out.println();

    System.out.println("Задание 9.");
    int[] array9task = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    Task9(array9task);
    System.out.println();

    System.out.println("Задание 10.");
    int[][] array10task = new int[5][5];
    Task10(array10task);

    System.out.println("Задание 11.");
    System.out.println("Введите len:");
    int len = sc.nextInt();
    System.out.println("Введите initialValue:");
    int initialValue = sc.nextInt();
    int[] tmpArray = Task11(len, initialValue);
    for (int i = 0; i < tmpArray.length; i++) {
        System.out.print(tmpArray[i] + " ");
    }
    System.out.println();

    System.out.println("Задание 12.");
    int[] array12task = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < array12task.length; i++) {
        System.out.print(array12task[i] + " ");
    }
    System.out.println();
    Task12(array12task);


    sc.close();
    }

    // МЕТОДЫ

    public static boolean Task2(int a, int b) {
        int sum = a + b;
        if (sum> 10 && sum <20) return true;
        else return false;
    }

    public static void Task3(int a) {
        if (a > 0 || a == 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    public static boolean Task4(int a) {
        if (a > 0 || a == 0)
            return false;
        else
            return true;
    }

    /*
    public static void Task5(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
    */

    public static boolean Task6(int a) {
        if (a % 4 == 0 && a % 400 == 0 || a % 100 != 0)
            return true;
        else
            return false;
    }

    public static void Task7(int[] tmpArray) {
        System.out.println("Массив до изменений:");
        for (int i = 0; i < tmpArray.length; i++) {
            System.out.print(tmpArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] == 0)
                tmpArray[i] = 1;
            else
                tmpArray[i] = 0;
        }

        System.out.println("Массив после изменений:");
        for (int i = 0; i < tmpArray.length; i++) {
            System.out.print(tmpArray[i] + " ");
        }
    }

    public static void Task8(int[] tmpArray) {
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = i + 1;
            System.out.print(tmpArray[i] + " ");
        }

    }

    public static void Task9(int[] tmpArray) {
        System.out.println("Массив до изменений");

        for (int i = 0; i < tmpArray.length; i++) {
            System.out.print(tmpArray[i] + " ");
            if (tmpArray[i] < 6)
                tmpArray[i] = tmpArray[i] * 2;
        }

        System.out.println();
        System.out.println("Массив после изменений");
        for (int i = 0; i < tmpArray.length; i++) {
            System.out.print(tmpArray[i] + " ");
        }
    }

    public static void Task10(int[][] tmpArray) {
        for (int i = 0; i < tmpArray.length; i++) {
            for (int j = 0; j < tmpArray.length; j++) {
                if (i == j)
                    tmpArray[i][j] = 1;
                else 
                    tmpArray[i][j] = 0;
                System.out.print(tmpArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] Task11(int len, int initialValue) {
        int[] tmpArray = new int[len];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = initialValue;
        }
        return tmpArray;
    }

    public static void Task12(int[] tmpArray) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] < min)
                min = tmpArray[i];
            if (tmpArray[i] > max)
                max = tmpArray[i];
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }

}