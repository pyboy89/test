class father {
	String name;
	public void setname(String name) {
		/*this.name=name;*/
		System.out.println("��");	
	}
	void setname() {
		System.out.println("��");
	}
	/*father() {
  	System.out.println("��");
  }*/
}
class son extends father {
	String name;
	public void setname(String name) {
		super.setname();
		this.name=name;
		System.out.println("��"+name);	
	}
	son(String name) {
		this.name=name;
		System.out.println("��"+name);
	}
	
		
}
public class fs {
	public static void main(String[] args) {
		son a=new son("��");
		a.setname("��");
		
	}
}