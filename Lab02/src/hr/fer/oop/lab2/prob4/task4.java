package hr.fer.oop.lab2.prob4;

public class task4{
	public static void main(String args[]) {
		int primes = Integer.parseInt(args[0]);
		System.out.println("You requested calculation of first " + primes + " numbers. Here they are: ");
		int n=1;
		int i=0;
		if(primes<=0) {
			System.out.println("Please provide a value greater than 0.");
		}
		while(primes!=0) {
			int c=0;
			for(int j=1; j<=n; j++) {
				if(n%j==0)
					c++;
			}
			if(c==2) {
				i++;
				System.out.println(i + ". " + n);
				primes--;
			}
			n++;
		}
	}
}