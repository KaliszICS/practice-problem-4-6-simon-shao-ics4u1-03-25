
public class Person{

    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    public Person(String fN, String lN, int bD, int bM, int bY, String ssn){
        this.firstname = fN;
        this.lastname = lN;
        this.birthDay = bD;
        this.birthMonth = bM;
        this.birthYear = bY;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[]{};
    }

    //getters 
    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
return this.lastname;
    }

    public String getBirthday(){
        return "" + this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    public Person[] getSiblings(){
        return this.siblings;
    }

    public void setFirstname(String fN){
this.firstname = fN;
    }


    public void setLastname(String lN){
        this.lastname = lN;
            }
        
    public void addSibling(Person person){
        Person[] tempSibList = new Person[this.numberOfSiblings+1];
            for (int i = 0; i<this.siblings.length; i++){
             tempSibList[i] =  this.siblings[i]; 
        }
        
        tempSibList[numberOfSiblings] = person;
        this.siblings = new Person[tempSibList.length];
        for (int i = 0; i<this.siblings.length; i++){
            this.siblings[i] =  tempSibList[i]; 
       }
this.numberOfSiblings++;
    }


}