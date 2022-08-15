package Gun29._02_Constructor;

public class book {
    String name;
    int publishyear;
    String author;

    public book (){

    }
    // 2. Consructor
    public book (String name, int publishyear, String author){
     this.name=name;
     this.publishyear=publishyear;
     this.author=author;

    }
    //3.Consructor
    public  book(String name, int publishyear){
        this.name=name;
        this.publishyear=publishyear;
        this.author="";

    }

    public void yazdir(){
        System.out.println(name+" "+publishyear+" "+author);
    }

    public  String toString(){
        return name+" "+publishyear+" "+author;
    }
}
