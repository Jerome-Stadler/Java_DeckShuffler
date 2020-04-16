
public class Deck 
{
	private Card[] deck = new Card[52];
	private int cardsDealt;
	
	public Deck()
	{
		setCardsDealt(0);
		for(int i = 0; i<13;++i) //clubs
		{
			Card number = new Card(i,0);
			this.deck[i] = number;
		}
		for(int i = 0; i<13;++i) //spades
		{
			Card number = new Card(i,1);
			this.deck[i+13] = number;
		}
		for(int i = 0; i<13;++i) // hearts
		{
			Card number = new Card(i,2);
			this.deck[i+26] = number;
		}
		for(int i = 0; i<13;++i) //diamonds
		{
			Card number = new Card(i,3);
			this.deck[i+39] = number;
		}

		
	}
	public int getCardsDealt()
	{
		return this.cardsDealt;
	}
	private void setCardsDealt(int cardsDealt)
	{
		this.cardsDealt = cardsDealt;
	}
	public boolean emptyDeck()
	{
		if(this.getCardsDealt() == 52)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void collectCards()
	{
		setCardsDealt(0);
	}
	public void collectCards(int cardCnt)
	{
		setCardsDealt(getCardsDealt() - cardCnt);
	}
	public Card dealCard()
	{
		if(!(emptyDeck()))
		{
			setCardsDealt(this.getCardsDealt() + 1);
			return deck[getCardsDealt() - 1];
		}
		else
		{
			return null;
		}
	}
	public void shuffleDeck()
	{
		for(int i = 100; i>=0; --i)
		{
			int m = (int)(Math.random()*52); 
			int n = (int)(Math.random()*52);
			Card x = deck[n];
			
			deck[n] = deck[m];
			deck[m] = x;
		}
	}
	public void shuffleDeck(int swapCnt)
	{
		for(int i = swapCnt; i>=0; --i)
		{
			int m = (int)(Math.random()*52); 
			int n = (int)(Math.random()*52);
			Card x = deck[n];
			
			deck[n] = deck[m];
			deck[m] = x;
		}
	}
	
	
	
	

}
