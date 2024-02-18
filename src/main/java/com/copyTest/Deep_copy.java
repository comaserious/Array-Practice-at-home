package com.copyTest;

import java.util.Arrays;

public class Deep_copy {

    public static void main(String[] args) {

        int[] originArr = {2,1,4,33,56,22,87,99,36,2342,334,1,144};

        /*for문을 이용한 복사*/

        int[] copyArr1 = new int[20];

        for(int i =0; i<originArr.length; i++){

            copyArr1[i]=originArr[i];
        }
        Deep_copy d = new Deep_copy();

        d.print(copyArr1);

        System.out.println();

        /*Object의 clone()을 이용한 복사*/

        int[] coppArr2 = originArr.clone();

        d.print(coppArr2);

        System.out.println();

        /*System의 arraycopy를 이용한 복사*/

        int[] copyArr3 = new int[16];

        System.arraycopy(originArr,0,copyArr3,1,originArr.length);

        d.print(copyArr3);

        System.out.println();

        /*Arrays의 copyOf()을 이용한 복사*/

        int[] copyArr4 = Arrays.copyOf(originArr,20 );

        d.print(copyArr4);









    }
    public void print (int[] srr){

        for(int i =  0; i<srr.length;i++){
            System.out.print(srr[i]+" ");
        }
    }




}
