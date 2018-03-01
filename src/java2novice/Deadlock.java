package java2novice;

public class Deadlock {
	
	String str1 = "Rakesh";
	String str2 = "Hyderabad";
	
	Thread t1 = new Thread(){
		public void run(){
			while(true){
				synchronized(str1){
					synchronized (str2) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
	
	Thread t2 = new Thread(){
		public void run(){
			while(true){
				synchronized(str2){
					synchronized(str1){
						System.out.println(str2+str1);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
Deadlock d = new Deadlock();
d.t1.start();
d.t2.start();

	}

}
