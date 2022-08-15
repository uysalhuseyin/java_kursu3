package Tekrar.Orneksoru;

public class electricityCalculation {

    int totalConsumption=0;
    double rate=0.7;
    int amountpaid=0;

    public  void electricityconsumption (int consumption){
        totalConsumption=consumption;


    }
    public  void printtotalCansumption (){
        System.out.println("totalConsumption = " + totalConsumption);
    }


}
