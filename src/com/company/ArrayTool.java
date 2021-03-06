package com.company;

/**
 * @author qinyadong
 * @create 2021-03-01 20:43
 */
public class ArrayTool {

    private ArrayTool(){
        super();
    }

    /**
     * 封装一个展示数组内容的遍历
     * @param arr 外界传入的数组
     */
    public static void showArr(int[] arr){
        String s = "[";
        for (int i = 0;i < arr.length;i++){
            if (i == arr.length -1){
                s += arr[i] + "]";
            }else {
                s += arr[i] + ",";
            }
        }
        System.out.println(s);
    }

//    求取数组中的最大值的方法
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i=0;i< arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
//    求取数组中最小值的方法
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0 ;i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

//    数组元素的互换
    public static int[] enchange(int[] arr ,int a,int b){
        int temp = arr[a] ;
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
//    数组元素的反转
    public static int[] reserve(int[] arr){
        int temp ;
        for (int i =0,j=arr.length-1;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

}
