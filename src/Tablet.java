public class Tablet extends Computer
{
    private int screenSize; // in inches
    private int memory; // in gigabytes (GB)
    private boolean stylusIncluded;

    public Tablet(int screenSize, int memory, boolean stylusIncluded)
    {
       super(screenSize, memory);
        this.stylusIncluded = stylusIncluded;
    }
}

