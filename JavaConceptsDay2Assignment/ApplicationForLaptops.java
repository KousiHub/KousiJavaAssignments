package JavaConceptsDay2Assignment;

public class ApplicationForLaptops {
    public static void main(String[] args) {
        InheritanceLaptops leno = new InheritanceLaptops("Lenovo",1000, "i3", "2GB", "500GB");
        System.out.println("Laptop 1 - Details");
        System.out.println("Name: " +leno.lapName);
        System.out.println("Name: " +leno.lapPrice);
        System.out.println("Name: " +leno.lapProcessor);
        System.out.println("Name: " +leno.lapRam);
        System.out.println("Name: " +leno.lapHD);
        System.out.println("*************************");

        InheritanceLaptops dell = new InheritanceLaptops("Dell",1500, "i5", "4GB", "1TB");
        System.out.println("Laptop 2 - Details");
        System.out.println("Name: " +dell.lapName);
        System.out.println("Name: " +dell.lapPrice);
        System.out.println("Name: " +dell.lapProcessor);
        System.out.println("Name: " +dell.lapRam);
        System.out.println("Name: " +dell.lapHD);
        System.out.println("*************************");

        InheritanceLaptops sony = new InheritanceLaptops("Sony",2000, "i9", "8GB", "1TB");
        System.out.println("Laptop 3 - Details");
        System.out.println("Name: " +sony.lapName);
        System.out.println("Name: " +sony.lapPrice);
        System.out.println("Name: " +sony.lapProcessor);
        System.out.println("Name: " +sony.lapRam);
        System.out.println("Name: " +sony.lapHD);
        System.out.println("*************************");

    }
}
