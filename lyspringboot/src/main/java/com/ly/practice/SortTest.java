package com.ly.practice;

import java.util.Arrays;

public class SortTest {

    /**
     * 冒泡
     *
     * @param a
     * @return
     */
        public static int[] sort(int[] a) {
            for (int i = 0; i < a.length; i++) {

                for (int j = i + 1; j < a.length; j++) {

                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }

                }

            }
            return a;
        }

    public static void main(String[] args) {

        int[] a = {9, 6, 4, 3, 5, 7, 8, 2, 2, 1};
//        sort(a);
//        System.out.println(Arrays.toString(sort(a)));
        insertSort(a);
        System.out.println(Arrays.toString(insertSort(a)));

    }

    public static int[] insertSort(int[] b) {
        for (int i = 1; i < b.length; i++) {
            for (int j = i; j > 0 && b[j] < b[j - 1]; j--) {

                int min = b[j];
                b[j] = b[j-1];
                b[j-1] = min;

            }
        }
        return b;
    }


}
