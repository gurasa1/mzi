package CWSerial;

import java.io.Serializable;

public class Student implements Serializable {
        String id;
        String name;
        double grade;

        public Student(String Studentid, String Studentname, double Studentgrade) {
            this.id = Studentid;
            this.name = Studentname;
            this.grade = Studentgrade;
        }
}
