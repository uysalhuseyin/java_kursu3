package Gun12;

public class _05_Mathmetodu {
    public static void main(String[] args) {
        // mutlak degeri alma yani her zaman pozitif alma
        //Math ile cogu sey cok kolay yapabiliyoruz.
        int a=-12;
        int b=4;
        System.out.println("a nin mutlak degeri="+Math.abs(a));
        System.out.println("a ve b den en buyuk olani="+Math.max(a,b));
        // a ve b arasinda en buyuk olani veriyor.
        System.out.println("a ve b den kucuk olan="+Math.min(a,b));
        System.out.println(" b nin karakoku="+Math.sqrt(b));
        System.out.println("2 nin 3 kuvvetini bulma="+Math.pow(2,3));
        System.out.println("sayilari yuvarlama="+Math.round(3.1));
        //math.floor bu rakamdan en kucuk tam sayi
    }
}
