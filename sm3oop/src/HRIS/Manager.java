package HRIS;

public class Manager extends Employee {

    public Manager() {
        this("Tidak bergelar", "Belum ditempatkan");
    }

    public Manager(String title, String department) {
        super("Ahmad");
        System.out.println("Title: "+title+"\nDepartment: "+department);
    }
  
}
