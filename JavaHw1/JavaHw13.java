// РАБОТА НАД ОШИБКАМИ.
// Задача 3. Реализовать простой калькулятор.
import java.util.Scanner;

public class JavaHw13 {
    static String menuPrint(){
        return "Нажмите 1 для сложения,\n"
                + "Нажмите 2 для вычитания,\n"
                + "Нажмите 3 для умножения,\n"
                + "Нажмите 4 для деления,\n"
                + "Или нажмите 5 для завершения работы.";
    }
    static double calk(double v, double a, double b){
        double c = 0;
        if (v == 1){
            c = a + b;
        }
        if (v == 2){
            c = a - b;
        }
        if (v == 3){
            c = a * b;
        }
        if (v == 4){
            c = a / b;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        System.out.println("Это простой калькулятор.\n" + menuPrint());
        double x = numScan.nextDouble();
        while(x < 1 || x > 5){                                                      // КОМЕНТАРИЙ К ИСПРАВЛЕНИЮ.
            System.out.println("Такого варианта нет, повторите ввод.\n"             // Убран ввод доп. переменных: 
                    + menuPrint());                                                 // r = numScan.nextDouble();
            x = numScan.nextDouble();                                               // x = r;
        }                                                                           // double q = numScan.nextDouble();
        while (x != 5){                                                             // m = q;
            System.out.println("Введите первое число: ");                        // double g = numScan.nextDouble();
            double n = numScan.nextDouble();                                        // x = g;
            System.out.println("Введите второе число: ");                        // Они были в 34 и 35, 44 и 45, 49 и 50 строках.
            double m = numScan.nextDouble();                                        // Предыдущего варианта.
            while(x == 4 && m == 0){
                System.out.println("На ноль делить нельзя. Повторите ввод второго числа: ");
                m = numScan.nextDouble();
            }
            System.out.println("Результат вычисления равен: " + calk(x, n, m) + "." + "\n");
            System.out.println(menuPrint());
            x = numScan.nextDouble();
        }
        System.out.println("Работа завершена.");
        numScan.close();
    }
}