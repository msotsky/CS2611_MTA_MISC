import java.io.*; 
import java.util.*;
public class TestPiSales{ //group: Zachary Chamberlain, greg hannem
    public static void main(String[] args) throws IOException{
        //File file = new File("C:\\Users\\mxm20\\Desktop\\CSJava\\salesData.txt");
        File file = new File("salesData.txt");
        //BufferedReader br = new BufferedReader(new FileReader(file));
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(file).useDelimiter(" ");
        //sale-code number-of-handpies-sold year month day-of-month 
        int year = 0;
        int month = 0;
        int day = 0;
        int sold = 0;
        //System.out.println(sc.nextInt());
        //System.out.println(sc.nextInt());
        //System.out.println(sc.nextInt());
        //System.out.println(sc.nextInt());

    
        while(sc.hasNextLine()){
            
            if(sc.nextInt() == 1)  //(5 ints per line)
            {
                sold = sc.nextInt();
                year = sc.nextInt();
                //month = sc.nextInt();
                //day = sc.nextInt();
                GregorianCalendar cal = new GregorianCalendar(year,month,day);
                RetailSale s = new RetailSale(sold,cal);
                //s.toString();
            }
            else if (sc.nextInt() == 2){
                sold = sc.nextInt();
                year = sc.nextInt();
                month = sc.nextInt();
                day = sc.nextInt();
                GregorianCalendar cal = new GregorianCalendar(year,month,day);
                VolumeSale s = new VolumeSale(sold,cal);
                s.toString();
            }
            else if (sc.nextInt() == 3){
                sold = sc.nextInt();
                year = sc.nextInt();
                month = sc.nextInt();
                day = sc.nextInt();
                GregorianCalendar cal = new GregorianCalendar(year,month,day);
                OnlineSale s = new OnlineSale(sold,cal);
                s.toString();
            }
            else{
                sc.nextInt();
                sc.close();
            }
        }


    }
}