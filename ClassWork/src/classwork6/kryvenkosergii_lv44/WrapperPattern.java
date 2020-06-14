package classwork6.kryvenkosergii_lv44;

class Box {
	  private Object obj;
	  public void set(Object obj) { this.obj = obj; }
	  public Object get( ) { return obj; }
	}

class WrapperBox {
	  private Box box = new Box();
	  public void set(String text) { this.box.set(text); }
	  public String get( ) { return (String) box.get(); }
	}

public class WrapperPattern {

	public static void main(String[] args) {
		String text = "Hello World";
	      WrapperBox box = new WrapperBox();
	      box.set(text);
	      String i = (String) box.get();
	      System.out.println(i);
	}

}
