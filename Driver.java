import java.util.Random;

public class Driver 

{

public static void main(String[] args) 

{

int[] ar = new int[10];

Random r = new Random();


for(int i = 0; i < ar.length; i++)

{

ar[i] = r.nextInt(10);

}


//Driver.display(ar);

//Driver.bubbleSort(ar);

//Driver.display(ar);
System.out.println(Driver.fact(5));

}

static int fact(int n)
{
	if(n==1)return 1;
	return n * Driver.fact(n-1);
	
	/*this is the same as what is above it  
	 * if(n==1)
	 * (
	 * 		return 1;
	 * )
	 * return n * Driver.fact(n-1);
	 */
}
 
static int factorial(int n)
{
	int answer = 1;
	for(int i =1; i <= n;i--)
	{
		answer *= i;
	}
	return answer;
}


static void bubbleSort(int[] ar)

{

//perform the bubble sort algorithm in place
	for(int currStart = 1; currStart < ar.length; currStart++)
	{
	int theFollower = currStart;
	while(theFollower != 0 && ar[theFollower] <= ar[theFollower - 1])
		{
			int temp = ar[theFollower];
			ar[theFollower] = ar[theFollower - 1];
			ar[theFollower - 1] = temp;
			theFollower--;
			
		}
	}

}


static void display(int[] elephant)

{

System.out.println("****");

for(int i = 0; i < elephant.length; i++)

{

System.out.println(elephant[i]);

}

System.out.println("****");

}

}

