public class Student {
    private String firstName;
    private String middleName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleName() {
        return middleName.charAt(0);
    }

    public String getLastName() {
        return lastName;
    }
    public void setNames (String first, String middle, String last){
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;
    }
    public String getFullName(){
        String s = getFirstName() +" "+ getMiddleName() + "." +" "+ getLastName();
        return s;
    }


}
