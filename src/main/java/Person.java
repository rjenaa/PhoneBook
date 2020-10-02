public class Person {
    private String fName, lName;
    public Person(){}
    public Person(String first, String last){
        this.fName = first;
        this.lName = last;
    }
    public String getfName(){
        return fName;
    }
    public void setfName(String first){
        this.fName = first;
    }
}
