package array_exception_test;

public class array_exception {
    public static void main(String[] args) {
        colored_point[] cpa = new colored_point[10];
        colored_point a = new colored_point(5, 4, 8);
        point[] pa = cpa;
//        System.out.println(cpa[0]);
//        try {
//            pa[1] = new colored_point(8, 9, 10);
////            pa[4] = new point(5,7);
////            for(point e: pa) System.out.println(e);
//        } catch(ArrayStoreException e) {
//            System.out.println(e);
//            if(e.getMessage().equals("array_exception_test.point")) System.out.println("yay"); else System.out.println("no");
//        }
        Number[] n = new Double[2];
        n[0] = 5.013123;
        System.out.println(n[0]);
    }
}
