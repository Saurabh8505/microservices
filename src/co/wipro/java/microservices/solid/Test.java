package co.wipro.java.microservices.solid;

public class Test {
	 static void getAreaTest(Rectangle r) {
	      int width = r.getWidth();
	      r.setHeight(10);
	      System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
	  }

	  public static void main(String[] args) {
	      Rectangle rc = new Rectangle(3, 4);
	      getAreaTest(rc);

	      Rectangle sq = new Square();
	      sq.setWidth(5);
	      getAreaTest(sq);
	  }
}
