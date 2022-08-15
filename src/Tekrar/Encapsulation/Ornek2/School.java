package Tekrar.Encapsulation.Ornek2;

import java.util.ArrayList;

public class School {
    private String SchoolName;
    private int MaxStudent;
     ArrayList<Student> student1=new ArrayList<>();

    public School(String schoolName, int maxStudent) {
        setSchoolName(schoolName);
        setMaxStudent(maxStudent);
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public int getMaxStudent() {
        return MaxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        MaxStudent = maxStudent;
    }
}
