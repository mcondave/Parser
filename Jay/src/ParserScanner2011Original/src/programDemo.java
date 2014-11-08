package ParserScanner2011Original.src;

public class programDemo {
	
	public static void main(String[] args) {
		Program p = new Program();
		p.decpart = new Declarations();
		p.body = new Block();
		
		Declaration d = new Declaration();
		d.t = new Type("int");
		boolean bool = d.t.isInteger();
		d.v = new Variable();
		d.v.id = "i";
		
		Assignment a = new Assignment();
		a.source = new Value(5);
		a.target = new Variable();
		a.target.id = new String("i");
		System.out.println(a.display(0));
		
	}

}
