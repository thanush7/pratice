package com.spring;

import java.util.HashSet;
import java.util.Set;

public class Hashingprobeam {
    public static int findMinInteger(int[] arr) {
        int minInteger = Integer.MAX_VALUE;
        int minCollisions = Integer.MAX_VALUE;

        for (int x = 1; x <= 1000; x++) { // Adjust the upper limit as needed
            Set<Integer> modulusSet = new HashSet<>();

            for (int element : arr) {
                int modulus = element % x;

                if (modulusSet.contains(modulus)) {
                    break;
                }

                modulusSet.add(modulus);
            }

            if (modulusSet.size() < minCollisions) {
                minCollisions = modulusSet.size();
                minInteger = x;
            }
        }

        return minInteger;
    }

    public static void main(String[] args) {
        int[] myArray = {54,32,7,21,6};
        int result = findMinInteger(myArray);
        System.out.println(result);
    }
}
