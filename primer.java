class Find
{
	void findit()
		{
			int i= 0;
			for(i = 2; i < 101; i++)
				{
					int j = 2;
					while(j <= i && (i % j != 0))
					{
						j++;
					}
					if(i == j)
						System.out.println(i);
				}
		}
}

class primer
{
	public static void main(String[] args)
		{
			Find fs = new Find();
 			fs.findit();
		}
}