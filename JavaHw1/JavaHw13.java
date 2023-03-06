
import java.util.Scanner;

public class JavaHw13 {
    static double calk(double n){
        double c = 0;
        if (n == 1){
            Scanner numScan = new Scanner(System.in);
            System.out.print("Введите первое слагаемое: ");
            double a = numScan.nextDouble();
            System.out.print("Введите второе слагаемое: ");
            double b = numScan.nextDouble();
            numScan.close();
            c = a + b;
        }
        if (n == 2){
            Scanner numScan = new Scanner(System.in);
            System.out.print("Введите уменьшаемое: ");
            double a = numScan.nextDouble();
            System.out.print("Введите вычитаемое: ");
            double b = numScan.nextDouble();
            numScan.close();
            c = a - b;
        }
        if (n == 3){    
            Scanner numScan = new Scanner(System.in);      
            System.out.print("Введите первый множитель: ");
            double a = numScan.nextDouble();
            System.out.print("Введите второй множитель: ");
            double b = numScan.nextDouble();
            numScan.close();
            c = a * b;
        }
        if (n == 4){   
            Scanner numScan = new Scanner(System.in);        
            System.out.print("Введите уменьшаемое: ");
            double a = numScan.nextDouble();
            System.out.print("Введите вычитаемое: ");
            double b = numScan.nextDouble();
            numScan.close();
            c = a / b;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner numScan = new Scanner(System.in);
        System.out.println("Это простой калькулятор.\n"
                        + "Нажмите 1 для сложения,\n"
                        + "Нажмите 2 для вычитания,\n"
                        + "Нажмите 3 для умножения,\n"
                        + "Нажмите 4 для деления,\n"
                        + "Или нажмите 5 для завершения работы.");
        double x = numScan.nextInt();
        while (x != 5){
            if(x > 0 && x < 5){
                System.out.println("Результат вычисления равен: " + calk(x) + ".");;
            }
            while(x < 1 || x > 5){
                System.out.println("Такого варианта нет. Повторите ввод,\n"
                        + "Нажав 1 для сложения,\n"
                        + "Нажав 2 для вычитания,\n"
                        + "Нажав 3 для умножения,\n"
                        + "Нажав 4 для деления,\n"
                        + "Или нажав 5 для завершения работы.\n");
                double r = numScan.nextInt();
                x = r;
            }
        }
        System.out.println("Работа завершена.");
        numScan.close();
    }
}