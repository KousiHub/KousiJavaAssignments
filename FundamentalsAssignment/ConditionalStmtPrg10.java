package FundamentalsAssignment;

public class ConditionalStmtPrg10 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 0;
        System.out.println("x==2 is " +(x==2));
        System.out.println("x!=5 is " +(x!=5));
        System.out.println("x != 5 && y >= 5 is " +((x != 5) && (y >= 5)));
        System.out.println("z != 0 || x == 2 is " +((z != 0) || (x == 2)));
        System.out.println("!(y < 10) is " +(!(y < 10)));
    }
}
