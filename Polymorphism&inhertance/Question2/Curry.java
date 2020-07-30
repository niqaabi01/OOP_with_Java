public class Curry extends food {
    private int MenuNumber;
    private String Size;
    private String Curry_type;


    public Curry(int menuNumber, String size, String curry_type) {
        super(menuNumber,size);
        this.Curry_type = curry_type;
    }

    @Override
    public String toString() {
        return "Curry: "+super.toString()+
                ", " +Curry_type ;
    }
}


