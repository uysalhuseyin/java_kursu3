package Tekrar.Enum.Ornek3;

import Gun30.Paket1.PublicErisim;

import java.util.ArrayList;
import java.util.Scanner;

public class Orderpizza {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Pizza> order=new ArrayList<>();
        int chose;
        do {

            menu();
            chose= scan.nextInt();

            switch (chose){
                case 1:Pizza p=new Pizza(Pizzasize.Small);
                order.add(p); break;
                case 2:Pizza p1=new Pizza(Pizzasize.Medium);
                order.add(p1); break;
                case 3:Pizza p2=new Pizza(Pizzasize.large);
                order.add(p2);break;
                case 4:PrintOrder(order); break;

            }




        }while (chose<=4);

    }



    public static void menu(){

        System.out.println("***** PIZZA MENU *****");

        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4- Take Order");
        System.out.println("5- Exit");
        System.out.println("Order has been taken");

    }

    public static void PrintOrder(ArrayList<Pizza> order){

        int smallcnt=0;
        int mediumcnt=0;
        int largecnt=0;
        for (Pizza p:order
             ) {
            if (p.size==Pizzasize.Small)smallcnt++;
            if (p.size==Pizzasize.Medium)mediumcnt++;
            if (p.size==Pizzasize.large)largecnt++;


        }
        System.out.println("Small Pizza = " + smallcnt);
        System.out.println("Medium Pizza = " + mediumcnt);
        System.out.println("Large Pizza = " + largecnt);
    }

}
