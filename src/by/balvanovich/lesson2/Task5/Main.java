package by.balvanovich.lesson2.Task5;

public class Main {
    public static void main(String[] args) {
        int numb = 1231;
        int a = numb;
        int count = 0;
        while (a > 0){
            a = a/10;
            count++;
        }
        int mass[] = new int[count];
        for (int i = 0; i < count; i++) {
            mass[i] = numb % 10;
            numb = numb / 10;
        }
        boolean n = false;
        for (int i = 0; i < count; i++)
            for (int x = 0; x <count; x++){
                if (mass[i] == mass[x] && i != x) {
                    n = true;


                }
            }
        if (n == true)
        System.out.println("Не все цифры уникальны");
        else
            System.out.println("Все цифры уникальны");

    }
}
