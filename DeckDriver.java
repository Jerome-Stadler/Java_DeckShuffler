import java.util.Scanner;
public class DeckDriver 
{
	public static void main (String [] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int cardsperrow = 0;
		Deck deck = new Deck();	
		String yorn = "h";
		int SwapCnt = -1;
		
		int validate = 0;
		
		
		
		for(int i =0; i<52; ++i) //print the deck
		{
			if(cardsperrow < 8)
			{
			System.out.print(deck.dealCard() + " ");
			}
			if(cardsperrow == 8)
			{
				System.out.println("");
				System.out.print(deck.dealCard() + " ");
				cardsperrow = 0;
			}
			++cardsperrow;
		}
		cardsperrow = 0;
		
		System.out.println("");
		System.out.println("--------------------------------------------- ");
		while(!(yorn.equals("n") || yorn.equals("y")))
		{
		System.out.println("Would you like to shuffle the Deck? [y or n]: "); // ask if they want the deck to be shuffled
		yorn = stdIn.nextLine();
		}
		
		if(yorn.equals("y"))
		{
			deck.collectCards(); // if they say yes, collect the cards so cards dealt will equal 0
			deck.shuffleDeck(); // then shuffle the deck
			
			System.out.println("--------------------------------------------- ");
			
			for(int i =0; i<52; ++i) // print the shuffled deck
			{
				if(cardsperrow < 8)
				{
				System.out.print(deck.dealCard() + " ");
				}
				if(cardsperrow == 8)
				{
					System.out.println("");
					System.out.print(deck.dealCard() + " ");
					cardsperrow = 0;
				}
				++cardsperrow;
			}
			
			cardsperrow = 0; // set cards per row back to 0
			
			System.out.println("");
			
		}
		System.out.println("--------------------------------------------- ");
		
		yorn = "h";
		
		while(!(yorn.equals("n") || yorn.equals("y"))) // do they want to use the shuffleDeck(SwapCnt) ???
		{
		System.out.println("Would you like to swap random cards in the deck? [y or n]: ");
		yorn = stdIn.nextLine();
		}
		
		System.out.println("--------------------------------------------- ");
		
		if(yorn.equals("y")) //if they answer yes
		{
			do// How many times do they want to swap? What is the variable for int SwapCnt?
			{ //validate currently equals 0
			System.out.println("How many times do you want to swap two random cards? [Enter an Integer Above 0] : ");
			SwapCnt = stdIn.nextInt();
			if(SwapCnt >= 0) // if they enter an integer above 0 then validate will equal 1 and the do loop will end,  (it will stop asking for a valid int)
			{
				validate = 1;
			}
			}while(validate == 0);
			
			deck.collectCards(); 
			deck.shuffleDeck(SwapCnt); // Swap two random cards the amount of times they entered
			
			System.out.println("--------------------------------------------- ");
			for(int i =0; i<52; ++i) // print the shuffled deck
			{
				if(cardsperrow < 8)
				{
				System.out.print(deck.dealCard() + " ");
				}
				if(cardsperrow == 8)
				{
					System.out.println("");
					System.out.print(deck.dealCard() + " ");
					cardsperrow = 0;
				}
				++cardsperrow;
			}
		}
		
		
	}
}