package countingDot.model;

public class Timer {
	private long executionTime;
	
	public Timer(){
		executionTime = 0;
	}
	
	public void resetTimer()
	{
		executionTime = 0;
	}
	public void startTimer()
	{
		executionTime = System.nanoTime();
	}
	public void stopTimer()
	{
		executionTime = System.nanoTime() - executionTime;
		String printTime = "The method took " + (double)(executionTime/100000000) + " seconds.";
		System.out.println((printTime));
	}
	public String toString()
	{
		String info = "Execution Time" + executionTime;
		return info;
	}
}
