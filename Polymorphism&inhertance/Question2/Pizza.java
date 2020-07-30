public class Pizza extends food {

    private String Base;
    private String Cheese;
    private String Garlic;


    public Pizza(int menuNumber, String size, String base, String cheese,String garlic) {
        super(menuNumber,size);
        this.Base = base;
        this.Cheese =cheese;
        this.Garlic =garlic;
    }

    @Override
    public String toString() {
        return "Pizza: "+super.toString()+", "+ Base +
                ", " + Cheese +
                ", "+ Garlic;
    }

}
