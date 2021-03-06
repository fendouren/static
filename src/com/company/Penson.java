package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author qinyadong
 * @create 2021-02-18 14:49
 */
public class Penson {

    public static void main(String[] args) {
//
//        String[] arr = {"我","爱","你","爸"};
//
//        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
//            String temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

//        int[] arr = {12,32,1544,-457,48,458,457,458};
//        int i = 4589;
//        int max = getMax(arr, i);
//        System.out.println(max);

        int[] arr = {12,32,1544,-457,48,458,457,458};

        Arrays.sort(arr);
        String s = Arrays.toString(arr);
        System.out.println(s);
        ArrayTool.showArr(arr);
        System.out.println("--------------");
        int[] reserve = ArrayTool.reserve(arr);
        ArrayTool.showArr(reserve);
        int max = ArrayTool.getMax(arr);
        System.out.println("max =" +max);
        int min = ArrayTool.getMin(arr);
        System.out.println(min + "-----------");

        int a = 0;
        int b = 1;
        int[] ints = ArrayTool.enchange(arr, a, b);
        ArrayTool.showArr(ints);

    }
    public static int getMax(int[] arr,int b){
        for (int j = 0; j < arr.length; j++) {
            if (b == arr[j]){
                return j;
            }

        }
        return -1;
    }
}
