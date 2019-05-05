package demo3;
public class test01_1 {
	public static void main(String[] args) {
	
		double d1 = 23.4;
		double d2 = 35.1;
		double d3 = 20.5;
		double t;
		if (d1 > d2) {
			t = d1;
			d1 = d2;
			d2 = t;
		} 
		else if (d1 > d3) {
			t = d1;
			d1 = d3;
			d3 = t;
		}
		if(d2>d3){
			 t=d2;
			 d2=d3;
			 d3=t;
		 }
		System.out.println(d1+"<="+d2+"<="+d3);
	}

}
