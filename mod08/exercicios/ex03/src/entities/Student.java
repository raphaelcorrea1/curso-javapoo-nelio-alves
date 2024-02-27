package entities;

public class Student {

    public String name;
    public double n1, n2, n3;

    public double finalGrade(){
        return n1 + n2 + n3;
    }

    public Boolean isApproved(){
        return (this.finalGrade() >= 60.0);
    }
}
