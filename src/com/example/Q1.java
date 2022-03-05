package com.example;

public class Q1 {

    public static void main(String[] args) {

        int n = 5;
        int[] a = new int[]{4, 0, 1, -2, 3};

        int[] b = solution(n, a);
        for (int x : b) {
            System.out.println(x);
        }

    }


///   b[i] = a[i - 1] + a[i] + a[i + 1]
    static int[] solution(int n, int[] a) {
        int[] b = new int[n];
        if (n == 0) {
            return b;
        }
        if (n == 1) {
            return a;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                b[i] = a[i] + a[i + 1];
                continue;
            }
            if (i + 1 >= n) {
                b[i] = a[i - 1] + a[i];
                continue;
            }

            b[i] = a[i - 1] + a[i] + a[i + 1];
        }
        return b;
    }


}
