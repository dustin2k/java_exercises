package ADF_1_E1;

import java.util.regex.*;

public class BaseString {
    private String _str;
    BaseString(String a){
        _str = a;
    }
    public void set(String str){
        this._str = str;
    }
    public String get(){
        return this._str;
    }
    public int countWord(){
        if(_str == null || _str.isEmpty()) return 0;
        else{
            Matcher m = Pattern.compile("\\s").matcher(_str);
            int count = 1;
            while(m.find()){
                count++;
            }
            return count;
        }
    }
    public void standardizeString(){
        Matcher m = Pattern.compile("\\s\\s+").matcher(_str);
        _str = m.replaceAll(" ");
        Matcher _m = Pattern.compile("^\\s+").matcher(_str);
        _str = _m.replaceAll("");
        Matcher __m = Pattern.compile("\\s+$").matcher(_str);
        _str = __m.replaceAll("");
    }
    public void displayUpperCase(){
        char[] characters = _str.toCharArray();
        System.out.print("The upper case characters in '" + _str + "' are: ");
        for(int i = 0; i < characters.length; i++){
            if(Character.isUpperCase(characters[i])) System.out.print(characters[i] + " ");
        }
        System.out.println();
    }
    public int sumNumericCharacters(){
        int s = 0;
        char[] characters = _str.toCharArray();
        for(int i = 0; i < characters.length; i++){
            if(Character.isDigit(characters[i])) s += Integer.parseInt(String.valueOf(characters[i]));
        }
        return s;
    }
}
