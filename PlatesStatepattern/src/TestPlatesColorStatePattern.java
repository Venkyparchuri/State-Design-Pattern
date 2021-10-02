
public class TestPlatesColorStatePattern {
	
	public static void main(String args[]) {
		
		PlatesColorContext colorContet = new PlatesColorContext();
				
				colorContet.setState(new RedColor());
		
		           colorContet.changeColor();
		           
		           System.out.println("\nApplying green color\n");
		           
		           colorContet.setState(new GreenColor());
		   		
		           colorContet.changeColor();
		
		
	}

}
