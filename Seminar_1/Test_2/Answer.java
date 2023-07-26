package Seminar_1.Test_2;

class Answer {
    public int[] subArrays(int[] a, int[] b){
        int[] c = {0};
        if (a.length != b.length) return c;
        c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
}
