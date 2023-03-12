package unresolved.solid.d.two;

public class Dog extends Animal{

	//!
	DogSpeakBehavior behavior=new DogSpeakBehavior();
	@Override
	public String Speak() {
		// TODO Auto-generated method stub
		//return "wuf";
		return behavior.Speak();
	}

	
}
