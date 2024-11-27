package CW;

public class student_mgmt {
    String name;
    int roll;
    int marks; // public ebi wavshale
    int attendance = 0;

    public student_mgmt(String n, int r, int m) {
        name = n;
        roll = r;
        marks = m;
    }

    public void student_detail() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks + ", Attendance: " + attendance);
    }

    public void mark_att() {
        attendance++; //shevamokle ++it
    }
}

class test_student {
    public static void main(String[] args) {
        student_mgmt s1 = new student_mgmt("John", 101, 85);
        s1.student_detail();
        s1.mark_att();
        s1.student_detail();
    }
}