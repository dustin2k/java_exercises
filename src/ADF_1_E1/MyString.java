package ADF_1_E1;

public class MyString {
    public static void main(String[] args) {
        BaseString bStr = new BaseString("  ");
        bStr.standardizeString();
        System.out.println(bStr.get());
        System.out.println("The number of words in this string is: " + bStr.countWord());
        // bStr.displayUpperCase();
        // System.out.println("Sum of all numeric characters in this string is: " + bStr.sumNumericCharacters());
    }
}
