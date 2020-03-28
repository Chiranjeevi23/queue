package hii;

public class User {
	 int na;
	 int size;
	 int front;
	 int rear;
	 
	 
	int w[] = new int [5];
	public int qu(int data){
	    w[na] = data;
		 na = na+1;
		 size +=1;
		
		 
	}
	public void show(){
		for (int i=0; i< size;i++){
			System.out.println(w[i]);	
		}
	}
	public void sh(int ka){
		System.out.println(ka+55);
	}
}



