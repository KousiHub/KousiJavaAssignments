package FundamentalsAssignment;

public class LoopsPrg5 {
    public static void main(String[] args) {
        int t1 = 24, t2 = 29, t3 = 50;
        System.out.println("24 Tables");
        for (int i=0; i< 10; i++){
            System.out.println(t1 + " x " + (i+1) + " = " +
                    (t1 * (i+1)));
        }
        System.out.println("29 Tables");
        for (int i=0; i< 10; i++){
            System.out.println(t2 + " x " + (i+1) + " = " +
                    (t2 * (i+1)));
        }
        System.out.println("50 Tables");
        for (int i=0; i< 10; i++){
            System.out.println(t3 + " x " + (i+1) + " = " +
                    (t3 * (i+1)));
        }
    }
}
