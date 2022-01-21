//Maxime Sotsky
//Dr.Ricker
//COMP 2611 Assignment 1
import java.util.*;
public class RecursionDemoTest{

    public static void main(String args[]){
        //Testing multiplication function
        System.out.println("8 * 5 = " + RecursionDemo.mult(8,5));
        System.out.println("10 * 10 = " + RecursionDemo.mult(10,10));
        System.out.println("9 * 10 = " + RecursionDemo.mult(9,10));
        System.out.println("10 * 9 = " + RecursionDemo.mult(10,9));
        System.out.println("0 * 0 = " + RecursionDemo.mult(0,0));
        System.out.println("1 * 0 = " + RecursionDemo.mult(1,0));
        System.out.println("0 * 1 = " + RecursionDemo.mult(0,1));
        System.out.println("11 * 4 = " + RecursionDemo.mult(11,4));
        //Testing reverse string function
        System.out.println("Reverse hello: " + RecursionDemo.revStr("hello",0));
        System.out.println("Reverse max: " + RecursionDemo.revStr("max",0));
        System.out.println("Reverse computer science: " + RecursionDemo.revStr("computer science",0));
        //Testing palindrome function
        System.out.println("Palindrome hannah (true): " + RecursionDemo.isPalindrome("hannah",0));
        System.out.println("Palindrome terret (true): " + RecursionDemo.isPalindrome("terret",0));
        System.out.println("Palindrome 123456 (false): " + RecursionDemo.isPalindrome("123456",0));
        System.out.println("Palindrome hello (false): " + RecursionDemo.isPalindrome("hello",0));
        System.out.println("Palindrome racecar (true): " + RecursionDemo.isPalindrome("racecar",0));
        System.out.println("Palindrome racecat (false): " + RecursionDemo.isPalindrome("racecat",0));
        //Testing how many times a number is in an array
        int[] arr = {1,2,3};
        int[] arr1 = {1,1,1};
        int[] arr2 = {1,2,11,23,12,1,3,4,11,34,43,22,11,234,3};
        int[] arr3 = {1};
        int[] arr4 = {};
        int[] arr5 = {5,4,3,4,3,3,5};
        System.out.println("How many 1s in {1,2,3}: " + RecursionDemo.numNum(arr,1,0));
        System.out.println("How many 1s in {1,1,1}: " + RecursionDemo.numNum(arr1,1,0));
        System.out.println("How many 11s in {1,2,11,23,12,1,2,4,11,34,43,22,11,234,3}: " + RecursionDemo.numNum(arr2,11,0));
        System.out.println("How many 1s in {1}: " + RecursionDemo.numNum(arr3,1,0));
        System.out.println("How many 0s in {}: " + RecursionDemo.numNum(arr4,0,0));
        System.out.println("How many 5s in {5,4,3,4,3,3,5}: " + RecursionDemo.numNum(arr5,5,0));


        

    }
}