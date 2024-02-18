package com.arrayPractice;

public class AscendingOrder01 {

    public int[] ascendingOrder01 (int[] srr ) {

        for (int i =1 ; i<srr.length; i++) {

            for (int j =0; j<i ; j++){

                if (srr[i]<srr[j]){
                    int temp = srr[i];
                    srr[i]=srr[j];
                    srr[j]=temp;
                }
            }

        }
        return srr;
    }
}
