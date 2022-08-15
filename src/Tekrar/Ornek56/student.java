package Tekrar.Ornek56;

import java.util.ArrayList;

public class student {
    String name;
    int maxcredit;
    ArrayList <lesson>  lessons=new ArrayList<>();

    public  void addlesson(lesson ders){

        int totalgetcredit=0;
        for (lesson l: lessons
             )
            totalgetcredit+=l.credit;
        if (totalgetcredit+ders.credit<=maxcredit)
            lessons.add(ders);


        else
            System.out.println("Alinabilecek miktari acti");



    }
}
