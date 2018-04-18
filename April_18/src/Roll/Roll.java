package Roll;
import java.util.Scanner;
import java.util.Random;
public class Roll {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();

		int counter=0;

		for(int i=0; i<=500; i++){

			System.out.println("Do you want to roll? Yes or no?");
			String answer=scanner.nextLine();

			if(answer.equals("yes")){

				int val=random.nextInt(6-1+1)+1;

				System.out.println("You rolled a " + val);

				if(val>1){

					counter=counter+val;
				}
				if(val==1){

					System.out.println("You lose, you rolled a " + val);
					return;
				}
			}

			if(answer.equals("no")){

				System.out.println("Your final score is " + counter );
				return;
			}
		}
	}
}

