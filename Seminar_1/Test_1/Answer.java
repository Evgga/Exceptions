package Seminar_1;

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(array[10]);
    }

    public static void divisionByZero() {
        int result = 10 / 0;
        System.out.println(result);
    }

    public static void numberFormatException() {
        String result = "Привет";
        System.out.println(Integer.parseInt(result));
    }
}

