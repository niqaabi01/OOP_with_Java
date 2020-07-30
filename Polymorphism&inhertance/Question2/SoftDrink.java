public class  SoftDrink extends food {
    private String Flavour;
    private String Bottle_can;

    public SoftDrink(int menuNumber, String size, String flavour, String bottle_can) {
        super(menuNumber,size);
        this.Flavour = flavour;
        this.Bottle_can = bottle_can;
    }


    @Override
    public String toString() {
        return "SoftDrink: " + super.toString()+
                ", " + Flavour +
                ", " + Bottle_can ;
    }
}