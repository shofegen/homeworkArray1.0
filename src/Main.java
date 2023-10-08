import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Задача 1 пример 1
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
//Задача 1 пример 2
        double[] number1 = {1.57, 7.654, 9.986};
//Задача 1 пример 3
        String[] fruits = new String[]{"apple", "banana", "mango"};
//Задача 2
        int i;
        for (i = 0; i < number.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(number[i]);
        }
        System.out.printf("\n");
        double a;
        for (a = 0; a < number1.length; a++) {
            if (a > 0) {
                System.out.print(", ");
            }
            System.out.print(number1[(int) a]);
        }
        System.out.printf("\n");
        double b;
        for (b = 0; b < fruits.length; b++) {
            if (b > 0) {
                System.out.print(", ");
            }
            System.out.print(fruits[(int) b]);
        }
        System.out.printf("\n");
//Задача 3
        int l = number.length - 1;
        for (; l>=0;l--) {
            System.out.print(number[l]);
            if (l > 0) {
                System.out.print(", ");
            }
            }
        System.out.printf("\n");
        int k = number1.length - 1;
        for (; k>=0;k--) {
            System.out.print(number1[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }
        System.out.printf("\n");
        int o = number1.length - 1;
        for (; o>=0;o--) {
            System.out.print(fruits[(int) o]);
            if (o > 0) {
                System.out.print(", ");
            }
        }
        System.out.printf("\n");
//Задача 4
        int u = 0;
        for (; u < number.length; u++) {
                number[u]++;
                if (u > 0) {
                    System.out.print(", ");
                }
                System.out.print(number[u]);
            number[1] = number[1] - 1;
            }
        }
    }
