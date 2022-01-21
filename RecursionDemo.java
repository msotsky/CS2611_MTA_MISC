//Maxime Sotsky
//Dr.Ricker
//COMP 2611 Assignment 1

/*
Clearly demonstrate the three Is (Intuition, Identify and Implement) in your solution for
each of the following problems. Your implementation should be housed in a class called
RecursionDemo. Set up a separate test class called RecursionDemoTest that contains a
main method from which you call your recursive methods for testing purposes. All
implementations must adhere to the Java coding standards posted on Moodle or they will
not be graded.
*/
import java.util.*;
public class RecursionDemo{
    /*
    3. Write a recursive method that accepts two arguments into parameters x and y. The
    method should return the value of x times y. Remember that multiplication can be
    performed as repeated addition as follows: 8 * 5 = 5+5+5+5+5+5+5+5

    Intution: Given the example "8 * 5 = 5+5+5+5+5+5+5+5" I realized that the highest controls the lower number.
              What i mean by this, is that the low number gets repeatedly added the high number amount of time.
              If i was to chose example 8 to get multiplied 5 times. The 8 will eventually be multiplied by 0,
              thus losing data. This is because one of the numbers must be deincremented by 1 each addition.
              So, its best to go with the larger number to be the one determing how many addition must be made.
    Identify: Addition problems are sub-problems of multiplication. Knowing this, everytime i add i must return
              That result and go on to the next addition until for example the number 5 gets added to itself 8 times.
    Implement:I had to determine a base case. Knowing that everything multiplied by 0 will be zero seemed like a good
              place to start. After my base case, I noticed i must determine which is the larger number between
              x and y for my intuition to work.

    */
    public static int mult(int x, int y){
        if (x == 0 || y == 0)
            return 0;
        else if (x >= y)
            return mult(x-1,y) + y;
        else
            return mult(x,y-1) + x;
    }
    /*
    4. Write a recursive method that accepts a string as its argument and prints the string in
    reverse order. 

    Intution: I cannot do anything to an empty string so i must consider that information.
              I must start at the end of the string.
    Identify: The sub-problem is finding a substring of the last character of the string.
              Then I need to find the next character sub-string going backwards.
    Implement: I need to keep track of when i am, so i added the n parameter that keeps track
               of how many times the function is called. With this information i could subtract the
               number of function calls to the length of the string since i will be going through the
               the string backwards.

    */
    public static String revStr(String str, int n){
        if (str.length() == 0 || n == str.length())
            return "";
        else{
            return str.substring(str.length() - (n + 1), str.length() - n) + revStr(str,n+1);
        }
    }
    /*
    5. A palindrome is any word, phrase, or sentence that reads the same forward and
    backward. Some well-known palindromes include:
    Able was I, ere I saw Elba
    A man, a plan, a canal, Panama
    Kayak
    Write a boolean method that uses recursion to determine whether a String argument is a
    palindrome. The method should return true if the argument reads the same forward and
    backward

    Intution: The length of the string is either odd or even so i need to keep in mind both those cases.
              palindromes are paralle so i need to go through the string in a symetrical way.
              So, i will need to go through the string from starting at the first and last character until i reach
              a middle. There is two kinds of middle since there is two different cases in my intuition.
              The first case if its an even string, i will need to compare all the characters but, for the second case
              if the string length is odd, there will be 1 character that doesn't really matter since it is between an
              even amount of characters on both sides.
    Identify: I must compare 2 characters / substrings at a time. Then call the function again with the left position
              incrementing while the right postion deincrements.
    Implement: The most difficult part was remembering that charAt() function sees the first character as postion 0 and
               the last character has length of the string minus 1. Otherwise, i will be comparing postion that
               do not exist. I had to also make if statements that checked whether i am getting at the end of my
               solution meaning, i am reaching the middle of the string.

    */
    
    public static boolean isPalindrome(String str, int n){
        if (str.length() == 0)
            return false;
        else if (str.length() % 2 == 0){
            if ( (n + 1 == str.length()/2) && (str.charAt(n) == str.charAt(str.length()- (n+1))) )
                return true;
            else if ( (n + 1 == str.length()/2) && (str.charAt(n) != str.charAt(str.length() - (n+1)) ))
                return false;
            else if (str.charAt(n) == str.charAt(str.length()- (n+1)))
                return isPalindrome(str,n+1);
            else
                return false;
        }
        else{
            if( (n - (str.length() - n) == 3) && (str.charAt(n) == str.charAt(str.length()- (n+ 1))) )
                return  true;
            else if ( ( n - (str.length() - n) == 3) && (str.charAt(n) != str.charAt(str.length() - (n+1)) ))
                return false ;
            else if (str.charAt(n) == str.charAt(str.length()- (n+1)))
                return isPalindrome(str,n+1);
            else
                return false;
        }
    }
    /*
    6. Write a method that uses recursion to count the number of times a given character
    occurs in an array of characters. 

    Intution: I am going to need to keep track of the index, so I will probably need an index parameter
              and increment it each function call. Going to need to make a comparison and add 1 to the return statement
              if the number i am looking for is in that position in the array. Otherwise, I will return the function to
              keep going without adding the one since its a different number at that particular index.
    Identify: I will need to check every single index in the array. So, will need to a comparison each time.
    Implement: I cannot do anything to an empty string since there is nothing i can compare by number with.
               My base case is if my index reaches the length of the array otherwise i will get an exception.
               There is 2 cases -> the number in that index is the number i am looking for which is when i need to
               add 1 to my return statement that will later be added when the base case is reached and the other case
               when its a different number, i would just increment my index and move on without adding anything to my return.

    */
    public static int numNum(int[] arr, int num, int index){
        if (arr.length == 0)
            return 0;
        if (index == arr.length)
            return 0;
        else{
            if (arr[index] == num)
                return numNum(arr,num,index+1) +1;
            else{
                return numNum(arr,num,index +1);
            }
        }
    }
}