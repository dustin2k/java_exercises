package test;

import java.util.regex.*;

public class test {
    String _str;
    test(String a){
        _str = a;
    }

    public static void main(String[] args) {
        String str = "This is a test string with number 12345 and UPPERCASE";
        Matcher m = Pattern.compile("([0-9]*)([A-Z])").matcher(str);
        int count = 0;
        while(m.find()){
            count++;
            System.out.print(m.group() + " ");
        }
        System.out.println();
        System.out.println(count);
    }
}
