import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String username="ABC";
		String password="ABCDE";
		String uname,pssd;
		int i=1;
		while(i>0) {
			System.out.println("Username:");
			uname=sc.next();
			System.out.println("Password:");
			pssd=sc.next();
			if(username.equals(uname) && password.equals(pssd))
			{
				System.out.println("Welcome "+uname);
				break;
			}
			else
			{
				System.out.println("Username and Password are wrong!Re-enter");
				i++;
			}
			if(i>3) {
				System.out.println("Contact Admin");
				break;
			}
		}
	}
}