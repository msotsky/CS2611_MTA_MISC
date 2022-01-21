//Group : Max Sotsky, Mira Donaldson, Greg Hannem
public class AnimalTester {
    
  public static void testAnimalTester() {
    // 1. Instantiate an Animal object, referred to by variable a1.
    Animal a1 = new Animal(4);
    // 2. Invoke the talk method on the object referred to by variable a1.
    a1.talk();
    // 3. Make the variable a1 refer to a new Pig object.
    a1 = new Pig(4);
    // 4. Invoke the talk method on the object referred to by variable a1.
    a1.talk();
    // 5. Add a comment stating which class's talk method was invoked
    // 		when the Animal object reference variable a1 referred
    // 		to a Pig object (as in step 4).  Explain why.
    // The pig method was invoked because of polymorphism. 
    // 6. Instantiate a Cow object, referred to by variable c1.
    Cow c1 = new Cow(4);
    // 7. Invoke the talk method on the object referred to by variable c1.
    c1.talk();
    // 8. Invoke the makeMilk method on the object referred to by variable c1.
    c1.makeMilk();
    // 9. Make the variable a1 refer to the same object as variable c1.
    a1 = c1;
    // 10. Invoke the makeMilk method of the Cow object through the
    //		variable a1.
    // a1.makeMilk(); //(commented out because of error)
    // 11. Add a comment stating why it is impossible to make the
    //	variable c1 refer to object of the class Animal. 
    // It doesn't work since a1 can't just turn into a Cow, a cow object is more sophisticated.
  }
  public static void main (String args[]){
    testAnimalTester();
  }
}
