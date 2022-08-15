package Tekrar.Constructor3;

public class Bank {
    String name;
    int NumberOfBranches;
    int FoundationYear;

    public Bank(String name, int numberOfBranches, int foundationYear) {
        this.name = name;
        this.NumberOfBranches = numberOfBranches;
        this.FoundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", NumberOfBranches=" + NumberOfBranches +
                ", FoundationYear=" + FoundationYear +
                '}';
    }
}
