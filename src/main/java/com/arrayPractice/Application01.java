package com.arrayPractice;

public class Application01 {

    public static void main(String[] args) {

        int [] originArr = {4,112,22,1,5,11,29,9,2,45};

        AscendingOrder01 a1 = new AscendingOrder01();
        AscendingOrder02 a2 = new AscendingOrder02();
        AscendingOrder03 a3 = new AscendingOrder03();
        Application01 show = new Application01();

        int[] copyarr1 = a1.ascendingOrder01(originArr);
        show.showArray(copyarr1);

        System.out.println();

        int[] copyarr2 = a2.ascendingOrder02(originArr);
        show.showArray(copyarr2);

        System.out.println();

        int[] copyarr3 = a3.ascendingOrder03(originArr);
        show.showArray(copyarr3);





    }

    public void showArray (int[] srr) {

        for(int i = 0; i <srr.length;i++){

            System.out.print(srr[i]+" ");
        }
    }
}
