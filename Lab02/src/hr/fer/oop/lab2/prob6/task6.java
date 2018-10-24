package hr.fer.oop.lab2.prob6;

public class task6 {
	public static void main (String args[]) {
		//hourglass
		plusline();
		sides(1);
		sides(0);
		plusline();
		//hexagon
		sides(0);
		sides(1);
		//cup
		System.out.println();
		sides(1);
		plusline();
		//hat
		sides(0);
		plusline();
		
	}
	
	static void plusline() {
		char plus = (char) 43;
		char line = (char) 45;
		for(int i=1; i!=10; i++) {
			if(i==1 || i==9) {
				System.out.print(plus);
			}
			if(i!=9)
				System.out.print(line);
		}
		System.out.println();
	}
	static void sides(int way) {
		char tracel = (char) 92;
		char tracer = (char) 47;
		char line = (char) 95;
		if(way==1) {
			System.out.print(tracel + "        " + tracer +"\n" + " " + tracel);
			for(int i=0; i<=6;i++) {
				if(i!=6)
					System.out.print(line);
				if(i==6)
					System.out.println(tracer);
			}
		}
		if(way==0) {
			for(int i=1; i<=8; i++) {
				if( i==1 || i==2) {
					System.out.print(" ");
				}
				else System.out.print(line);
			}
			System.out.println();
			System.out.println(" " + tracer + "      " + tracel + "\n" + tracer + "        " + tracel);
		}
	}
}