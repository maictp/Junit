package junit.tutorial;

public class Calculator {
	public int multi(int x, int y) {
		return x*y;
		
	}
	
	public float divide (float x, float y) {
		if(y==0) throw new IllegalArgumentException("divide by zero.");
		return x/y;
	}
	
	public int a;
    public int b;
    
    public int getA() {
    	return a;
    }
    
    public int  getB() {
    	return b;
    }

    public void setA(int a) {
    	this.a =a;
    }
    
    public void setB(int b) {
    	this.b =b;
    }
    
    public Calculator(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    public Calculator() {}
}
