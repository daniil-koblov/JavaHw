//Задача 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа.

package JavaHw3;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaHw32 {
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
        for(int i = arbitraryList.size() - 1; i >= 0; i--){
            if(arbitraryList.get(i) % 2 == 0){
                System.out.println("Этот номер удаляется т.к. он четный: " + arbitraryList.get(i));
                arbitraryList.remove(i);
            }
        }
        System.out.println("Список без четных чисел: " + arbitraryList);
    }
}
