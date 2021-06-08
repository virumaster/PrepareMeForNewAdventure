package BasicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibinacci {
	
	public void printFibonacciSeries(int n) 
	{
		System.out.println("The input value is " + n);
		int a=0, b=1;
		if (n==1)
			System.out.print(a);
		else if (n>1)
		{
			System.out.print(a + " " + b);
			for (int i = 2; i < n; i++) {
				System.out.print(" " + (a + b));
				int temp = a;
				a = b;
				b = b + temp;
			}
		}
		
	}
	
	public int fibo(int num)
	{
		if (num<2)
		{
			return num;
		}
		else
		{
			return fibo(num-1) + fibo(num-2);
		}
	}
	
	public void printFiboRecursion(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(" " + fibo(i));
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        System.out.print("Enter the number : ");
        int n= Integer.parseInt(reader.readLine());
		
		Fibinacci f = new Fibinacci();
		f.printFibonacciSeries(n);
		
		System.out.print("\n\n\n");
		f.printFiboRecursion(n);
	}
}
