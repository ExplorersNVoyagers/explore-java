package com.av.collections;

public class ExploreArray {
    public void init(){
        System.out.println("HI");
        int[] numbers = new int[]{1,2,3,4,5,6,7} ;

        for(int i =0;i<numbers.length;i++){
            System.out.println(numbers[++i]);
        }
    }
}
