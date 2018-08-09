package com;

import javax.lang.model.util.ElementScanner6;
import java.util.ArrayList;

/*
给定一个数组，将数组中的0移动到数组最后
 */
public class Leetcode283 {
    public static void main(String[] args) {
        int[] test=new int[]{1,0,3,0,0,5};
        moveZeros2(test);
    }

    /**
     * 借助额外的数组空间
     * @param arr
     */
    private static void moveZeros1(int[] arr){
        int[] temp=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        for (int i=0;i<temp.length;i++) {
            System.out.print(temp[i]);
        }
    }

    /**
     * 不借助额外的数组空间
     * @param arr
     */
    private static void moveZeros2(int[] arr){
        int k=0;  //[0..k]这个区间是不包含0元素的。[k..i]这个区间的元素都为0
        for(int s=0;s<arr.length;s++){
            if (arr[s]!=0){
                arr[k]=arr[s];
                k++;
            }
        }
        for (int i=k;i<arr.length;i++){
            arr[i]=0;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

}
