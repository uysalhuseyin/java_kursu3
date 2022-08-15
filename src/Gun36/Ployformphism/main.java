package Gun36.Ployformphism;

public class main {
    public static void main(String[] args) {
        kopek kopek1=new kopek("Kayisi");
        kedi kedi1=new kedi("pamuk");
        hayvan kopek2=new hayvan("karabas");
        hayvan kedi2=new hayvan("osman");

        kopek1.ses();
        kopek1.kokladi();
        kopek2.ses();

        hayvanses(kopek1);
        hayvanses(kopek2);
        hayvanses(kedi1);
    }
    public static  void hayvanses(hayvan h){
        h.ses();
    }
}
