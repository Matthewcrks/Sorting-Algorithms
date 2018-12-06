// program to implement Bubble sort in java because I haven't coded in a while
//if want to declare and initialize array it looks like this: String[] myStringArray = new String[3];
import java.util.Scanner;
import java.util.ArrayList;

public class BubbleSort{

	public static void main(String [] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a list of numbers to see them sorted. Enter anything other than an integer to finish your list.");
		

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		int input;
		

		while (scanner.hasNextInt()){

			input = scanner.nextInt();
			list.add(input);
		}

		if (list.size() == 0){
			System.out.println("No input to sort");
		}
		else{
			sorted = bubble(list);
		}
		
		
		//print out the list
		for(int i = 0; i < sorted.size(); i++){

			System.out.print(sorted.get(i) + " ");
		}

		System.out.println();

		//int [] unsorted = {1,2,3,4,5};
		//int [] sorted = bubble(unsorted);



	}

	static ArrayList<Integer> bubble( ArrayList<Integer> x ){

		int n = x.size();
		//int counter = 0;

		for(int m = 0; m < n-1; m++){

			for(int q = 0; q < n-m-1; q++){

				//counter++;

				if( x.get(q).compareTo(x.get(q+1)) > 0 ){

					swap(x,q,q+1);
				}
			}
		}

		//System.out.println(counter);

		return x;
	}


	static ArrayList<Integer> swap(ArrayList<Integer> array, int index1, int index2){

		int temp = array.get(index1);
		array.set(index1,array.get(index2)); //= array.get(index2);
		array.set(index2,temp);

		return array;

	}

}