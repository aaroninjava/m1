package m1;
import org.apache.commons.math3.distribution.NormalDistribution;

public class bsa {
    final static double api=Math.PI;
    final double y=1;
    double z=0;
    
    bsa(){
        //System.out.println(api);   
    }
    double cdfapa(double x)
    {                     
        NormalDistribution n1=new NormalDistribution();
        n1.density(0);
        return x;
    }
        
    public static double ndfa(double x){        
        //ndf1=Math.exp(-Math.pow(x,2)/2);//Exp(-x ^ 2 / 2)
        //ndf2=Math.sqrt(2*api);//Sqr(2 * Pi)
        //ndf=Math.exp(Math.pow(x,2));//Exp(-x ^ 2 / 2)
        //ndf=1/Math.sqrt(2*api);
        return x;
    }
    
    static class ND
    {
        static double ndfa(double x)
        {                     
        //ndf1=Math.exp(-Math.pow(x,2)/2);//Exp(-x ^ 2 / 2)
        //ndf2=Math.sqrt(2*api);//Sqr(2 * Pi)
        //ndf2=ndf1/ndf2****
        return Math.exp(-Math.pow(x,2)/2)/Math.sqrt(2*api);            
        }
        static double cdfa(double x)
        {                     
            double z,g;    
            final double a1=0.4361836;
            final double a2=-0.1201676;
            final double a3=0.937298;
            g = 1 / (1 + 0.33267 * x);
            
            if (x >= 0)
                {z = 1 - (a1 * g + a2 * g * g + a3 * g * g * g) * ndfa(x);}
            else
                {z = 1 - ndfa(-x);}            
            return z;            
        }
        static double cdfa1(double x)
        {                     
            double z,k,i;    
            final double a1=0.31938153;
            final double a2=-0.356563782;
            final double a3=1.781477937;
            final double a4=-1.821255978;
            final double a5=1.330274429;
            i = Math.abs(x);
            k = 1 / (1 + 0.2316419*i);            
            if(x>6) {z=1;}
            else if(x<-6) {z=0;}
            else if((x>=0) & (x<=6))
                {z=0.5;}
            else if((x>=-6) & (x<0))
                {z=0.5;}
            else 
                {z=x;}
            return z;    
        }
        

    }
    
    static class Math2
    {
        static double RArea(double r)
        { return 3.14*r*r; }
    }
    

}
