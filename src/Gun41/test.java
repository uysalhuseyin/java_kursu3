package Gun41;

public class test {
    public int getAge() {

        int Date;
        int getBirthDate;
        int getYear;
        long ageInMillis = new Date().getTime() - getBirthDate().getTime();

        Date age = new Date(ageInMillis);

        return age.getYear();
    }


    }
}
