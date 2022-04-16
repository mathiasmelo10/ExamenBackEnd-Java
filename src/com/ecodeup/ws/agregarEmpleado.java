/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecodeup.ws;
import conectarDB.Conectar;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;
import javax.jws.WebService;



@WebService(endpointInterface = "com.ecodup.ws.Negocio")
public class agregarEmpleado implements Negocio {
    static Scanner inputText = new Scanner(System.in); 
    
    public String employeeName;
    public String employeeLastName;
    public int employeeAge;
    public int employeeGender;
    
    public static void conectarDB() throws SQLException{
        Conectar mysqlConnection = new Conectar();
        Connection openConnection = mysqlConnection.getConexion();
        System.out.print("Established connection succesfully");
        Statement stmt = openConnection.createStatement();
        
    }
    
    public agregarEmpleado(){
        
    }
   
    public agregarEmpleado(String eName,String eLastName,int eAge,int eGender){
        employeeName = eName;
        employeeLastName = eLastName;
        employeeAge = eAge;
        employeeGender = eGender;
    }
    
  @Override
    public void nuevoEmpleado(String name, String lastName, int age, int gender) {
        employeeName = name ;
        employeeLastName = lastName;
        employeeAge = age;
        employeeGender = gender;
        
       // CallableStatement stmt = con.prepareCall("{? = call USER.DATABASE.FNINSERT(name,lastName,age,gender)}");
        //Hacer tablas y atributos de las mismas, vincular con Connector/J de MYSQL 
       
    }
    
    
    
    public void setName(String eName){
        employeeName = eName;
        
    }
    
    public void setLastName(String eLastName){
        employeeLastName = eLastName;
    }
    
    public void setAge (int eAge){
        employeeAge = eAge;
    }
      
    public void setGender (int eGender){
        employeeGender = eGender;
    }
    
    public String getName(){
        return employeeName; 
    }
    
    public String getLastName(){
        return employeeLastName;
    }
    
    public int getAge(){
        return employeeAge;
    }
    
    public int getGender(){
        return employeeGender;
    }
    
   
   
   
   
  
   
    

   

    
   
    
 }
  
   
