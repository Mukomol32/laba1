package odessa;

import java.util.Scanner;

public class Main {
    static void task32() {
        System.out.println("task32");
        /**
         Дано вещественное число x.
         Вычислить (x-1)*(x-3)*(x-7)..(x-63)/(x-2)*(x-4)*(x-8)..(x-64)
         */
        Scanner in = new Scanner(System.in);
        double x;
        double a = 1;
        double b = 1;
        double c;
        System.out.print("Enter x: ");
        x = in.nextInt();
            for(int i=1;i<=63;i+=2) {
                a*= x-i;
                b*= x-i-1;
            }
                 c = a / b;
                    System.out.print(c);
    }

    static void task57() {
        System.out.println("task57");
        /**
         Вычислить сумму 1-1/2+1/3-...+((-1)^n+1)*1/n
         Условную инструкцию и операцию возведения в степень не использовать.
         */
        Scanner in = new Scanner(System.in);
        double S = 0;
        int i;
        int n;
        System.out.print("Введите n, n>0");
        n = in.nextInt();
        for (i = 1; i <= n; i = i + 2) {
            S = S + (-1) * (1.0 / i);
        }
        for (i = 2; i <= n; i = i + 2) {
            S = S + (1.0 / i);
        }
        System.out.print(S);
    }

    static void task82() {
        System.out.println("task82");
        /**
         Даны натуральное число n и вещественные числа а1, a2, …, аn.
         Определить сумму этих чисел.
         */
        Scanner in = new Scanner(System.in);
        int i;
        int n;
        double S = 0;
        double a;
        System.out.print("Введите n");
        n = in.nextInt();
        for (i = 1; i <= n; ++i) {
            System.out.print("Введите a" + i + ": ");
            a = in.nextInt();
            S += a * a;
        }
        System.out.print(S);
    }

    static void task107() {
        System.out.println("task107");
        /**
         У гусей и кроликов вместе 64 лапы.
         Сколько может быть кроликов и гусей (указать все сочетания)?
         */
        Scanner in = new Scanner(System.in);
        int g;
        int k;
        for (k = 0; k<=16; k++) {
            for (g = 0; g<=32; g++){
                if (k * 4 + g * 2 == 64) {
                    System.out.print(" \nКроликов: " + k + " \nГусей: " + g);
                }
            }

        }
    }

    static void task132() {
        System.out.println("task132");
        /**
         Определить пары натуральных чисел а < 100 и b < 100,
         произведение которых в 10 раз больше их суммы.
         Сколько таких пар?
         */
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        for (a=1; a<100;a++){
            for (b=1; b<100;b++){
                if (a * b == 10 * (a + b)) {
                    System.out.println(a +" "+ b);
                }
            }
        }
    }


    public static void main(String[] args) {
	    task32();
        task57();
        task82();
        task107();
        task132();
    }
}
