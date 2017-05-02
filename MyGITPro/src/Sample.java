
public class Sample 
{
public static void main(String args[])
{
	String gen[]={"Male","Female"};
	int Sal=10000;
	String dept[]={"sales","account","finance","mgt"};
	for (int i=1;i<=100;)
	{
		System.out.println(i+":"+"Name"+i+":"+gen[0]+":"+Sal+":"+dept[0]);
		Sal+=1000;
		i++;
		System.out.println(i+":"+"Name"+i+":"+gen[1]+":"+Sal+":"+dept[1]);
		Sal+=1000;
		i++;
		System.out.println(i+":"+"Name"+i+":"+gen[0]+":"+Sal+":"+dept[2]);
		Sal+=1000;
		i++;
		System.out.println(i+":"+"Name"+i+":"+gen[1]+":"+Sal+":"+dept[3]);
		Sal+=1000;
		i++;
	}
}
}
