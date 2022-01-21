/*
Volume Sales: Wholesale customers must purchase a minimum of 10 pies at a time.
Wholesale customers are given a 20% discount on their first ten pies and get an
additional 1% discount on each order for each pie they purchase over 10. Orders of
30 or more pies are discounted 40% in total.
*/
import java.io.*; 
import java.util.*;
public class VolumeSale extends Sale{

    public VolumeSale(int numHandPies, GregorianCalendar calendar){
        super(numHandPies,calendar);
    }

    @Override
    public double getSaleAmount(){
        if (this.getNumPies() < 10)   
            return 0;
        else if(this.getNumPies() == 10)
            return 8;
        else{
            double discount = this.getNumPies() * 0.05;
             //after 20 percent
            return this.getNumPies() - (discount + 2);
        }
        
    }
}
