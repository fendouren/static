package com.company;

//实现单例模式的排序工具类，可以对指定数组进行排序。

/**
 * @author qinyadong
 * @create 2021-03-05 15:09
 */
public  class Sort {

    private Sort() {
    }

    ;


    public static void sortArr(int[] arr, int num) {

        int[] arr1 = {1, 20, 15, 15, 12, 56, 14854, 13};


        if (num == 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
//                       如果第一个数大于第二个数  把第一个数 往后面移动  升序排序
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else if (num == 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

        }
    }

}


