package Tekrar.Orneksoru;

public class main {

    public static void main(String[] args) {
        Client client1=new Client();
        client1.name="Ali";
        client1.electriccalcu1=new electricityCalculation();

       client1.electriccalcu1.electricityconsumption(100);
        client1.electriccalcu1.electricityconsumption(200);
        client1.electriccalcu1.electricityconsumption(300);
        client1.electriccalcu1.electricityconsumption(400);

        client1.electriccalcu1.printtotalCansumption();
    }


}
