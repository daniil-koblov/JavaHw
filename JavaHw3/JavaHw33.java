//Задача 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package JavaHw3;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaHw33 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длинну списка: ");
        int length = iScanner.nextInt();
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for(int i = 0; i < length; i++){
            System.out.print("Введите добавляемый элемент в список: ");
            int addNum = iScanner.nextInt();
            integerList.add(addNum);
        }
        iScanner.close();
        System.out.println("Полный список чисел: " + integerList);
        int minNum = integerList.get(0);
        int maxNum = integerList.get(0);
        int middle = 0;
        for(int i = integerList.size() - 1; i >= 0; i--){
            if(integerList.get(i) < minNum){
                minNum = integerList.get(i);
            }
            if(integerList.get(i) > maxNum){
                maxNum = integerList.get(i);
            }
            middle = middle + integerList.get(i);
        }
        middle = middle / 2;
        System.out.println("Минимальное число равно " + minNum + ", максимальное " + maxNum + ", а среднее " + middle);
    }
}