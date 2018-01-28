/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1;
import java.math.BigDecimal;
/**
 *
 * @author A
 */
public class M1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        double x,y;
        x=1000;
        //y=Math.sqrt(x);
        //System.out.println("sqr("+x+")="+y);        
        //y=Math.abs(x);        
        //System.out.println("abs("+x+")="+y);                
        //y=Math.exp(x);        
        //System.out.println("exp("+x+")="+y);        
        //y=Math.pow(10,x);        
        //System.out.println("pow(10,x) ="+y);    
        //y=Math.log(x);        
        //System.out.println("ln(x) ="+y);        
        //y=Math.log10(x);        
        //System.out.println("log10(x) ="+y);
        /*x=Math.E;    
        y=Math.PI;            
        System.out.println("PI="+y);
        System.out.println("e="+x);       */
        
        double a = 3.45454;
        double b = new BigDecimal(a)
                           .setScale(3, BigDecimal.ROUND_HALF_UP)
                           .doubleValue();
        System.out.println("四捨五入到小數點下一位: " + b);
        
    }
    
    
}
