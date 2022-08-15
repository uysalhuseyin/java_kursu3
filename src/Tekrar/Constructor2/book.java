package Tekrar.Constructor2;

public class book {
    String name;
    int publishyear;
    String author;

    public book(String name, int publishyear, String author) {
        this.name = name;
        this.publishyear = publishyear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", publishyear=" + publishyear +
                ", author='" + author + '\'' +
                '}';
    }
}
