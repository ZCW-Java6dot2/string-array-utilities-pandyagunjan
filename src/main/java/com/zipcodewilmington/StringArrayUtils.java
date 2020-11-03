package com.zipcodewilmington;

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

        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
     //   reverse(array);
      return Arrays.equals(reverse(array) , array);

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
     /*   StringBuilder storeString = new StringBuilder();
        for (int i = 0; i < array.length ; i++) {
            storeString.append(array[i]);
        }
      //  sort(array);
        String sortString = storeString.toString().trim();
        for (String s:array){

        }
       // sortString.replaceAll("\\s " ,"");
*/
        return false;
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

         int arrayLength= array.length;
        String[] storeAltered= new String[20];
        int j=0;
        for (int i = 0; i < arrayLength ;) {
            if (array[i] == array[i + 1])
            {
                storeAltered[j] = array[i];
            j++;
            i++;
        }
            else {
                storeAltered[j] = array[i+1];
                i++;
            }

        }
        return storeAltered;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
