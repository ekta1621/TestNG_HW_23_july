package loops_program;

public class For_loop_5_multiple {

	public static void main(String[] args) {
		int sum = 0;
		//int j=50;
		for(int j=50; j>=1; j++){
			if (j * 5 == 0) {
				j++;
				sum = sum + j;
				
			}
			System.out.println(sum);
			
		}

	}

}
