package corejava;

abstract class AbstractExample {
	abstract void show(); 
	
	
public static class  Example extends AbstractExample{

	@Override
	void show() {
	System.out.println("this  is  an abstract class example");
		
	}
public static void main (String args []) {
		AbstractExample obj = new Example();
		  obj.show();
	}
	
}

}
