package m1;
import org.apache.commons.math3.distribution.NormalDistribution;
public class bsa1 {
    final static double api=Math.PI;  
    double x;
    double S,K,T,sigma,r,y;  
    
    public bsa1(){}
    public bsa1(double x){}
    public bsa1(double S,double K,double T,double sigma,double r,double y){
        this.S=S;
        this.K=K;
        this.T=T;
        this.sigma=sigma;
        this.r=r;
        this.y=y;        
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
    public double dd1() 
    {
        double d1,d2;
        d1 =( Math.log(S/K) + (r-y + sigma * sigma / 2)* T ) / (sigma * Math.sqrt(T));          
        System.out.println("dd1="+d1); 
        return d1;
    }   
    

    
}
