package Random_Arrayx3;
import java.util.Random;
public class Random_Arrayx3 {

	public static void main(String[]args){

		Random random=new Random();

		int[] num=new int[3];

		for(int i=0; i<num.length; i++){

			int val=random.nextInt(3-1+1)+1;
			num[i]=val;

			System.out.println(val*3);
		}
	}
}
