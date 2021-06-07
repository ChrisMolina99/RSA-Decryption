public class Decipher {
	private String message;
	private int p;
	private int q;
	private int e;
	
	//Constructor
	Decipher(String message, int p, int q, int e){
		this.message = message;
		this.p = p;
		this.q = q;
		this.e = e;
	}
	
	//Function that uses Euclidean Algorithm to find the value of t 
	static long euclidean(long a, int b) {
		int s = 1, t = 0, u = 0, v = 1, q;
		
		while (b != 0) {
			int utemp, vtemp, stemp, ttemp, atemp;
			utemp = u; vtemp = v; stemp = s; ttemp = t; atemp = (int)a;
			q = ((int)a - (int)a % b) / b;
			a = b;
			b = atemp % b;
			s = u; t = v;
			u = stemp - utemp * q; v = ttemp - vtemp * q;
		}
		
		return t;
	}
	
	//Function that finds the remainder of the division between base^exp and n
	//We use a loop to calculate the value since numbers can be too large to store in a variable
	static long findMod(long base, long exp, int n) {
		long result = 1;
		
		for(int i = 1; i <= exp; i++) {
			result *= base;
			result %= n;
		}
		
		return result;
	}
	
	//Function that returns the letter that represents given a number
	public char getLetter(long num) {
		//First find value of d
		long d = euclidean((p - 1) * (q - 1), e);
		if(d < 0)
			d += (p-1) * (q-1);
		
		//Take mod 256 to get the ascii value of a number
		long ascii = findMod(num, d, p * q) % 256;
		return (char)ascii;
	}
	
	//Finally get the message
	public void decryption() {	
		System.out.println("Decryption started:");
		
		//Traverse the given string. It is assumed that every 40 numbers there is a letter
		for(int i = 0; i < message.length(); i += 40) {
			String x = message.substring(i, i + 40);
			long num = Long.parseLong(x, 2);
			
			char c = getLetter(num);
			System.out.print(c);
		}
	}
	
	
}
