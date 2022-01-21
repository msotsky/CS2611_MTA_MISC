//Web Sales: Web customers are given a flat 15% off any order of 2 or more pies
import java.io.*; 
import java.util.*;
public class OnlineSale extends Sale{
    public OnlineSale(int numHandPies, GregorianCalendar calendar){
        super(numHandPies,calendar);
    }
    @Override
    public double getSaleAmount(){
        if(this.getNumPies() < 2)
            return this.getNumPies() * 5;
        else
            return this.getNumPies() - (this.getNumPies() * 0.15);
    }
}