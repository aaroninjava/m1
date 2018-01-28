package m1;
import java.math.BigDecimal;
import org.apache.commons.math3.distribution.NormalDistribution;

public class M1 {

    public static void main(String[] args) {
        double x,y;
        test();  
    } 
    
    private static void test() {              
   	double x,y,z;
        NormalDistribution n1 = new NormalDistribution();
        x=0;
        y=n1.density(x);
        z=n1.cumulativeProbability(x);
        System.out.println("ndf("+x+")="+y);
        System.out.println("cdf("+x+")="+z);
    }  
    
    
}
        /*x=1000;        
        y=Math.floor(-3.999999);*/
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
        
        /*double a = 3.45454;
        double b = new BigDecimal(a)
                           .setScale(3, BigDecimal.ROUND_HALF_UP)
                           .doubleValue();
        System.out.println("四捨五入到小數點下一位: " + b);*/
        
        //y=Math.round(3.499999);            