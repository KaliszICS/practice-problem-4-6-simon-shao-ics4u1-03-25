/**
 * contains information of a person and their siblings
 * @author Simon Shao
 * @version 1.0.0
 */
public class Person{

    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    /**
     * initialized a person's information with given param, assume they have no siblings
     * @param fN the variable for their first name
     * @param lN the variable for their last name
     * @param bD the variable for their birth day
     * @param bM the variable for their birth month
     * @param bY the variable for their birth year
     * @param ssn the variable for their social security number
     */
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
    /**
     * to access first name of person
     * @return returns the first name
     */
    public String getFirstname(){
        return this.firstname;
    }

        /**
     * to access last name of person
     * @return returns the last name
     */
    public String getLastname(){
return this.lastname;
    }

        /**
     * to access birthday of person in the form of day/month/year
     * @return returns the birthday
     */
    public String getBirthday(){
        return "" + this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

        /**
     * to access the list of person's siblings
     * @return returns the array of siblings
     */
    public Person[] getSiblings(){
        return this.siblings;
    }
/**
 * replace first name of person
 * @param fN the first name of person
 */
    public void setFirstname(String fN){
this.firstname = fN;
    }

/**
 * replace last name of person
 * @param fN the last name of person
 */
    public void setLastname(String lN){
        this.lastname = lN;
            }

/**
 * adds a sibling for the person
 * @param person person to be added as a sibling
 */
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