//Group : Max Sotsky, Mira Donaldson, Greg Hannem
public class Cow extends Animal{
    public Cow (int legs) {
        super(legs);
      }   
    @Override
    public void talk () {
        System.out.println("I'm a Cow with " + numLegs + 
            " legs. Moo");
      }
    public void makeMilk (){
        System.out.println("I make milk");
    }

}