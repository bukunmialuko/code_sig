package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {

    public static void main(String[] args) {


        int[] a = new int[]{10, 2};
//        int[] a = new int[]{8};

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<String> stringList = new ArrayList<>();


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                stringList.add(aList.get(i).toString() + aList.get(j).toString());
            }
        }

        System.out.println(stringList);


        Integer sum = 0;

        for (String s: stringList) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);

    }

}






