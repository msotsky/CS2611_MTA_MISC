public class TestInterface{ //group: Max Sotsky, Ayomide Adekiitan, Gorkem Malkoclu, Pushkaraj Jadhav
    
    public static void main(String[] args){
        Rabbit r = new Rabbit();
        r.eat();                            //part 1
        r.travel();

        KillerRabbit kr = new KillerRabbit();
        kr.breaththeFire();
        kr.yells("!!!!");                       //part 2
        kr.shhhh(". . . . .");
        kr.justSayin("hello world");
        kr.eat();
        kr.travel();
    }
}