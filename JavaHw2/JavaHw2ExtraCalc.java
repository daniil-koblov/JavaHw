// Доп. задача. К калькулятору из предыдущего дз добавить логирование.
package JavaHw2;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.logging.FileHandler;

public class JavaHw2ExtraCalc {
    static String menuPrint(){
        return "Нажмите 1 для сложения,\n"
                + "Нажмите 2 для вычитания,\n"
                + "Нажмите 3 для умножения,\n"
                + "Нажмите 4 для деления,\n"
                + "Или нажмите 5 для завершения работы.";
    }
    static double calculator(double v, double a, double b){
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
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(JavaHw22.class.getName());
        FileHandler fh = new FileHandler("logJavaHw2ExtraCalc.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Work calculator");
        Scanner numScan = new Scanner(System.in);
        System.out.println("Это простой калькулятор.\n" + menuPrint());
        double optionNum = numScan.nextDouble();
        while(optionNum < 1 || optionNum > 5){
            System.out.println("Такого варианта нет, повторите ввод.\n"
                    + menuPrint());
            optionNum = numScan.nextDouble();
        }
        while (optionNum != 5){
            System.out.println("Введите первое число: ");
            double firstNum = numScan.nextDouble();
            System.out.println("Введите второе число: ");
            double secondNum = numScan.nextDouble();
            while(optionNum == 4 && secondNum == 0){
                System.out.println("На ноль делить нельзя. Повторите ввод второго числа: ");
                secondNum = numScan.nextDouble();
            }
            System.out.println("Результат вычисления равен: " + calculator(optionNum, firstNum, secondNum) + "." + "\n");
            System.out.println(menuPrint());
            optionNum = numScan.nextDouble();
        }
        System.out.println("Работа завершена.");
        numScan.close();
    }
}
