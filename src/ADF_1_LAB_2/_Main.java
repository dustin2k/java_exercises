package ADF_1_LAB_2;

import java.time.LocalDate;
import java.util.regex.*;

class _Main{
    public static void main(String[] args) {
        Employee e = new Employee("Nguyen Van A", 5000.75, 2002, "ABC1234");
        LocalDate date = LocalDate.now();
        System.out.println("Name: " + e.getName());
        System.out.println("Salary " + e.getSalary());
        System.out.println("Starting Year " + e.getStartingYear());
        System.out.println("Working years: " + (date.getYear() - e.getStartingYear()));
        System.out.println("National Insurance Number: " + e.getNational_insurance_number());
        String str = "testst12321ring abcs12313tring";
        Matcher m = Pattern.compile("[a-z]*").matcher(str);
        int i = 0;
        String[] a = {};
        while(m.find()){
//            a[i] = m.group();
//            i++;
            System.out.print(m.group() + " ");
        }
//        System.out.println(a[0].toString());
    }
}