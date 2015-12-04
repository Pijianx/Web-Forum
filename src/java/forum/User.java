/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author derrick
 */
public class User implements Serializable{
    
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String Exp;
    private String Content;
    private String Age;
    private String LikeToSee;
    private String Name;
    private String Country;
    private String Interest;
    private String Verify;
    
    //private String occupation;
    
    public User()
    {
        firstName ="";
        lastName ="";
        emailAddress="";
         Exp="";
        Content="";
         Age="";
        LikeToSee="";
        Name="";
        Country="";
        Interest="";
        Verify="";
                
        
      //  occupation="";
    }
    public User(String firstName, String lastName, String emailAddress)
    {
        this.firstName = firstName;
        this.lastName =lastName;
        this.emailAddress=emailAddress;
        //this.occupation=occupation;
    }
    public User(String firstName, String lastName, String emailAddress,  String Name, String Country, String Interest)
    {
        this.firstName = firstName;
        this.lastName =lastName;
        this.emailAddress=emailAddress;
        this.Name = Name;
        this.Country =Country;
        this.Interest=Interest;
        
        //this.occupation=occupation;
    }
    public User(String firstName, String lastName, String verify, String emailAddress,  String Name, String Country, String Interest)
    {
        this.firstName = firstName;
        this.lastName =lastName;
        this.Verify=verify;
        this.emailAddress=emailAddress;
        this.Name = Name;
        this.Country =Country;
        this.Interest=Interest;
        
        //this.occupation=occupation;
    }
   public String [] colors={"Red", "Green", "Blue"};
    
   
    
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress=emailAddress;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
     public void setExp(String exp)
    {
        this.Exp=exp;
    }
    public String getExp()
    {
        return Exp;
    }
     public void setContent(String emailAddress)
    {
        this.Content=emailAddress;
    }
    public String getContent()
    {
        return Content;
    }
     public void setAge(String emailAddress)
    {
        this.Age=emailAddress;
    }
    public String getAge()
    {
        return Age;
    }
     public void setLikeToSee(String emailAddress)
    {
        this.LikeToSee=emailAddress;
    }
    public String getLikeToSee()
    {
        return LikeToSee;
    }
       public void setName(String emailAddress)
    {
        this.Name=emailAddress;
    }
    public String getName()
    {
        return Name;
    }
       public void setCountry(String emailAddress)
    {
        this.Country=emailAddress;
    }
    public String getCountry()
    {
        return Country;
    }
       public void setInterest(String emailAddress)
    {
        this.Interest=emailAddress;
    }
    public String getInterest()
    {
        return Interest;
    }
     public void setVerify(String emailAddress)
    {
        this.Verify=emailAddress;
    }
    public String getVerify()
    {
        return Verify;
    }
 //   public void setOccupation(String occupation)
   // {
     //   this.occupation=occupation;
    //}
   // public String getOccupation()
    //{
    //    return occupation;
    //}
    
}
