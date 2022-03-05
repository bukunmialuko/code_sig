package com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{8, 5, 6, 16, 5};

        boolean[] b = solution(a, 1, 3);
        for (boolean x:
                b
             ) {
            System.out.println(x);
        }

    }


    static boolean[] solution(int[] a, int l, int r) {
        boolean[] b = new boolean[a.length];

        System.out.println(a.length);
        for (int i = 0; i < a.length; i++){

            ArrayList<Integer> results = new ArrayList<>();

            for (int j = Math.abs(l); i <= Math.abs(r); i++){
                results.add(j * a[i]);
            }

            if (results.contains(a[i])){
                b[i] = true;
            }else {
                b[i] = false;
            }
        }
        return  b;
    };




}
