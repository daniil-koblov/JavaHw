package JavaHw6;

public class JavaHw6Laptop {
    private String name;
    private double ram;
    private double storageCap;
    private String os;
    private String colour;
    private double diagonal;

    public JavaHw6Laptop(String name, double ram, double storageCap, String os, String colour, double diagonal){
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format("Название: %s. \n Объем оперативной памяти: %d Гб. \n"
        + "объем накопителя: %d Гб. \n ОС %s. \n Цвет %s. \n Диагональ %.1f. \n",
        this.name, this.ram, this.storageCap, this.os, this.colour, this.diagonal);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JavaHw6Laptop) {
            return this.name.equals(((JavaHw6Laptop) obj).name) && this.ram == ((JavaHw6Laptop) obj).ram
            && this.storageCap == ((JavaHw6Laptop) obj).storageCap && this.os.equals(((JavaHw6Laptop) obj).os) 
            && this.colour.equals(((JavaHw6Laptop) obj).colour) && this.diagonal == ((JavaHw6Laptop) obj).diagonal;
        }
        return false;
        
    }

    public double getRam(){
        return this.ram;
    }
    public double getStorageCap(){
        return this.storageCap;
    }
    public String getOS(){
        return this.os;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
}