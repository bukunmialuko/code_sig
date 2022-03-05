package com.example;

public class Q2 {

    public static void main(String[] args) {

//        int k = 31;
//        int[] a = new int[]{1, 2, 3};
//        int[] b = new int[]{1, 2, 3};

        int k = 743;
        int[] a = new int[]{16, 1, 4, 2, 14};
        int[] b = new int[]{7, 11, 2, 0, 15};

        int res = solution(k, a, b);
        System.out.println(res);

    }


    static int solution(int k, int[] a, int[] b) {
        int res = 0;
//        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            String x = String.valueOf(a[i]);
            String y = String.valueOf(b[(a.length - 1) - i]);
            String xy = x+y;
//            System.out.println(xy);
            if(Integer.parseInt(xy) < k){
                res++;
            }
        }
        return res;
    }


}
