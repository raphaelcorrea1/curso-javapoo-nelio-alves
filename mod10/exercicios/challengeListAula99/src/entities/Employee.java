package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(Double percentage){
        this.salary += (this.getSalary() * (percentage/100.0));
    }

    public String toString(){
        return this.getId() + 
        ", " + this.getName() +
        ", " + String.format("%.2f", this.getSalary());
    }

}
