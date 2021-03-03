package PolymorphismAssignment;

public class PrintNumbers {

    public void PrintTypeInt(int numInt)
        {
            System.out.println("Printing Integer value: "+numInt);
        }
        public void PrintTypeInt(double numDoub)
        {
            System.out.println("Printing Double value: "+numDoub);
        }
        public void PrintTypeInt(float numFlo)
        {
            System.out.println("Printing Float value: "+numFlo);
        }

    public static void main(String[] args) {
        PrintNumbers print = new PrintNumbers();
        print.PrintTypeInt(100);
        print.PrintTypeInt(100.12345);
        print.PrintTypeInt(100.12f);
    }
    }
