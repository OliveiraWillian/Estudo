package entities;

public class Employee {
    public Integer id;
    public String name;
    public Double salary;

    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void incrementosalario(double porcento){

    }

    public String toString() {
        return id + ", " + name + ", $"  + salary ;
    }
}
