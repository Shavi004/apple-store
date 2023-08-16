/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shavionanayakkara
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cashier_details {
    
    private static String FILE_PATH ="/Users/shavionanayakkara/Documents/istore/details.txt" ;
    File file;
    private String fileName;

    public cashier_details (String fileName) 
    {
        this.fileName = fileName;
        registerFile();
    }

    public boolean registerFile() 
    {
        try 
        {
            file = new File(FILE_PATH + fileName);
            if (file.createNewFile()) 
            {
                System.out.println("File Created: " + file.getName());
                return true;
            }
            
            System.out.println("File Alredy Exisit !");
            return false;
        } 
        
        catch (IOException e)
        {
            System.out.println("Something went wrowng with creating file" + e);
            return false;
        }
    }
    public boolean registerFile(String record) 
    {
        try {
            file.createNewFile();
            FileWriter newWrite = new FileWriter(file, true);
            BufferedWriter newBuffer = new BufferedWriter(newWrite);

            newBuffer.write(record);
            newBuffer.newLine();
            newBuffer.close();
            newWrite.close();
            return true;
        } 
        catch (IOException e) 
        {
            System.out.println("Something went wrowng with writing file" + e);
            return false;
        }
    }
    public BufferedReader readFile() 
    {
        if (!registerFile())
        {
            try 
            {
                FileReader reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);
                return buffer;
            } 
            
            catch (IOException e) 
            {
                System.out.println("Something went wrowng with reading file" + e);
            }
        }
        return null;
    }
}
    

