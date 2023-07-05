package com.company;

public class merge
{
          public static void sort(int[] arr, int k) {
                if (arr == null || arr.length < 2) {
                    return;
                }
                int n = arr.length;
                int[] temp = new int[n];
                sortHelper(arr, temp, 0, n - 1, k);
            }

            private static void sortHelper(int[] arr, int[] temp, int left, int right, int k) {
                if (left >= right) {
                    return;
                }
                int size = right - left + 1;
                int mid = left + (size / (2 * k)) * k - 1;
                int i;
                for (i = 0; i < k - 1; i++) {
                    int subLeft = left + i * (size / k);
                    int subRight = left + (i + 1) * (size / k) - 1;
                    sortHelper(arr, temp, subLeft, subRight, k);
                }
                sortHelper(arr, temp, mid + 1, right, k);
                merge(arr, temp, left, mid, right);
            }

            private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
                int i = left;
                int j = mid + 1;
                int k = left;
                while (i <= mid && j <= right) {
                    if (arr[i] <= arr[j]) {
                        temp[k++] = arr[i++];
                    } else {
                        temp[k++] = arr[j++];
                    }
                }
                while (i <= mid) {
                    temp[k++] = arr[i++];
                }
                while (j <= right) {
                    temp[k++] = arr[j++];
                }
                for (i = left; i <= right; i++) {
                    arr[i] = temp[i];
                }
            }

            public static void main(String[] args) {
                int[] arr = {5, 4, 3, 2, 1};
                sort(arr, 2);
                for (int i : arr) {
                    System.out.print(i + " ");
                }
            }
        }