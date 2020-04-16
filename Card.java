public class Card
{
	private int  suit;
	private int  rank;

	public Card() //default 
	{
		this(0,0);
	}

	public Card(Card c)  //copy
	{
		this(c.suit,c.rank);
	}

	public Card( int rank, int suit) //specify 
	{
		setSuit(suit);
		setRank(rank);
	}

	public int getSuit() 
	{
		return this.suit;
	}

	public int getRank()
	{
		return this.rank;
	}

	private void setSuit(int suit) //mutator
	{

		if(suit>=0 &&suit<4)
		{
			this.suit = suit;
		}
	}

	private void setRank(int rank) //mutator
	{

		if(rank>=0 && rank<13)
		{
			this.rank = rank;
		}
	}

	public Card clone()// clone 
	{
		Card copy = new Card(this);

		return copy;
	}

	public boolean equals(Card guest) 
	{
		return guest.getRank()==this.getRank() && guest.getSuit()==(this.getSuit());
	}

	public String toString() //combine suit and rank and return it to driver
	{

		String[] suits={"C","S","H","D"};
		String[] ranks={"A","2","3","4","5","6","7","8","9","10",
				"J","Q","K"};


		String combine = ranks[this.getRank()]+suits[this.getSuit()];

		return combine;
	}

}