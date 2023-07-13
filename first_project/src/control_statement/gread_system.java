package control_statement;

public class gread_system {

	public static void main(String[] args) {
		// <50=fail
		// 50 to 60 = D
		// 60 to 70 =C
		// 70 to 80=B
		// 80 to 90=A
		// 90 to 100=A+

		int i = -7;

		if (i < 50) {
			System.out.println("Fail");
		}
		else if(i>=50 && i<60) {
			System.out.println("D grade");
		}
		else if(i>=60 && i<=70) {
			System.out.println("C grade");
		}
		else if(i>=70 && i<=80) {
			System.out.println("B grade");
			}
		else if(i>=80 && i<=90) {
			System.out.println("A grade");
		}
		else if(i>=90 && i<=100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("Invalid!");
		}
	}
}
