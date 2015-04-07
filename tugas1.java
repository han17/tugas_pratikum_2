// Example to illustrate Method Overloading
public class tugas1 {
	public static int average(int n1, int n2){				//A
		return (n1+n2)/2;
	}

	public static double average(double n1, double n2){		//B
		return (n1+n2)/2;
	}
	
	public static int average(int n1, int n2, int n3){		//C
		return  (n1+n2+n3)/3;
	}
	
	public static  void main(String[] args) {
		System.out.println(average(1, 2));		//use A
		System.out.println(average(1.0, 2.0));	//use B
		System.out.println(average(1, 2, 3));	//use C
		System.out.println(average(1.0, 2));	//use B
		System.out.println(average(2, 2, 2));	//use C
	}
}