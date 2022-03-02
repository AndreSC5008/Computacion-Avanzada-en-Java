/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tagsP;

import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author ansan
 */
public class TagCuerpo extends SimpleTagSupport{
    StringWriter sw = new StringWriter(); 
    @Override
    public void doTag() throws JspException, IOException {
       getJspBody().invoke(sw);
       getJspContext().getOut().println(sw.toString()+" "+Hora());
    }
    
    public String Hora(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        String hora = dtf.format(LocalDateTime.now());
        
        return hora;
    }
}
