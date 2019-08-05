package ADF_1_LAB_2;

public class Employee extends Person{
    private double salary;
    private int startingYear;
    private String national_insurance_number;    
    public Employee(String _name, double _salary, int _startingYear, String _national_insurance_number){
        super(_name);
        salary = _salary;
        startingYear = _startingYear;
        national_insurance_number = _national_insurance_number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

    public String getNational_insurance_number() {
        return national_insurance_number;
    }

    public void setNational_insurance_number(String national_insurance_number) {
        this.national_insurance_number = national_insurance_number;
    }
}
