package PolymorphismAssignment;

public class AreaOfSquareAndRectangle {

    public void SquareArea ( int side)
        {
            int areaOfSquare = side * side;
            System.out.println("Printing area of square: " + areaOfSquare);
        }
        public void RectangleArea ( int length, int breadth)
        {
            int areaOfRectangle = length * breadth;
            System.out.println("Printing area of rectangle: " + areaOfRectangle);
        }

    public static void main(String[] args) {
        AreaOfSquareAndRectangle area = new AreaOfSquareAndRectangle();
        area.SquareArea(10);
        area.RectangleArea(10,20);
    }

}