//Задача 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package JavaHw3;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaHw33 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длинну списка: ");
        int length = iScanner.nextInt();
        ArrayList<Integer> arbitraryList = new ArrayList<Integer>();
        for(int i = 0; i < length; i++){
            System.out.print("Введите добавляемый элемент в список: ");
            int addNum = iScanner.nextInt();
            arbitraryList.add(addNum);
        }
        iScanner.close();
        System.out.println("Полный список чисел: " + arbitraryList);
        
    }
}
