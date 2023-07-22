import java.time.LocalDate;

public class Contact {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private int phoneNumber;
    private String sex;

    public Contact(){
        this("", "", "", null, 0, "");
    }

    public Contact(String lastName, String firstName, String middleName, LocalDate birthDate, int phoneNumber, String sex){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj){
        Contact temp = (Contact)obj;
        return this.firstName == temp.firstName && this.lastName == temp.lastName && this.birthDate == temp.birthDate;
    }

    @Override
    public String toString(){
        return "<" + getLastName() + ">" + 
               "<" + getFirstName() + ">" + 
               "<" + getMiddleName() + ">" + 
               "<" + getBirthDate() + ">" + 
               "<" + getPhoneNumber() + ">" + 
               "<" + getSex() + ">";
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public String getSex(){
        return sex;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

}