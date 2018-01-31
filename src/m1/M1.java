package m1;
import java.math.BigDecimal;
import org.apache.commons.math3.distribution.NormalDistribution;

public class M1 {

    public static void main(String[] args) {
        double x,z1,z2;
        double S,K,T,sigma,r,y;        
        //d1test();  
        S=100;
        K=110;
        r=0.01;
        y=0;
        sigma=0.3;
        T=0.1;
        //bsa1 b = new bsa1(S,K,T,sigma,r,y);
        //z=b.xx();
        bsa1 b = new bsa1(S,K,T,sigma,r,y);                
        
        System.out.println("d1="+b.d1);
        System.out.println("d2="+b.d2);
        System.out.println("pdf(d1)="+b.pdf(b.d1));
        System.out.println("pdf(d2)="+b.pdf(b.d2));
        System.out.println("cdf(d1)="+b.cdf(b.d1));
        System.out.println("cdf(d2)="+b.cdf(b.d2));        
        System.out.println("call="+b.call());
        System.out.println("put="+b.put());
        System.out.println("deltaofCall="+b.delta("C"));
        System.out.println("deltaofPut="+b.delta("P"));
        System.out.println("gamma="+b.gamma());
        System.out.println("vega="+b.vega());
        //System.out.println("theta="+b.theta("C"));
        //System.out.println("theta="+b.theta("P"));
        System.out.println("rho="+b.rho("C"));
        System.out.println("rho="+b.rho("P"));
        
        //dd1(S,K,T,sigma,r,y) ;  
    } 
    
    //public static void dd1(double S,double K,double T,double sigma,double r,double y) 
    public static void dd1(double S,double K,double T,double sigma,double r,double y) 
    {
        double x,z,d1,d2,call,put;
        //double cdelta,pdelta;
        //double cgamma,pgamma;
        //double cvega,pvega;
        //double ctheta,ptheta;
        //double crho,prho,ry;
        //double S,K,T,sigma,r,y;
        //double K,T,sigma,r,y;
        //S=100;
        //K=110;
        //r=0.01;
        //y=0;
        //sigma=0.3;
        //T=0.1;
        //bsa b1=new bsa();  
        d1 =( Math.log(S/K) + (r-y + sigma * sigma / 2)* T ) / (sigma * Math.sqrt(T));          
        System.out.println("d1="+d1);
        
    }
    
    
    private static void d1test() {              
   	double x,z,d1,d2,call,put;
        double cdelta,pdelta;
        double cgamma,pgamma;
        double cvega,pvega;
        double ctheta,ptheta;
        double crho,prho,ry;
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
        //System.out.println("d1="+d1);
        //System.out.println("d2="+d2);
        
        //Op_Cvalue = S * NorCdf(d1) - K * Exp(-r * T) * NorCdf(d2)
        //call = S*b1.cdfapa(d1)- K*Math.exp(-r*T)* b1.cdfapa(d2) ;
        //Op_Pvalue = K * Exp(-r * T) * NorCdf(-d2) - S * NorCdf(-d1)
        //put = K*Math.exp(-r*T)* b1.cdfapa(-d2) - S*b1.cdfapa(-d1);        
        //System.out.println("call="+call);
        //System.out.println("put="+put);
        
        /*cdelta = Math.exp(-y * T) * b1.cdfapa(d1);
        pdelta = Math.exp(-y * T) * ( b1.cdfapa(d1)-1 );
        System.out.println("cdelta="+ cdelta);
        System.out.println("pdelta="+ pdelta);*/
        
        //gamma=Exp(-y * T) * NorPdf(d1) / (S * sig * Sqr(T))
        /*cgamma = Math.exp(-y * T) * b1.pdfapa(d1)/(S * sigma * Math.sqrt(T));
        pgamma = cgamma;
        System.out.println("cdelta="+ cgamma);*/
        
        //S * Exp(-y * T) * NorPdf(d1) * Sqr(T)        
        //cvega =  S * Math.exp(-y * T) * b1.pdfapa(d1)*Math.sqrt(T)  ;
        //s * Sqr(t) * n(d1) / 100
        /*cvega = S*Math.sqrt(T)*b1.pdfapa(d1)/100  ;//???
        pvega =cvega;
        System.out.println("cvega="+ cvega);       */
                
        //ctheta = (-s * v * n(d1) / (2 * Sqr(t)) - r * x * Exp(-r * t) * cumun(d2)) / 365 ;
        //GBSTheta = -S * Exp(-y * T) * NorPdf(d1) * sig / (2 * Sqr(T)) + y * S * Exp(-y * T) * NorCdf(d1) - r * K * Exp(-r * T) * NorCdf(d2)
        /*ctheta = ( -S * sigma * b1.pdfapa(d1)/(2*Math.sqrt(T) ) - r*K*Math.exp(-r*T) * b1.cdfapa(d2)) / 365 ;
        ptheta = ( -S * sigma * b1.pdfapa(d1)/(2*Math.sqrt(T) ) + r*K*Math.exp(-r*T) * b1.cdfapa(-d2)) / 365 ;
        System.out.println("cdelta="+ ctheta);
        System.out.println("pdelta="+ ptheta);*/
        
        //r=y: -T * GBSOption(OpClass, S, K, T, sig, r, y)
        //crho = T * K * Exp(-r * T) * NorCdf(d2)
        //prho =-T * K * Exp(-r * T) * NorCdf(-d2)
        //ry= -T * GBSOption(OpClass, S, K, T, sig, r, y)
        /*crho = T * K * Math.exp(-r * T) * b1.cdfapa(d2);
        prho = -T * K * Math.exp(-r * T) * b1.cdfapa(-d2);
        //System.out.println("r=y"+ ry);
        System.out.println("crho="+ crho);
        System.out.println("prho="+ prho);*/
        
        
        
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