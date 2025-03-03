package solid.com.l;
//Open / Closed Principle
//Open for Extension but closed for Modification
public class Test {
	 static void getAreaTest(Rectangle r) {
	      int width = r.getWidth();
	      r.setHeight(10);
	      System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
	  }

	  public static void main(String[] args) {
	      Rectangle rc = new Rectangle(4, 5);
	      getAreaTest(rc);

	      Rectangle sq = new Square();
	      sq.setWidth(5);
	      getAreaTest(sq);
	  }
}
