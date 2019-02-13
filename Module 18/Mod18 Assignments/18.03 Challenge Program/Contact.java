/**
 * @purpose Make a list of people that can be searched.
 * 
 * @author Jody Rutter
 * @version 8/30/2015
 */
public class Contact
{
    //Instance variables.
    private String name, relation, bday, phone, email;
    
    /**
     * Constructor for objects of type Contact.
     * @param name Name of a person.
     * @param relation Relationship to a person.
     * @param bday Birthday of a person.
     * @param phone Phone number of a person.
     * @param email Email of a person.
     */
    public Contact(String name, String relation, String bday, String phone, String email)
    {
        this.name = name;
        this.relation = relation;
        this.bday = bday;
        this.phone = phone;
        this.email = email;
    }
    
    /**
     * Setter method to set name.
     * @param newName Name to replace an old name.
     */
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    /**
     * Setter method to set a relationship.
     * @param newRelation Relationship to replace an old relationship.
     */
    public void setRelation(String newRelation)
    {
        this.relation = newRelation;
    }
    
    /**
     * Setter method to set a birthday.
     * @param newBirthday Birthday to replace an old birthday.
     */
    public void setBirthday(String newBirthday)
    {
        this.bday = newBirthday;
    }
    
    /**
     * Setter method to set a phone number.
     * @param newPhone Phone number to replace an old phone number.
     */
    public void setPhone(String newPhone)
    {
        this.phone = newPhone;
    }
    
    /**
     * Setter method to set an email address.
     * @param newEmail Email address to replace an old email address.
     */
    public void setEmail(String newEmail)
    {
        this.email = newEmail;
    }
    
    /**
     * toString method.
     * @return A string with a person's name, relationship, birthday, phone number, and email address.
     */
    public String toString()
    {
        return String.format("%-25s",this.name) + String.format("%-25s",this.relation) + String.format("%-25s",this.bday) + String.format("%-25s",this.phone) + String.format("%s",this.email);
    }
    
    /**
     * Getter method to return name.
     * @return Name.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Getter method to return relation.
     * @return Relation.
     */
    public String getRelation()
    {
        return this.relation;
    }
    
    /**
     * Getter method to return birthday.
     * @return Birthday.
     */
    public String getBirthday()
    {
        return this.bday;
    }
    
    /**
     * Getter method to return phone number.
     * @return Phone number.
     */
    public String getPhone()
    {
        return this.phone;
    }
    
    /**
     * Getter method to return email address.
     * @return Email address.
     */
    public String getEmail()
    {
        return this.email;
    }
}