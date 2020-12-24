package com.zipcodewilmington;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
     /*   int counter=0;
        for(int i=0 ;i < array.length ;i++)
        {
            if(array[i].contains(value))
                counter++;
        }
        return counter==0 ? false:true; */

        for (String s : array) {
            if (s == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int lengthA = array.length;

        String[] reverseArray = new String[lengthA];
        int j=0;
        for(int i=array.length-1 ;i >=0  ;i--)
        {
           reverseArray[j]=array[i];
           j++;
        }
       // reverseArray.equals(array);
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        //Method one , use reverse method from above and check if Arrays.equals()
        //String[] reversedArray = reverse(array);
        //return Arrays.equals(reversedArray,array);


        //Method 2 , use Arrays,equal and reverse in build method to check if they are equal
        //  return Arrays.equals(reverse(array) , array);


        //Method 3 - to work with same array and divide by half to see if its same from left-right and right-left
        Boolean flag=true;
        int n=array.length;
        for(int i=0;i< n/2 ;i++)
        {
            if(array[i] != array[n-1-i])
            {
                flag = false;
                break;
            }
        }
        return flag;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {


        StringBuilder storeString = new StringBuilder();
        for (int i = 0; i < array.length ; i++) {
            storeString.append(array[i]);
        }

        String sortString = storeString.toString().replaceAll(" ","");
        char[] storeAltered = new char[sortString.length()];
        int j=1;
        char[] chars=sortString.toLowerCase().toCharArray();
        Arrays.sort(chars);

        storeAltered[0]=chars[0];
        for (int i = 1; i < chars.length ;i++) {
            if ( !(chars[i] == chars[i - 1])) {
                storeAltered[j] = chars[i];
                j++;
            }
        }
        String finalString=String.valueOf(storeAltered).trim();
        return finalString.equals("abcdefghijklmnopqrstuvwxyz");
        //return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
   int counter=0;
        for (String s : array) {
            if (s == value) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int arrayLength= array.length;
        String[] storeAltered= new String[arrayLength-1];
        int j=0;
        for (int i = 0; i < arrayLength ;) {
            if(array[i] == valueToRemove)
                i++;
            else {
                storeAltered[j] = array[i];
                j++;
                i++;
            }
        }
        return storeAltered;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String[] storeAltered= new String[array.length];
        int j=0;
        for (int i = 0; i < array.length ;i++) {
            if (i==0 || !array[i].equals(array[i - 1]) ) {
                storeAltered[j] = array[i];
                j++;
             }
        }
        String[] output = new String[j];
        for(int i = 0; i < j; i++){
            output[i] = storeAltered[i];
        }
        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] buffer = new String[array.length];
        String lastSeen = array[0];
        String stringToAdd = "";
        int outputLength = 0;


        for(int i = 0; i < array.length; i++){
            if (array[i].equals(lastSeen))
                stringToAdd += lastSeen;
            else {
                buffer[outputLength++] = stringToAdd;
                lastSeen = array[i];
                stringToAdd = array[i];
            }
        }
        buffer[outputLength++] = stringToAdd;

        //Creating output with the new size array based on result.
        String[] output = new String[outputLength];
        for(int i = 0; i < outputLength; i++){
            output[i] = buffer[i];
        }
        return output;
    }



}
