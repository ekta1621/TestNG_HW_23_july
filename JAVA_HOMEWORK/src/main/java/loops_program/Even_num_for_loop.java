package loops_program;

public class Even_num_for_loop {
	
	public static void main(String[] args) {
	int n = 50;
	for (int i = 1; i <= n; i++) {
		   if (i % 2 == 0) {
			   System.out.print(i + " ");
		   }
	}
}
}