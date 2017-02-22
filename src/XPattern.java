
public class XPattern {

	public static void main(String[] args) {
		int num=5;
		char c='*';
		for(int i=0;i<num;i++)
		{
			for(int j = 0; j<num;j++)
			{
				if(i==j||i+j==num-1)
				{
					System.out.print(c);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
