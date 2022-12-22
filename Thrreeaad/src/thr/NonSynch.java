package thr;

class Kesribath extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Upiit implements Runnable
{
	public void run()
	{
		for(int j=101;j<=110;j++)
		{
			System.out.println(j);
			try
			{
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

		}
	}
}


public class NonSynch {
	public static void main(String[]args)
	{
	Kesribath k= new Kesribath();	
	Thread Th1= new Thread(k);
	Th1.start();
	Upiit u= new Upiit();	
	Thread Th2= new Thread(u);
	Th2.start();
	
	}

}
