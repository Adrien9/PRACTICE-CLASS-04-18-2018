package Random_Array;
import java.util.Random;
public class Random_Array {

	public static void main(String[] args) {

		Random random=new Random();

		int[] num=new int[50];

		for(int i=0; i<num.length; i++){

			int val=random.nextInt(62-25+1)+25;
			num[i]=val;
			System.out.println(num[i]);
		}
	}
}
