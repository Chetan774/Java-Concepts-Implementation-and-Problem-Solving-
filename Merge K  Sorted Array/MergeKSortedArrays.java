package com.company.daaaaaaaaaaaaa;

import java.util.Scanner;

import java.util.*;

public class MergeKSortedArrays {
    public static int[] mergeKArrays(int[][] arrays) {
        // Create a min-heap and initialize it with the first element from each array
        PriorityQueue<ArrayContainer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > 0) {
                minHeap.offer(new ArrayContainer(arrays[i][0], i, 0));
            }
        }

        List<Integer> mergedList = new ArrayList<>();

        // Merge the arrays by repeatedly extracting the minimum element from the min-heap
        while (!minHeap.isEmpty()) {
            ArrayContainer current = minHeap.poll();
            mergedList.add(current.value);

            int arrayIndex = current.arrayIndex;
            int elementIndex = current.elementIndex;

            // Move to the next element in the current array
            if (elementIndex + 1 < arrays[arrayIndex].length) {
                minHeap.offer(new ArrayContainer(arrays[arrayIndex][elementIndex + 1], arrayIndex, elementIndex + 1));
            }
        }

        // Convert the merged list to an array
        int[] mergedArray = new int[mergedList.size()];
        for (int i = 0; i < mergedArray.length; i++) {
            mergedArray[i] = mergedList.get(i);
        }

        return mergedArray;
    }

    private static class ArrayContainer implements Comparable<ArrayContainer> {
        int value;
        int arrayIndex;
        int elementIndex;

        public ArrayContainer(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }

        @Override
        public int compareTo(ArrayContainer other) {
            return Integer.compare(this.value, other.value);
        }
    }

    public static void main(String[] args) {
        int[][] arrays = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int[] mergedArray = mergeKArrays(arrays);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}

