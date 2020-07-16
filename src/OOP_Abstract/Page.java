package OOP_Abstract;

public abstract class Page {
	public Page(){
		System.out.println("Page class -- const....");
	}
	
	abstract void header();
	
	abstract void title();
	
	public final void footer(){
		System.out.println("page -- footer");
	}
	
	public static void plugin(){
		System.out.println("Page  -- plugins");
	}
}
