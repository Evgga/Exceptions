package Seminar_2;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        inHasNextFloat();
        inNextFloat();
    }
    public static void inHasNextFloat() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("->");
            if (in.hasNextFloat()) {
                System.out.println(in.nextFloat());
                break;
            }
            System.out.println("не число ");
        }
    }
    public static void inNextFloat() {
        Scanner in = new Scanner(System.in);
        System.out.print("->");
        String result = in.next();
        while (!inFloat(result)) {
            System.out.println("не число ");
            System.out.print("->");
            result = in.next();
        }
        System.out.println(result);
    }

    private static boolean inFloat(String num) {
        try {
            Float.parseFloat(num);
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }
}
