package lesson02.ex1_4;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id,String firstname,String lastname,int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public String getName(){
        return firstname + " " + lastname;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public double raiseSalary(int percent){
        salary += salary * (percent / 100);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
