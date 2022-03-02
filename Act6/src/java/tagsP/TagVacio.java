/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tagsP;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ansan
 */
public class TagVacio extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
      JspWriter out = getJspContext().getOut(); 
      out.println("\n Roberto André Sánchez Curiel "+ Fecha()); 
    }
    
    
    public String Fecha(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = dtf.format(LocalDateTime.now());
        
        return fecha;
    }
}
