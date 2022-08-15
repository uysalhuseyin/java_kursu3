package Gun38._01_Ornek;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla=new TeslaCar("ModelS", 310);
        ToyotaPrius prius=new ToyotaPrius("prius", 1200);
        Bus bus=new Bus("Mercedes",7000);
        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(prius);
        arabalar.add(bus);

        for (Vehicle v:arabalar)
             {
                 System.out.println("************************");
                 System.out.println("model="+v.getModel());
                 System.out.println("Engine="+v.getEngine());

                 if (v instanceof TeslaCar){
                     System.out.println(((TeslaCar)v).drive());
                     System.out.println(((TeslaCar)v).changeBattery());
                 }
                 if (v instanceof ToyotaPrius){
                     System.out.println(((ToyotaPrius)v).drive());
                     System.out.println(((ToyotaPrius)v).changeBattery());
                     System.out.println(((ToyotaPrius)v).changeOil());
                 }

                 if (v instanceof Bus){
                     System.out.println(((Bus)v).drive());
                     System.out.println(((Bus)v).changeOil());
                 }
        }
    }
}
