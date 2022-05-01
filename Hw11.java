package lesson11;

import java.util.Scanner;

public class Hw11 {

    public static double x;
    public static double y;


    public static void main(String[] args){

        // вызов основных потоков через статический метод
        toDo();
        toDo();
        toDo();

    }

    // метод для создания потока
    public static void toDo(){

        Thread th1 = new Thread(Hw11::ask);

        th1.start();
    }

    // метод ввода данных
    public synchronized static void ask() {
        System.out.println("Введите x ");
        Scanner sc1 = new Scanner(System.in);
         x = sc1.nextDouble();

        System.out.println("Введите y ");
        Scanner sc2 = new Scanner(System.in);
         y = sc2.nextDouble();

        System.out.println("In process...");

        // Имитация загрузки операции
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Math.pow(x, y));
    }
}