package test;

public class test {
    String _str;
    test(String a){
        _str = a;
    }

    public static void main(String[] args) {
        test a = new test("test");
        System.out.println(a._str);
    }
}
