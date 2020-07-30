public class food {
    private int menuNum;
    private String Size;


    public food(int menuNum,String size) {
        this.menuNum = menuNum;
        this.Size = size;
    }
    public String toString(){
        return menuNum + ", " + Size;
    }
}
