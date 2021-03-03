package PolymorphismAssignment;

public class DegreeGeneral {
    public void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class UnderGraduate extends DegreeGeneral {
    public void getDegree()
    {
        System.out.println("I am an UnderGraduate");
    }
}

class PostGraduate extends DegreeGeneral{
    public void getDegree()
    {
        System.out.println("I am a PostGraduate");
    }
}
class Application {

    public static void main(String[] args) {
        DegreeGeneral dG = new DegreeGeneral();
        dG.getDegree();

        UnderGraduate uG = new UnderGraduate();
        uG.getDegree();

        PostGraduate pG = new PostGraduate();
        pG.getDegree();
    }
}
