import javax.swing.JFrame;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gui p = new Gui();	
		Gui s= new Gui();
		
		System.out.println(p.getClass());
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setVisible(true);
		p.setSize(200, 300);

	}

}
