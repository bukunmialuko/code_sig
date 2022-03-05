package com.example;

public class Q8 {

    public static void main(String[] args) {

        int l = 1;
        int r = 3;
        int[] a = new int[]{8, 5, 6, 16, 5};
        boolean[] b = solve(a, l, r);

        for (boolean b1 : b) {
            System.out.println(b1);
        }

    }


    public static boolean[] solve(int[] a, int l, int r) {
        boolean[] b = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            int modulus = a[i]%(i + 1);
            int x = a[i]/(i + 1);
            System.out.println(x);
            if (modulus == 0){
                if (l <= x && x <= r) {
                    b[i] = true;
                } else {
                    b[i] = false;
                }
            }else {
                b[i] = false;
            }
        }
        return b;
    }

}






