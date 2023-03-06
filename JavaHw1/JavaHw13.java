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
        while(x < 1 || x > 5){
            System.out.println("Такого варианта нет, повторите ввод.\n"
                    + menuPrint());
            double r = numScan.nextDouble();
            x = r;
        }
        while (x != 5){
            System.out.println("Введите первое число: ");
            double n = numScan.nextDouble();
            System.out.println("Введите второе число: ");
            double m = numScan.nextDouble();
            while(x == 4 && m == 0){
                System.out.println("На ноль делить нельзя. Повторите ввод второго числа: ");
                double q = numScan.nextDouble();
                m = q;
            }
            System.out.println("Результат вычисления равен: " + calk(x, n, m) + ".");
            System.out.println(menuPrint());
            double g = numScan.nextDouble();
            x = g;
        }
        System.out.println("Работа завершена.");
        numScan.close();
    }
}