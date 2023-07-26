package Seminar_2;

import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку ->");
        String input = in.nextLine();
        if (input.equals("")) throw new RuntimeException("Пустые строки вводить нельзя");
    }
}
