/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ansan
 */


@Controller

public class HomeController {

@RequestMapping(value="holaMundo.htm",method= RequestMethod.POST)    
public String holaMundo(){
    System.out.println("Hola Mundo");
    return"holaMundo";
}

}
