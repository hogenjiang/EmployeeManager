package Models;

public class Department {
    private int id;
    private String department;

    public Department(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Department(int id, String department){
        this.id = id;
        this.department = department;
    }

    public String toString() {
        return this.department;
    }
}
