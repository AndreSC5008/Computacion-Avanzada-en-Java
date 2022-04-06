/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act11.mvc1;

import com.act11.mvc.classes.Suma;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ansan
 */
@Controller
public class SumaController {
    
    @RequestMapping(value = "sumaresultado.htm", method = RequestMethod.POST)
    public String sumaResultado(Locale locale, Model model, Suma suma) {
        model.addAttribute("formulario", suma);
        return "sumaResultado";
    }
}
