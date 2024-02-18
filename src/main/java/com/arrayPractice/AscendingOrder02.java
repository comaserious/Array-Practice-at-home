package com.arrayPractice;

public class AscendingOrder02 {

    public int[] ascendingOrder02 (int[] srr) {

        for(int i = 0 ; i < srr.length-1; i++){
            int min = i;
            for (int j =i+1 ; j < srr.length;j++){

                if (srr[min]>srr[j]){
                    min=j;
                }
            }
            int temp = srr[i];
            srr[i]=srr[min];
            srr[min]=temp;
        }
        return srr;
    }
}
