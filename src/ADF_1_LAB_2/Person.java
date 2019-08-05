package ADF_1_LAB_2;

public class Person{
    private String name;
    public Person(){
        name = "No name yet.";
    }
    public Person(String _name){
        name = _name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println("Name: " + name);
    }
    public boolean equals(Object p){
        return name.equals(p);
    }
}
