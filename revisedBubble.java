//REVISEDBUBBLE: this algorithm will break out of the outer loop if no alterations have been made during
//that iteration of a loop.

import java.util.Scanner;
import java.util.ArrayList;

public class revisedBubble{

	public static void main(String [] args){


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a list of numbers to see them sorted.\nEnter anything other than an integer to finish your list.");

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		int input;
		

		while (scanner.hasNextInt())
		{
			input = scanner.nextInt();
			list.add(input);
		}

		if (list.size() == 0)
		{
			System.out.println("No input to sort");
		}
		else
		{
			sorted = revisedbubble(list);
		}
		

		//print out the sorted list
		System.out.print("The sorted list is: ");
		for(int i = 0; i < sorted.size(); i++){

			System.out.print(sorted.get(i) + " ");
		}

		System.out.println();

	}

	static ArrayList<Integer> revisedbubble( ArrayList<Integer> x ){

		int n = x.size();
		boolean done = false;
		//int counter = 0;
		int i = 0;

		for(i = 0; i < n-1; i++){
			done = true;

			for(int j = 0; j < n-i-1; j++)
			{
				//counter ++;
				if( x.get(j).compareTo( x.get(j+1) ) > 0 )
				{
					swap(x,j,j+1);
					done = false;

				}
			}
			
			if(done == true)
			{
				break;
			}

		}

		//Diagonstic tests

		//System.out.println(counter);
		//System.out.println(i);

		return x;
	}


	static ArrayList<Integer> swap( ArrayList<Integer> array, int index1, int index2 ){

		int temp = array.get(index1);
		array.set(index1,array.get(index2));
		array.set(index2,temp);

		return array;

	}

}