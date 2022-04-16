/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ecodeup.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Negocio {
    @WebMethod
    public void nuevoEmpleado(String name,String lastName,int age,int gender);

    
        
        
    
        
    
}
