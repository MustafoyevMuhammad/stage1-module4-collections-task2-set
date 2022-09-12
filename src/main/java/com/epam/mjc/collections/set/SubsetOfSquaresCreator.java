package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> result = new TreeSet<Integer>();
        for (Integer number : sourceList) {
            if(number * number >= lowerBound && number * number <= upperBound)
                result.add(number * number);    
        }


        return result;
    }
}
