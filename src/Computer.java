public class Computer {
    public int screensize;
    public int memory;
    public Computer(int screensize, int memory)
    {
        this.screensize = screensize;
        this.memory = memory;
    }
    public int getScreensize()
    {
        return screensize;
    }
    public int getMemory()
    {
        return memory;
    }
    public void installOperatingSystem()
    {
        System.out.println("installing OS...");
    }


}
