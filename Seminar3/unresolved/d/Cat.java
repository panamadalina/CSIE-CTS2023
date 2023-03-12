package unresolved.solid.d.two;

public class Cat extends Animal {

	//!
	CatSpeakBehavior behavior=new CatSpeakBehavior();
	
	
	@Override
	public String Speak() {
		// TODO Auto-generated method stub
		//return "miau";
		return behavior.Speak();
	}

}
