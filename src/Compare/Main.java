package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public void main(String[] args) {
        ArrayList<Employee> em = new ArrayList<>();
        Employee e = new Employee("Nika",2000);
        Employee e1 = new Employee("Luka",2200);
        Employee e2 = new Employee("Soso",1870);
        em.add(e);
        em.add(e1);
        em.add(e2);
        Collections.sort(em);
        em.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.name.compareTo(o1.name);
            }
        });
        System.out.println("Max "+ Collections.max(em));
        System.out.println("Min " +Collections.min(em));
        for (Employee employee : em){
            System.out.println(employee.toString());
        }
        Collections.reverse(em);
        for (Employee employee : em){
            System.out.println(employee.toString());
        }
    }

    class Employee implements Comparable<Employee>{
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
        @Override
        public int compareTo(Employee o) {
            if(o.salary==this.salary) {
                return 0;
            }else if(o.salary>this.salary){
                    return -1;
                }else{
                    return 1;
                }
        }
    }
}

