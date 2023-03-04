// Задача 1. Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n).

import java.util.Scanner;

public class JavaHw11 {
    static int factorial(int n){
        if(n == 0) {
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
    static int triangle(int n){
        if(n == 0) {
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return n + triangle(n - 1);
        }
    }
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        System.out.print("Введите число, которые будет n-ым треугольным и факториалом: ");
        int x = numScan.nextInt();
        numScan.close();
        System.out.print("Результат расчета: " + triangle(x) + ", " + factorial(x) + ".");
    }
}