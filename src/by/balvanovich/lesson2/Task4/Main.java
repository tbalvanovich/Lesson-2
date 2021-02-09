package by.balvanovich.lesson2.Task4;

import com.sun.javaws.IconUtil;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
            int a = 123456;
            int b = a;
            int count = 0;

            while (b > 0) {
                count++;
                b = b / 10;
            }
            int mass[] = new int[count];
            for (int i = 0; i < count; i++) {
                mass[i] = a % 10;
                a = a / 10;
                System.out.print(mass[i]);
            }
}
    }
