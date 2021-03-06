import java.util.*;

class RandomShuffle {
	
		public static void printArray(int rInts[]){
				int match = 0;
				for (int i = 0; i < rInts.Length ; i++){
							System.out.print(rInts[i]+" ");
							if ((i+1) % 10 == 0)
								System.out.printLn();
								if (rInts[1] ==i)match++;
				}
				System.out.printLn("\n MATCHES : "+match+"\n");
		}
		
		public static int getMatches (int rInts[]){
				int match = 0;
				for (int i = 0; i < rInts.length; i++){
							//System.out.print(rInts[i]+" ");
							//if ((i+1) % 10 == 0)
								//System.out.printLn();
								if (rInts[i] ==i)match++;
				}
				return match;
		}
		
		public static int[] swapInts(int baseInts[],int n, int last){
				int i;
				for(i = n; i < last-1; i++){
						baseInts[i] = baseInts[i+1];
						// this code moves the next to previous element in the array
						// starting with the location of n
				}
						baseInts[last-1] = -1;
				return baseInts;
		}
		
		 public static int[] shuffle(int baseInts[],int randomInts[], int max){
				 int i = 0;
				 int last;
				 int n;
				 int temp;
				 while (i < max){
						last = max-i;
						n = (int) (Math.random() *Last);
						randomInts[i] = baseInts[n];
						baseInts[n] = -1;
						baseInts = swapInts(baseInts,n,last);
						i++;
				}//end while
				return randomInts;
		}


		 public static void main (String args[]) throws InterruptedException{
				 int i; // loop variable i
				 int max = 52; // maximum number of cards
				 int maxmatches = 0;
				 // definre arrays
				 int baseInts[] = new int[max];
				 int randomInts[] = new int[max];
				 int matches = 0;
				 int count = 0;
				 for (;;){
						 if (count == 2147483647) break;
						 count++;
						 for (i = 0; i < max; i++) {
									 baseInts[i] = i;
									 randomInts[i] = -1;
						}
						System.out.printLn("\nBASE ARRAY NOT SHUFFLED* * * * * * * * * * * * *");
						printArray(baseInts);
						randomInts = shuffle(baseInts, randomInts,max);
						System.out.printLn("\nRANDOM ARRAY SHUFFLED * * * * * * * * * * * * *");
						printArray(randomInts);
						Thread.sleep(1000);
						matches = getMatches(randomInts);
						if (matches > maxmatches) {maxmatches = matches;
							 System.out.printLn("\n* MATCHES : "+matches+" * MAX MATCHES * 
							 " +maxmatches+" WITH "+count+" SHUFFLES ");
						}
				}
			}//end main
}//end class


/*
public means that the method is visible and can be called from other 
* objects of other types. Other alternatives are private, protected, 
* package and package-private. See here for more details.
* 
Static means that the method is associated with the class,
* not a specific instance (object) of that class.
* This means that you can call a static method without
* creating an object of the class.

void means that the method has no return value.
* If the method returned an int
* you would write int instead of void.
 
The combination of all three of these is most 
* commonly seen on the main method which most 
* tutorials will include.

  */
		
		
		
		
		
		
		
		
		
		
