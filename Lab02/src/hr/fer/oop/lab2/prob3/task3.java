package hr.fer.oop.lab2.prob3;

import java.lang.Math;

public class task3 {
	public static void main(String args[]) {
		if(args.length != 3) {
			System.out.println("Please provide a valid number of arguments!");
		}
		int real = Integer.parseInt(args[0]);
		int imag = Integer.parseInt(args[1]);
		int root = Integer.parseInt(args[2]);
		System.out.println("You requested calculation of " + root + ". roots. Solutions are:");
		double[] part = new double[root];
		//conversion to trigonometric form
		double r = trigoreal (real, imag);
		double i = trigoim (real,imag);
		//calculating roots
		double module = Math.pow(r, (1D/root));
		for(int k=0; k<root; k++) {
			part[k]=(i+k*(2*Math.PI))/root;
		}
		//transform to rectangular form
		for(int k=0; k<root; k++) {
			System.out.println(k+1+") " + Math.round(module*(Math.cos(part[k]))) + " + " + Math.round(module*(Math.sin(part[k]))) + "i");
		}
	}
	
	public static double trigoreal(int real, int imag) {
		double r = Math.sqrt(Math.pow(real, 2)+Math.pow(imag, 2));
		return r;
	}
	
	public static double trigoim(int real, int imag) {
		double o = Math.atan(imag/real);
		return o;
	}

}