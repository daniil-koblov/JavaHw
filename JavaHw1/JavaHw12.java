//Задача 2. Вывести все простые числа от 1 до 1000
import java.util.Scanner;

public class JavaHw12 {
    static int prime(int n){
        int count = 0;
        for(int i = 1; i < n + 1; i++){
            if (n % i == 0){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        System.out.print("Введите число, которые будет проверено на простоту: ");
        int x = numScan.nextInt();
        while(x < 1){
            System.out.print("Введенное число для проверки должно быть больше нуля. Повторите ввод: ");
            int b = numScan.nextInt();
            x = b;
        }
        numScan.close();
        if(prime(x) > 2){
            System.out.print("Число " + x + " не является простым.");
        }
        else{
            System.out.print("Число " + x + " является простым.");
        }
    }
}