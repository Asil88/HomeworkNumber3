import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
        Task11();
        Task12();
        Task13();
        Task14();
    }

    private static void Task1() {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 12, 1, 2: {
                System.out.println("Зима");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Весна");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Лето");
                break;
            }
            case 9, 10, 11: {
                System.out.println("Осень");
                break;
            }
        }
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();


        if (month == 12 || month <= 2 && month > 0) {
            System.out.println("Зима");
        } else if (month > 2 && month <= 5) {
            System.out.println("Весна");
        } else if (month > 5 && month <= 8) {
            System.out.println("Лето");
        } else if (month > 8 && month <= 11) {
            System.out.println("Осень");
        }
    }

//Как запретить вводить строки в сканнер?

    public static void Task3() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }


    public static void Task4() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (-5 >= t && t > -20) {
            System.out.println("Нормально");
        } else if (-20 >= t) {
            System.out.println("Холодно");
        }
    }

    public static void Task5() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 1: {
                System.out.println("Красный");
                break;
            }
            case 2: {
                System.out.println("Оранжевый");
                break;
            }
            case 3: {
                System.out.println("Желтый");
                break;
            }
            case 4: {
                System.out.println("Зеленый");
                break;
            }
            case 5: {
                System.out.println("Голубой");
                break;
            }
            case 6: {
                System.out.println("Синий");
                break;
            }
            case 7: {
                System.out.println("Фиалетовый");
                break;
            }

        }
    }

    public static void Task6() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }


    public static void Task7() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }


    public static void Task8() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (x > 0 && (x % 1 == 0)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void Task9() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = x;
        while (x < 100 && x > 0) {
            x = x + y;
            if (x < 100) {
                System.out.println(x);
            }
        }

    }


    public static void Task10() {
        Scanner scanner = new Scanner(System.in);
        int x = -5;
        int y = x;
        for (int i = 0; i < 10; i++) {
            x = x + y;
            System.out.print(" " + x);
        }
    }


    public static void Task11() {
        int square;
        for (int i = 10; i <= 20; i++) {

            square = (int) Math.pow(i, 2);
            System.out.println(" " + square);
        }

    }


    public static void Task12() {
        int a = 0;
        int b = 1;
        int fi;

        for (int i = 0; i <= 11; i++) {
            fi = b;
            b = a + b;
            a = fi;

            System.out.println(fi);


        }
    }

    public static void Task13() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        float invcash = scanner.nextFloat();
        float sum = 0;
        for (int i = 0; i < m; i++) {
            sum = invcash + ((invcash / 100) * 7);
            invcash = sum;
        }
        System.out.println(sum);
    }


    public static void Task14() {
        int result;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println("\n");
        }
    }
}




















