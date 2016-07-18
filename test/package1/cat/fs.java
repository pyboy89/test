class father {
	String name;
	public void setname(String name) {
		/*this.name=name;*/
		System.out.println("пу");	
	}
	void setname() {
		System.out.println("нч");
	}
	/*father() {
  	System.out.println("нч");
  }*/
}
class son extends father {
	String name;
	public void setname(String name) {
		super.setname();
		this.name=name;
		System.out.println("пу"+name);	
	}
	son(String name) {
		this.name=name;
		System.out.println("пу"+name);
	}
	
		
}
public class fs {
	public static void main(String[] args) {
		son a=new son("кО");
		a.setname("юН");
		
	}
}