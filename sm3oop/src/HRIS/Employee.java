package HRIS;

public class Employee {

    public Employee() {
    }

    public Employee(String name) {
        this("Jhono", 'L');
        System.out.println("Nama: "+name);
    }

    public Employee(String name, char sex) {
        System.out.println("Nama: "+name+"\nSex: "+sex);
    }
   
}
