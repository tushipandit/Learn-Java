//extends thread
//implements Runnable

class Task1 extends Thread{
	public void Run()
	{
		for(int i=0 ;i<=10 ; i++)
		{
			System.out.println( i + " ");
			
		}
		System.out.println("\n Task Done");
	}
}

class Task2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10 ;i<=21 ; i++)
		{
			System.out.println( i + " ");
			
		}
		System.out.println("\n Task Done");

	}
	
}


public class ThradBasicRunner {

	public static void main(String args[]) throws InterruptedException
	{
		//Task1
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start(); //Task1.run()
		
		
		
		//Task2
		Task2 task2 =new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.setPriority(10);
		task2thread.start();
		
		task1.join();
		
		//task3
		for(int i=31 ;i<40 ;i++)
		{
			System.out.println(i +" ");
		}
	}
	
}
