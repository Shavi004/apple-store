/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shavionanayakkara
 */
import java.io.BufferedReader;
import java.nio.file.Files;

public class Register {
    cashier_details fs = new cashier_details ("details.txt");
   
    private String username;
    private String password;
  

    public Register (String Username, String Password) {
        this.username = Username;
        this.password = Password;
    }


    
    public Register () {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String UserName) {
        this.username = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

   

  
    
    public boolean addNewUser(){
    if(!fs.registerFile())
    {
        String record = username+"/"+password+"/";
        return fs.registerFile(record);
    }
    return false;
    }
    
     public boolean validateLogin() 
    {
        try {
            String[] words = null;
            BufferedReader Cashiers = fs.readFile();
            String s1;

            while ((s1 = Cashiers.readLine()) != null) {
                words = s1.split("/");
                if (words[0].equals(username) && words[1].equals(password) ) {
                    this.setUsername(words[0]);
                    this.setPassword(words[1]);
                    
                    return true;
                }
            }
            
        } 
        catch (Exception e) 
        {
            System.out.println("Something went wrong creating file"+e);
        }

        return false;
    }

    public String viewAllCashiers() 
     {
        String Cashiers, allUsers = "";
        String[] words = null;
       
        BufferedReader user = fs.readFile();
        try {
            while ((Cashiers = user.readLine()) != null) {
                words = Cashiers.split("/");
                
                allUsers += words[0]+"\t"+words[1]+"\n";
                
            }
        } 
        
        catch (Exception e) 
        {}
        
        
        return allUsers;
    }
    
}
    

