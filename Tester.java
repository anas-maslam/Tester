
public class Tester {
	int count = 0;
	
	public void increment()
	{
		int i = 0;
		
		for (i = 0; i< 10; i++)
		{
			count++;
		}
	}
	
	public void display()
	{
		System.out.println(count);
	}
	public static void main(String[] args) {
		Tester t = new Tester();
		
		t.increment();
		t.display();
		// TODO Auto-generated method stub
		System.out.println ("All done!");
		
		System.out.println ("One more All done!");
	}

}
