
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shavionanayakkara
 */
 
    
    
    public class DBConne {
    
    String myFile = "/Users/shavionanayakkara/Documents/istore/Item";
    public void makeConnection(String Record, String file)
    {
        try
        {
            myFile = myFile + file;
            FileWriter writer = new FileWriter(myFile,true);
            BufferedWriter buffer = new BufferedWriter(writer);
            
            buffer.write(Record);
            buffer.newLine();
            buffer.close();
            writer.close();
            
            JOptionPane.showMessageDialog(null, "Succesfully wrote to the file.");
            
        }
        
        catch (IOException e) 
        {
            System.out.println("An error occurred saving values" + e);
        }
    }
    
    public void findeData(String value,String file)
    {
        try
        {
            myFile = myFile + file;
            boolean found = true;
            String[] words = null;
            FileReader fileR = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fileR);
            
            String FindLine, input = value;
            
            outerLoop:
            while ((FindLine = br.readLine()) != null)
            {
                words = FindLine.split(" ");
                for (String word : words)
                {
                    if (word.equals(input))
                    {
                        found = true;
                        System.out.println(FindLine);
                        break outerLoop;
                    }
                    else
                    {
                        found = false;
                    }
                }
                
            }
            if (found)
            {
                JOptionPane.showMessageDialog(null,"Value not in the List. ");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Value  in the List,Please Click 'Stock Details' For More... ");
            }
            fileR.close();
            br.close();
        }
        catch (Exception e)
                {
                    System.err.println("An error occurered " + e);
                }
    }
   
    
}


