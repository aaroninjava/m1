package m1;
import java.math.BigDecimal;
import org.apache.commons.math3.distribution.NormalDistribution;

public class M1 {

    public static void main(String[] args) {
        double x,y;
        d1test();  
    } 
    
    private static void d1test() {              
   	double x,z,d1,d2,call,put;
        double S,K,T,sigma,r,y;
        S=100;
        K=110;
        r=0.01;
        y=0;
        sigma=0.3;
        T=0.1;
        bsa b1=new bsa();        
        //d1 = (   Log(S / K) + (r - y + sig * sig / 2) * T) / (sig * Sqr(T))
        //d1 =Math.log(S / K);
        //d1 =(r - y + sigma * sigma / 2)*T;
        //d1 =( Math.log(S/K) + (r-y + sigma * sigma / 2)* T );        
        //d1 =(sigma * Math.sqrt(T));        
        d1 =( Math.log(S/K) + (r-y + sigma * sigma / 2)* T ) / (sigma * Math.sqrt(T));   
        //d2 = d1 - sig * Sqr(T)
        d2 = d1- sigma * Math.sqrt(T) ;
        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        
        //Op_Cvalue = S * NorCdf(d1) - K * Exp(-r * T) * NorCdf(d2)
        call = S*b1.cdfapa(d1)- K*Math.exp(-r*T)* b1.cdfapa(d2) ;
        //Op_Pvalue = K * Exp(-r * T) * NorCdf(-d2) - S * NorCdf(-d1)
        put = K*Math.exp(-r*T)* b1.cdfapa(-d2) - S*b1.cdfapa(-d1);
        
        System.out.println("call="+call);
        System.out.println("put="+put);
        
        
        
        //z=b1.cdfapa(x);        
        //System.out.println("cdf("+x+")="+z);
        
        
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