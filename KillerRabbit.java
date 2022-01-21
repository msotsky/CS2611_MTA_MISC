public class KillerRabbit extends Rabbit implements FireBreathable, Talkable{
    
   public void breaththeFire(){
        System.out.println("Breathing flames. Hot Hot");
   }
   
    public void yells(String str){
        System.out.println("Get off my lawn" + str);
    }

    public void shhhh(String str){
        System.out.println("Shhh. Shhh" +str);
    }
    
    public void justSayin(String str){
        System.out.println(str + " so I was sayin");
    }
}