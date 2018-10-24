package hr.fer.oop.lab2.prob5;

public class task5{
	public static void main(String args[]) {
		int tofactor = Integer.parseInt(args[0]);
		System.out.println("You requested decomposition of number " + tofactor + " into prime factors. Here they are:");
		int i=0;
		while(tofactor!=1) {
			for(int n=1;n<=tofactor;n++) {
				int j = checkPrime(n);
				if(j==1) {
					if(tofactor%n==0) {
						i++;
						System.out.println(i+". "+n);
						tofactor=tofactor/n;
						n=1;
					}
				}
			}
		}
	}
	
	static int checkPrime(int number) {
		int i=0;
		for(int n=1; n<=number; n++) {
			if(number%n==0) {
				i++;
			}
		}
		if(i==2) {
			return 1;
		}
		else return 0;
	}
}