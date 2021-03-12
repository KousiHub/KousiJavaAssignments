package JavaConceptsDay2Assignment;

public class InheritanceLaptops {
    public final String lapName;
    public final double lapPrice;
    public final String lapProcessor;
    public final String lapRam;
    public final String lapHD;

    public InheritanceLaptops (String lName, double lPrice, String lProcessor, String lRam, String lHD)
    {
        this.lapName = lName;
        this.lapPrice = lPrice;
        this.lapProcessor = lProcessor;
        this.lapRam = lRam;
        this.lapHD = lHD;
    }
}


class LaptopsSuperKey extends InheritanceLaptops {
    public LaptopsSuperKey (String lName, double lPrice, String lProcessor, String lRam, String lHD)
    {
      super(lName,lPrice,lProcessor,lRam,lHD);
    }
}

