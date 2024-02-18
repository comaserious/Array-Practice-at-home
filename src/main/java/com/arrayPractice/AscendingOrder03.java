package com.arrayPractice;

public class AscendingOrder03 {

    public int[] ascendingOrder03 (int[] srr) {

        for(int i = srr.length-1 ; i >0; i--){

            for (int j = 0 ; j <i-1 ; j++   ){

                if (srr[j] > srr[j+1]) {
                    int temp = srr[j];
                    srr[j] = srr[j+1];
                    srr[j+1]=temp;
                }

            }
        }


        return srr;
    }
}
