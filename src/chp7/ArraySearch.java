package chp7;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String []args){
        ArraySearch r= new ArraySearch();

        Random m= new Random();
        //defining an array
        int arr[]=new int[6];
        //putting a random numbers in the array& print them


        int numtosearch;
        for(int p=0;p<arr.length;p++){
        do{
            numtosearch=m.nextInt(1,7);
        }while(r.search(arr,numtosearch));
       arr[p]=numtosearch;

    }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

public boolean search(int[]arr,int numtosearch) {
    for (int val : arr) {

        if (val == numtosearch) {
            return true;
        }}
    return false;}}
