package com.pluralsight.choosing_right_collection.controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {


        System.out.println(  anagram("xbcde", "abcde"));

    }

   static  boolean anagram(String str1, String str2)
    {

        boolean result = false;
        if ( str1.length() != str2.length() )
            return false;
        if ( str1.equalsIgnoreCase(str2))
            return true;

        char[] array = str1.toCharArray();
        char[] array2 = str2.toCharArray();
//        Set<Character> set = new HashSet<>();
//        Set<Character> set2 = new HashSet<>();

        Map<Character,Integer> set = new HashMap<>();
        Map<Character,Integer> set2 = new HashMap<>();
        for( char c2 : array)
        { int value = 0;
            if (  set.get(c2) == null )
                value = 1;
            else
                value = set.get(c2)  + 1;

            set.put( c2, value);
        }
        int value = 0;
        for( char c3 : array2)
        {
//            set2.add(c3);
            if (  set2.get(c3) == null )
                value = 1;
            else
                value = set.get(c3)  + 1;
            set2.put( c3, value);

        }
       // set.put( c2, set.get(c2) + 1);
        boolean result4 = false;
        for ( Map.Entry<Character,Integer> char4: set2.entrySet())
        {
            if( ! (set2.get(char4.getKey()) == set.get(char4.getKey())))
                return false;
//            if( char4.getValue())
//            if ( !set.contains(char4) )
//                return false;
        }

        return true;
    }
}
