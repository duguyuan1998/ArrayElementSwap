package com.duguyuan;

import java.util.Scanner;

public class ArrayElementSwap {

    /**
     * 交换数组元素的方法
     */
    public static void arraySwap(int[] array) {
        int length = array.length - 1;
        int loopCount = array.length / 2;
        for (int i = 0; i < loopCount; i++) {
            array[i] = array[i] ^ array[length - i];
            array[length - i] = array[i] ^ array[length - i];
            array[i] = array[i] ^ array[length - i];
        }
    }

    /**
     * 输出数组全部元素的方法
     */
    public static void arrayPrint(int[] array) {
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print("," + array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] array_str = input.split(",");
        int[] array = new int[array_str.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(array_str[i]);
        }
        arraySwap(array);
        arrayPrint(array);
        in.close();
    }
}
