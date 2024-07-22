
class NewNode{
	int val;
	NewNode next;
	NewNode(int val){
		this.val=val;
	}
	NewNode(int val,NewNode next){
		this.val=val;
		this.next=next;
	}
}

public class DemoLeet {

	public static void main(String[] args) {
		NewNode l1=new NewNode(2);

		l1=l1.next;
		
		

	}

}
