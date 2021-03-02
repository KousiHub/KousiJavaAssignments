package FundamentalsAssignment;

public class LoopsPrg4 {
    public static void main(String[] args) {
        int i, j;
        for (i = 7; i >= 1; i--)
        {
            for (j = 0; j < i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
                //inner loop for space
                /*for (j=7-i; j>1; j--)
                {
                    System.out.print(" ");
                }*/
            }
            System.out.println();
        }
    }
}
