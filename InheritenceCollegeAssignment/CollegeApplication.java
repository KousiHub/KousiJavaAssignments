package InheritenceCollegeAssignment;

public class CollegeApplication {

    public static void main(String[] args) {

        Departments dept = new Departments();
        dept.Graduation();

        EngineeringDept engg = new EngineeringDept();
        engg.Graduation();
        engg.Graduation("Computer Science");

        engg.LabClasses();

        System.out.println("LIBRARY INTERFACE FOR ENGINEERING");
        engg.BooksDetails(1,true,"JAVA");
        engg.BooksDetails(2,false,"SELENIUM");
        engg.BooksDetails(3,false,"DBMS");
        //System.out.println("Total Book count: " +engg.bookCount);
        //System.out.println("Count of engg books rented : " +engg.rentEnggBooksCount);

        engg.FurnitureDetails("Chair","Plastic");
        engg.FurnitureDetails("Table","Plastic");
        engg.FurnitureDetails("Table","Wooden");
        engg.FurnitureDetails("Rack","Steel");
        //System.out.println("Total Furniture count: " +engg.furnCount);
        //System.out.println("Chair count: " +lib());

        engg.StaffDetails("Engg","Teacher1",52);
        engg.StaffDetails("Engg","Teacher2",18);
        //System.out.println("Staff count: " +engg.staffCount);
        int eldestEngg = engg.staffEnggAgeArray[0];
        for(int i = 0; i < engg.staffEnggAgeArray.length; i++) {
            if(engg.staffEnggAgeArray[i] > eldestEngg)
            {
                eldestEngg = engg.staffEnggAgeArray[i];
            }
        }
        System.out.println("Eldest in Engg: "+eldestEngg);
        System.out.println("*************************************************");
        //

        ArtsDept arts = new ArtsDept();
        arts.Graduation();
        arts.Graduation("Mathematics");

        arts.MusicClasses();

        System.out.println("LIBRARY INTERFACE FOR ARTS");
        arts.BooksDetails(1,true,"PROBABILITY");
        arts.BooksDetails(2,false,"TRIGONOMETRY");
        arts.BooksDetails(3,false,"CALCULUS");
        //System.out.println("Total Book count: " +arts.bookCount);


        arts.FurnitureDetails("Chair","Plastic");
        arts.FurnitureDetails("Chair","Plastic");
        arts.FurnitureDetails("Table","Wooden");
        arts.FurnitureDetails("Rack","Steel");
        //System.out.println("Total Furniture count: " +arts.furnCount);

        arts.StaffDetails("Arts","Teacher1",25);
        arts.StaffDetails("Arts","Teacher2",50);
        //System.out.println("Staff count: " +arts.staffCount);

        System.out.println("Total Books (Engg+Arts): "+(engg.bookCount + arts.bookCount));
        System.out.println("Total Books rented (Engg+Arts): " +(engg.rentEnggBooksCount + arts.rentArtBooksCount));
        System.out.println("Total Staffs (Engg+Arts): "+(engg.staffCount + arts.staffCount));
        System.out.println("Total Chair count (Engg+Arts): " +(engg.chairCountEngg + arts.chairCountArts));

        int eldestArts = arts.staffArtsAgeArray[0];
        for(int i = 0; i < arts.staffArtsAgeArray.length; i++) {
            if(arts.staffArtsAgeArray[i] > eldestArts)
            {
                eldestArts = arts.staffArtsAgeArray[i];
            }
        }
        System.out.println("Eldest in Arts: "+eldestArts);
        System.out.println("*************************************************");

    }
}
