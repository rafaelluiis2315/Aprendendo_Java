public class User {
    
    private String firstName;
    private String lastName;

    public User(String firstNames, String lastName){
        this.firstName = firstNames;
        this.lastName = lastName;
    }
    
    public void setFirsName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    public String output(){
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String output(Boolean showFullName){
        if (showFullName){
            return output();
        }
        return firstName.toUpperCase();
    }


}
