package Builder;
import java.util.*;

public class student{
    
    
    int id;
    String name;
    int rollno;
    public student(Builder b){
        this.id=b.id;
        this.name=b.name;
        this.rollno=b.rollno;
    }
    public void display(){
        System.out.println("Student id :" +id);
        System.out.println("Student name :"+name);
        System.out.println("Student Roll No :"+rollno);
    }
    static class Builder{
    private int id;
    private String name;
    private int rollno;
    void Builder(){

    }
    public Builder setid(int id){
        this.id=id;
        return this;
    }
    public Builder setname(String name){
        this.name=name;
        return this;
    }
    public Builder setrollno(int rollno){
        this.rollno=rollno;
        return this;
    }
    
    public student build(){
        return new student(this);
    }
    

}
    public static void main(String [] args){
        student s=new student.Builder().setid(1).setname("Arjun").setrollno(11).build();
        s.display();
    }
}
