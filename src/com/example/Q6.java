package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q6 {

    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("Daisy", "Rose", "Hyacinth", "Poppy");

//        List<String> stringList = Arrays.asList("E", "M", "I", "L", "Y");

        String stringWithMaxLength = stringList.stream().max(Comparator.comparingInt(String::length)).orElse("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < stringWithMaxLength.length(); i++) {
            for (int j = 0; j < stringList.size(); j++) {
                if (stringList.get(j).length() > i){
                    sb.append(stringList.get(j).charAt(i));
                }
//                try {
//                    sb.append(stringList.get(j).charAt(i));
//                } catch (Exception ex) {
//                }
            }
        }

        System.out.println(sb.toString());

    }

}






