/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Random;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author neoautomator
 */
public class strings {

    static  String datoC;


    public  static boolean Numero(String dato){
        try {Integer.parseInt(dato);return true;}
        catch (NumberFormatException nfe){return false;}
}
        public  static boolean Caracter(String dato){

        Pattern patron;
        patron = Pattern.compile("[^A-Za-záéíóúÁÉÍÓÚüÜ]");
        Matcher encaja = patron.matcher(dato);
        
        if(!encaja.find()){
           return true;}
           else{return false;}            
}
        
       public  static boolean Correo(String dato){
        Pattern patron = Pattern.compile("^([0-9a-zA-Z] ([_.w]*[0-9a-zA-Z]) *@([0-9a-zA-Z][-w]*[0-9a-zA-Z].) +([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        Matcher encaja = patron.matcher(dato);
        if (encaja.find()) {
            System.out.println("[" + encaja.group() + "]");
            return true;
        }else{
            return false;
        }   
          } 
        public  static boolean Alfa(String dato){

        Pattern patron;
        patron = Pattern.compile("^[0-9a-zA-ZáéíóúÁÉÍÓÚüÜ]");
        Matcher encaja = patron.matcher(dato);
        
        if(!encaja.find()){
           return true;}
           else{return false;}          
        
}

    public  static boolean IPE(String dato){

         Pattern patron;
        patron = Pattern.compile("^([0-9.](\\d{1,3}\\.\\d{1,3}.\\d{1,3}.\\d{1,3}))$");
        Matcher encaja = patron.matcher(dato);
        
        if(encaja.find()){
            StringTokenizer cadenaIP;
                      cadenaIP= new StringTokenizer(datoC,".");
                       while(cadenaIP.hasMoreTokens()){
                         int tok= Integer.parseInt(cadenaIP.nextToken());
                         if(tok<256){
                             System.out.println( tok);
                         }else{ 
                             System.out.println( " No es Ip");break;}
                       }
           return true;}
           else{return false;}   
        
}


  public static void main(String strings[]){
                
     datoC= "201.11.999.80";
     
     
if (Numero(datoC)){
	System.out.println(datoC + " Es un numero");}
else{
	System.out.println(datoC + " NO es un numero");}

if (Caracter(datoC)){
	System.out.println(datoC + " Es letra");}
else{
	System.out.println(datoC + " No es letra");}                  
      
if (Correo(datoC)){
	System.out.println(datoC + " Es Cooreo ");}
else{
	System.out.println(datoC + " No es correo");}  
      
if (Alfa(datoC)){
	System.out.println(datoC + " Es AlfaN ");}
else{
	System.out.println(datoC + " No es AlfaN");}  
if (IPE(datoC)){
	System.out.println(datoC + " Es IP ");
}
  
     else{
	System.out.println(datoC + " No es Ip");}       


String[] nombreFuentes=getToolkit().getFontList();
        for(int i=0; i<nombreFuentes.length; i++){
            System.out.println(nombreFuentes[i]);
        }

}

    private static Object getToolkit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
