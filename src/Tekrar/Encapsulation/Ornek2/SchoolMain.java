package Tekrar.Encapsulation.Ornek2;

import java.util.Scanner;

public class SchoolMain {
    public static void main(String[] args) {
        School school1=new School("Borsa lisesi",3);

        Scanner scan=new Scanner(System.in);
        Scanner scanint=new Scanner(System.in);

        do {
            System.out.println("Write student name");
            String name= scan.nextLine();
            System.out.println("Write student surname");
            String surname= scan.nextLine();
            System.out.println("Write student age");
            int age= scan.nextInt();

            if (age<=15){
                Student student2=new Student(name,surname,age);
                school1.student1.add(student2);
            }

            System.out.println(school1.student1);


        }while (school1.student1.size()<=school1.getMaxStudent());

    }
}
