public class SoftDrinks {
    private String Name;
    private String Colour;
    private String Volume;

    public SoftDrinks( String name, String colour, String volume) {
        this.Name = name;
        this.Colour = colour;
        this.Volume = volume;
    }

    @Override
    public String toString() {
        return this.Name +" "+this.Colour+" "+this.Volume;
    }
}
