//Задача 1. Реализовать алгоритм сортировки слиянием
package JavaHw3;

import java.util.Arrays;
import java.util.Scanner;

public class JavaHw31 {
    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low)
            return;
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } 
            else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } 
            else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int length = iScanner.nextInt();
        int[] sortArr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите следующий элемент массива: ");
            int element = iScanner.nextInt();
            sortArr[i] = element;
        }
        iScanner.close();
        System.out.println(Arrays.toString(sortArr));
        mergeSort(sortArr, 0, sortArr.length - 1);
        System.out.println(Arrays.toString(sortArr));
    }
}
