/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecodeup.ws;
import java.sql.SQLException;
import javax.xml.ws.Endpoint;
import java.util.Scanner;
/**
 *
 * @author Dark Matth
 */
public class empleadoPublish {
   static Scanner information = new Scanner(System.in); 
    public static void main (String [] args) throws SQLException{
        String employeeName;
        String employeeLastName;
        int employeeAge;
        int employeeGender; 
        agregarEmpleado newEmployee = new agregarEmpleado();
        System.out.print("Type your name: ");
        newEmployee.setName(information.next());
        System.out.print("Type your last name: ");
        newEmployee.setLastName(information.next());
        System.out.print("Type your age: ");
        newEmployee.setAge(information.nextInt());
        System.out.print("Type your gender with numbers(1-Male,2-Female,3-LGBTIQ): ");
        newEmployee.setGender(information.nextInt());
        employeeName = newEmployee.getName();
        employeeLastName = newEmployee.getLastName();
        employeeAge = newEmployee.getAge();
        employeeGender = newEmployee.getGender();
        newEmployee.nuevoEmpleado(employeeName, employeeLastName, employeeAge, employeeGender);
        newEmployee.conectarDB();
        Endpoint.publish("http://localhost/WS/agregarEmpleado",new agregarEmpleado());
    }
}
