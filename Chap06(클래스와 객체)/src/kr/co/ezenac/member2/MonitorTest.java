package kr.co.ezenac.member2;

public class MonitorTest {

	public static void main(String[] args) {
		// monitor참조변수는 리모컨과 같은 것임.
		Monitor monitor = new Monitor();
		//System.out.println(monitor);
		monitor.power();
		monitor.power();
		monitor.power();
		
		monitor.channel = 5;
		monitor.channelUp();
		monitor.channelUp();
		
		monitor.channelDown();
		monitor.channelDown();
		
		monitor.power();
	}

}
