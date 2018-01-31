package m1;
import org.apache.commons.math3.distribution.NormalDistribution;
public class bsa1 {
    final static double api=Math.PI;  
    double x,d1,d2,pdfa,cdfa;    
    double S,K,T,sigma,r,y;  
    NormalDistribution n1 = new NormalDistribution();    
    
    public bsa1(){}
    public bsa1(double x){}
    public bsa1(double S,double K,double T,double sigma,double r,double y){
        this.S=S;
        this.K=K;
        this.T=T;
        this.sigma=sigma;
        this.r=r;
        this.y=y;
        d1 =( Math.log(S/K) + 
                (r-y + sigma * sigma / 2)* T ) / (sigma * Math.sqrt(T));
        d2 = d1- sigma * Math.sqrt(T) ;    
        
    }
          
    public double cdf(double x)
    {                     
        double cdf1;                
        cdf1=n1.cumulativeProbability(x);
        return cdf1;        
    }
    
    public double pdf(double x)
    {                     
        double pdf1;                
        pdf1=n1.density(x);
        return pdf1;        
    }
    
    //Op_Cvalue = S * NorCdf(d1) - K * Exp(-r * T) * NorCdf(d2)
    public double call()
    {                     
        double calla;                
        calla=S*cdf(d1)- K*Math.exp(-r*T)* cdf(d2);        
        return calla;        
    }
    
    //Op_Pvalue = K * Exp(-r * T) * NorCdf(-d2) - S * NorCdf(-d1)
    public double put()
    {                     
        double puta;                
        puta=K*Math.exp(-r*T)* cdf(-d2) - S*cdf(-d1);         
        return puta;        
    }
    
    //cdelta = Math.exp(-y * T) * b1.cdfapa(d1);
    //public double deltaC() 
    public double delta(String CP) 
    {
        double delta1;
        if (CP=="C")
            {delta1 = Math.exp(-y * T) * cdf(d1);}
        else
            {delta1 = Math.exp(-y * T) * ( cdf(d1)-1 );}
        System.out.println("delta="+delta1); 
        return delta1;
    }
        
    public double gamma() //call.put相同
    {
        double gamma1;
        gamma1 = Math.exp(-y * T) * pdf(d1)/(S * sigma * Math.sqrt(T));
        System.out.println("gamma="+gamma1); 
        return gamma1;
    }
    
    public double vega() //call.put相同..要除以100% ??
    {
        double vega1=0;
        //gamma1 = Math.exp(-y * T) * pdf(d1)/(S * sigma * Math.sqrt(T));
        vega1 =  S * Math.exp(-y*T) * pdf(d1) * Math.sqrt(T)  ;
        System.out.println("vega="+vega1); 
        return vega1;
    }
    
    public double theta(String CP) 
    {
        //double gamma1;
        //gamma1 = Math.exp(-y * T) * pdf(d1)/(S * sigma * Math.sqrt(T));
        
        //ctheta = ( -S * sigma * b1.pdfapa(d1)/(2*Math.sqrt(T) ) - r*K*Math.exp(-r*T) * b1.cdfapa(d2)) / 365 ;
        double theta1;
        if (CP=="C")
            {theta1 = ( -S*sigma*pdf(d1) / (2*Math.sqrt(T))  
		    -   r*K*Math.exp(-r*T) * cdf(d2)    )  ;}//要除以365天??
        else
            {theta1 = ( -S*sigma*pdf(d1) / (2*Math.sqrt(T))  
		    +   r*K*Math.exp(-r*T) * cdf(-d2)    ) ;} //要除以365天??
        //ptheta = ( -S * sigma * b1.pdfapa(d1)/(2*Math.sqrt(T) ) + r*K*Math.exp(-r*T) * b1.cdfapa(-d2)) / 365 ;
                
        System.out.println("theta="+theta1); 
        return theta1;
    }
    
    public double rho() 
    {
        double gamma1;
        gamma1 = Math.exp(-y * T) * pdf(d1)/(S * sigma * Math.sqrt(T));
        System.out.println("rho="+gamma1); 
        return gamma1;
    }
    
    
//public void double xx(double x) 
    public double xx() 
    {
        double x1;
        x1=x;
        //x1 =x/2;         
        //System.out.println("xx="+x1);        
        System.out.println("S="+S); 
        System.out.println("K="+K); 
        return S/10;
    } 
    
    //public static void dd1(double S,double K,double T,double sigma,double r,double y) 
    /*public double dd1() 
    {
        double d1a;
        d1a =( Math.log(S/K) + (r-y + sigma * sigma / 2)* T ) / (sigma * Math.sqrt(T));          
        System.out.println("dd1="+d1a); 
        return d1a;
    } */  
    
    
}
