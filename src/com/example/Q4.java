package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {

    public static void main(String[] args) {

        int height = 2;
        int[] a = new int[]{1, 3, 1, 3, 3};
//        int[] a = new int[]{2, 3, 1, 1, 1};

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());

        List<List<Integer>> arrayOfArrays = new ArrayList<>();

        Integer maxRow = Math.round(sumElementsInArray(aList) / height);

        List<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < aList.size(); i++) {
            if (sumElementsInArray(newArray) >= maxRow){
                arrayOfArrays.add(newArray);
                newArray = new ArrayList<>();
                newArray.add(aList.get(i));
            }else {
                newArray.add(aList.get(i));
            }
        }

        arrayOfArrays.add(newArray);

        List<Integer> sums = new ArrayList<>();

        for (int i = 0; i < arrayOfArrays.size(); i++) {
            sums.add(sumElementsInArray(arrayOfArrays.get(i)));
        }

        System.out.println(arrayOfArrays);
        System.out.println(getMaximum(sums));

    }


    static int sumElementsInArray(List<Integer> arr) {
        int res = 0;
        for (Integer integers : arr) {
            res += integers;
        }
        return res;
    }


    static int getMaximum(List<Integer> arr) {
        return arr
                .stream()
                .mapToInt(v -> v)
                .max().orElse(0);

    }

}






