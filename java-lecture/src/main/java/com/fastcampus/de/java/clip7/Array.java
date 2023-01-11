package com.fastcampus.de.java.clip7;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        int [] intArray = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(intArray));

        String[] stringEmtyArray = new String[5];
        System.out.println(Arrays.toString(stringEmtyArray));
    }
}
