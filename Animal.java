/*
Subclasses and overriding
Examine the code for the class Animal, found in Animal.java
Create subclasses of Animal for Cow and Pig. Each subclass should override the talk method:
Cows “moo” and Pigs “oink”. The Cow and Pig constructor should explicitly invoke the
superclass constructor, passing in the argument 4 to initialize the number of legs. The Cow class
should provide one additional method public void makeMilk () that writes (to the
standard output) the message “I make milk”.
Examine the skeleton class AnimalTester.java. Add statements and comments as
directed in the comments within the class.
Upload Cow.java, Pig.java and AnimalTester.java to Moodle
*/
public class Animal {
  protected int numLegs;

  public Animal (int legs) {
    numLegs = legs;
  }    

  public void talk () {
    System.out.println("I'm an animal with " + numLegs + 
		" legs. I don't know how to talk.");
  }

}
