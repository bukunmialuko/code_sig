package com.example;

public class Q9 {

    public static void main(String[] args) {

//        String s = "ab12c";
//        String t = "1zz456";
//        System.out.println(solve(s, t));
        String s = "ab12c";
        String t = "ab24z";
        System.out.println(solve(s, t));
    }


    public static int solve(String s, String t) {
        int res = 0;

        for (int i = 0; i < countDigit(s); i++) {
            String left = removeNoOfDigits(s, i+1);
            if (!leftIsGreater(left,t)){
                res ++;
            }

        }

        for (int i = 0; i < countDigit(t); i++) {
            String right = removeNoOfDigits(t, i+1);
            if (!leftIsGreater(s,right)){
                res ++;
            }
        }

        return res;
    }

    public static int countDigit(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                res++;
            }
        }
        return res;
    }

    public static boolean leftIsGreater(String l, String r) {
        int x = l.compareTo(r);
        System.out.println(x);
        if (x < 0) {
            System.out.println("s < t");
            return false;
        } else if (x == 0) {
            System.out.println("s = t");
            return false;
        } else {
            System.out.println("s > t");
            return true;
        }
    }


    public static String removeNoOfDigits(String input, int count) {
        int ct = 0;
        char[] chars = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                ct++;
                if (count != ct) {
                    stringBuilder.append(c);
                }

            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}






