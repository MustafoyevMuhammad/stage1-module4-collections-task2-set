package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        int size = sourceList.size();
        HashSet<Integer> list = new HashSet<Integer>();
        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                while (number % 2 == 0) {
                    list.add(number);
                    number /= 2;
                    if (number == 1)
                        list.add(number);
                }
            } else {
                list.add(number);
                list.add(number * 2);
            }
        }
        return list;
    }
}
