
import java.util.Scanner;

public class JavaHw13 {
    static String menuPrint(){
        return "Это простой калькулятор.\n"
                + "Нажмите 1 для сложения,\n"
                + "Нажмите 2 для вычитания,\n"
                + "Нажмите 3 для умножения,\n"
                + "Нажмите 4 для деления,\n"
                + "Или нажмите 5 для завершения работы.";
    }
    static double calk(double n, double a, double b){
        double c = 0;
        if (n == 1){
            c = a + b;
        }
        if (n == 2){
            c = a - b;
        }
        if (n == 3){
            c = a * b;
        }
        if (n == 4){
            c = a / b;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        System.out.println(menuPrint());
        double x = numScan.nextDouble();
        System.out.println("Введите первое число: ");
        double n = numScan.nextDouble();
        System.out.println("Введите второе число: ");
        double m = numScan.nextDouble();
        while (x != 5){
            if(x > 0 && x < 5){
                System.out.println("Результат вычисления равен: " + calk(x, n, m) + ".");
                System.out.println(menuPrint());
                double g = numScan.nextDouble();
                x = g;
            }
            while(x < 1 || x > 5){
                System.out.println("Такого варианта нет. Повторите ввод,\n"
                        + "Нажав 1 для сложения,\n"
                        + "Нажав 2 для вычитания,\n"
                        + "Нажав 3 для умножения,\n"
                        + "Нажав 4 для деления,\n"
                        + "Или нажав 5 для завершения работы.");
                double r = numScan.nextDouble();
                x = r;
            }
        }
        System.out.println("Работа завершена.");
        numScan.close();
    }
}