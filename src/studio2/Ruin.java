package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
	
		System.out.println("What is your starting amount?");
		double startAmount = in.nextDouble();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		System.out.println("How many simulations are you playing");
		double totalSimulationU = in.nextDouble();
		
		double ruin = 0;
		int numPlays = 0; 
		
		
		for (int totalSimulation = 1 ; totalSimulation <= totalSimulationU; totalSimulation++)
		{
		
		while (startAmount < winLimit && startAmount > 0)
		{
			double randomChance = Math.random();
			//System.out.println("Random Num = " + randomChance);
					if (winChance > randomChance)
					{ startAmount++ ;
						//System.out.println("YOU WIN YAYY");
					numPlays ++;
					}
					else 
					{
						startAmount -- ;
						//System.out.println("YOU LOSE AHHAHA");
					numPlays ++; 
					}

		}
		System.out.println("Simulation Day : " + totalSimulation);
		System.out.println("Number of Plays : " + numPlays);
		
		if (startAmount == 0) {
				System.out.println("Ruin");
				ruin++; 
		}
			else {System.out.println("Sucess");
		}
		}
		System.out.println("Ruin % "+ (ruin/totalSimulationU));

		}
		
		
	}


