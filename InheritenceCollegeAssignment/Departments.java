package InheritenceCollegeAssignment;

public class Departments {

    public void Graduation(){

        System.out.println("MAIN CLASS");
        System.out.println("WELCOME ALL !!!");
        System.out.println("**********************");
    }

}

class EngineeringDept extends Departments implements LabFacility, LibraryFacility {

    String pgInEngg;
    int iSBN;
    boolean isRented;
    String bookName;
    int bookCount;
    int rentEnggBooksCount;
    String furnType;
    String furnMat;
    int furnCount;
    int chairCountEngg;
    int staffAge;
    String fName;
    String lName;
    int staffCount;
    int[] staffEnggAgeArray = new int[10];

    public void Graduation ()
    {
        System.out.println("SUB CLASS - ENGINEERING");
        System.out.println("This is a UG program for Engineers");
    }
    public void Graduation (String pgInEngg)
    {
        this.pgInEngg = pgInEngg;
        System.out.println("This is a PG program for Engineers in: "+pgInEngg);
        System.out.println("**********************");
    }

    public void LabClasses()
    {
        System.out.println("LAB INTERFACE");
        System.out.println("Time for practical sessions");
        System.out.println("**********************");
    }

    public void BooksDetails(int iSBN, boolean isRented, String bookName)
    {
        this.iSBN = iSBN;
        this.isRented = isRented;
        this.bookName = bookName;
        bookCount++;
        //System.out.println("Details of the book: "+iSBN+ " " +isRented+ " " +bookName);

        if(isRented){
            rentEnggBooksCount = rentEnggBooksCount + 1;
        }
        //System.out.println("Count of engg books rented : " +rentEnggBooksCount);
    }

    public void FurnitureDetails(String furnType, String furnMat)
    {
        this.furnType = furnType;
        this.furnMat = furnMat;
        furnCount++;
        //System.out.println("Details of the Furnitures: "+furnType+ " " +furnMat);
        if(furnType.equals("Chair")){
            chairCountEngg++;
        }
    }

    public void StaffDetails(String fName, String lName, int staffAge)
    {
        this.fName = fName;
        this.lName = lName;
        this.staffAge = staffAge;
        staffCount++;
        //System.out.println("Details of the Staffs: "+fName+ " " +furnMat+ " "+ lName+ " "+ staffAge);
        if(staffCount > 0) {
            staffEnggAgeArray[staffCount] = staffAge;
        }
    }

}
class ArtsDept extends Departments implements MusicFacility, LibraryFacility {

    String pgInArts;
    int iSBN;
    boolean isRented;
    String bookName;
    int bookCount;
    int rentArtBooksCount;
    String furnType;
    String furnMat;
    int furnCount;
    int chairCountArts;
    int staffAge;
    String fName;
    String lName;
    int staffCount;
    int[] staffArtsAgeArray = new int[10];

    public void Graduation ()
    {
        System.out.println("SUB CLASS - ARTS");
        System.out.println("This is a UG program for Arts");
    }

    public void Graduation (String pgInArts)
    {
        this.pgInArts = pgInArts;
        System.out.println("This is a PG program for Arts in: " +pgInArts);
        System.out.println("**********************");
    }

    public void MusicClasses()
    {
        System.out.println("MUSIC INTERFACE");
        System.out.println("Music time is it!!!");
        System.out.println("**********************");
    }

    public void BooksDetails(int iSBN, boolean isRented, String author)
    {
        this.iSBN = iSBN;
        this.isRented = isRented;
        this.bookName = author;
        bookCount++;
        //System.out.println("Details of the book: "+iSBN+ " " +isRented+ " " +author);
        if(isRented){
            rentArtBooksCount = rentArtBooksCount + 1;
        }
    }

    public void FurnitureDetails(String furnType, String furnMat)
    {
        this.furnType = furnType;
        this.furnMat = furnMat;
        furnCount++;
        //System.out.println("Details of the Furnitures: "+furnType+ " " +furnMat);
        if(furnType.equals("Chair")){
            chairCountArts++;
        }

    }

    public void StaffDetails(String fName, String lName, int staffAge)
    {
        this.fName = fName;
        this.lName = lName;
        this.staffAge = staffAge;
        staffCount++;
        //System.out.println("Details of the Staffs: "+fName+ " " +furnMat+ " "+ lName+ " "+ staffAge);
        if(staffCount > 0) {
                staffArtsAgeArray[staffCount] = staffAge;
        }
    }
}


