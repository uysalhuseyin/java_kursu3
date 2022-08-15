package Tekrar.javametod;

public class person {

    String name;
    String surname;
    int age;

   public  void infoprint(){
       System.out.println("name = " + name);
       System.out.println("surname = " + surname);
       System.out.println("age = " + age);
   }
   public void getInitials(){
       System.out.println(name.toUpperCase().charAt(0)+"-"+surname.toUpperCase().charAt(0)+"="+age);
   }


}
