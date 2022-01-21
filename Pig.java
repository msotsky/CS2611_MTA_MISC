//Group : Max Sotsky, Mira Donaldson, Greg Hannem
public class Pig extends Animal{
    //private int numLegs;
    public Pig (int legs) {
        super(legs);
      }   
    @Override
    public void talk () {
        System.out.println("I'm a Pig with " + numLegs + 
            " legs. oink");
      }
}