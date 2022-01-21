import java.io.*; 
import java.util.*;
abstract class Sale{
    //public GregorianCalender(int year, int month, int dayOfMonth);


    private int numHandPies;
    private GregorianCalendar calendar;

    public Sale (int numHandPies, GregorianCalendar calendar){
            this.numHandPies = numHandPies;
            this.calendar = calendar;
    }

    public int getNumPies(){
        return this.numHandPies;
    }
    public GregorianCalendar getSaleDate(){
        return this.calendar;
    }

    @Override
    public String toString(){
        return "" + this.numHandPies + this.calendar.MONTH + this.calendar.DAY_OF_MONTH + this.calendar.YEAR;
    }
    public abstract double getSaleAmount();

}