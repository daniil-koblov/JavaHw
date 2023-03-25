package JavaHw6;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaHw61 {
    public static void main(String[] args) throws Exception {
        
        JavaHw6Laptop laptop1 = new JavaHw6Laptop("Lenovo IdealPad 5", 8, 
        256, "Windows 11", "синий", 15.6);
        JavaHw6Laptop laptop2 = new JavaHw6Laptop("Honor MagicBook 16", 16, 
        512, "без ОС", "серый", 16.1);
        JavaHw6Laptop laptop3 = new JavaHw6Laptop("Apple MacBook Air 13", 8, 
        256, "MacOs", "золотистый", 13.3);
        JavaHw6Laptop laptop4 = new JavaHw6Laptop("HP 250 G7", 4, 
        1024, "без ОС", "черный", 15.6);
        JavaHw6Laptop laptop5 = new JavaHw6Laptop("Xiomi RedmiBook 15", 8, 
        256, "Windows 11", "серый", 15.6);
        JavaHw6Laptop laptop6 = laptop1;

        Set<JavaHw6Laptop> unicLaptop = new HashSet<JavaHw6Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
        unicLaptop.add(laptop6);
        System.out.println(laptop1.equals(laptop6));
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicLaptop.size());
        

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("объем накопителя: ");
        int storUser = sc.nextInt();
        
        System.out.println("диагональ");
        double digUser = sc.nextDouble();
        
        for(JavaHw6Laptop lap: unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
        
    }
}