package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        int size = sourceList.size();
        List<Integer> list = (List<Integer>) new HashSet<Integer>();
        int temp, k;
        for (int i = 0; i < size; i++) {
            temp = sourceList.get(i);
            while (Math.abs(temp) != 1){
                k = temp + temp / 2;
                sourceList.set(i,k);
                temp /= 2;
            }
        }
        return (HashSet<Integer>) sourceList;
    }
}
