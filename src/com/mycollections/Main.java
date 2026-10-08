/**
 *  Java program to create, update, and delete HashMap.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Map<Double, Long> myMap = new HashMap<>();

        // Add.
        myMap.put(2.1, 1234567890L);
        myMap.put(6.8, 987654321L);
        myMap.put(9.5, 2000000000L);
        myMap.put(3.6, 76543211234567L);
        myMap.put(7.6, 7777777777777L);

        // Read.
        System.out.println(myMap); // Output: {3.6=76543211234567, 9.5=2000000000, 6.8=987654321, 7.6=7777777777777,
                                   // 2.1=1234567890}

        // Update.
        myMap.put(4.2, 44444444444444L);
        myMap.replace(3.6, 5555555555555L);

        // Delete.
        myMap.clear();

    }
}