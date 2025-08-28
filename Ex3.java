package multithreading;

public class Ex3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=9;i++)
		{
			try
			{
				Thread.sleep(500);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		Ex3 t1 = new Ex3();
		Ex3 t2 = new Ex3();
		t1.start();
		t2.start();
	}

}
