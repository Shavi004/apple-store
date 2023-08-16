
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shavionanayakkara
 */
public class creat_acc {

    /**
     * @return the FullName
     */
    public String getFullName() {
        return FullName;
    }

    /**
     * @param FullName the FullName to set
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the Sex
     */
    public String getSex() {
        return Sex;
    }

    /**
     * @param Sex the Sex to set
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the MB
     */
    public int getMB() {
        return MB;
    }

    /**
     * @param MB the MB to set
     */
    public void setMB(int MB) {
        this.MB = MB;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the Pw
     */
    public String getPw() {
        return Pw;
    }

    /**
     * @param Pw the Pw to set
     */
    public void setPw(String Pw) {
        this.Pw = Pw;
    }
    
      private String FullName;
     private int Age;
     private String Sex;
     private String Address;
     private String Email;
     private int MB;
     private String UserName;
     private String Pw;
     
     
     public void addAcc(creat_acc obj2) throws IOException
      
    {
        String userString = obj2.getFullName()+" " + String.valueOf(obj2.getAge()) + " " + obj2.getSex()+" "+ obj2.getAddress()+ " " + obj2.getEmail()
                + " " + String.valueOf(obj2.getMB())+" "+ obj2.getUserName() + " " + obj2.getPw();
        DBCon con = new DBCon();
        con.makeConnection(userString,"user.txt");
    }
}

