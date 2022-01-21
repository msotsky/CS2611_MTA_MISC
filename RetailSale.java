//Retail Sales: Retail customers can buy any number of hand pies. For orders of 5 or
//more hand pies, a retail customer receives a 10% discount applied to their entire
//order.

//base price 5 dollars per pie
import java.io.*; 
import java.util.*;
public class RetailSale extends Sale{

    public RetailSale(int numHandPies, GregorianCalendar calendar){
        super(numHandPies,calendar);
    }

    @Override
    public double getSaleAmount(){
        if (this.getNumPies() >= 5)   
            return this.getNumPies() - (0.1 * this.getNumPies());
        else
            return this.getNumPies() * 5;
        
    }
}