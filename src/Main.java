import java.io.*;

public class Main {
	
	public static void main(String[] args) {	
		try {
			//Load file where encrypted message is located
			File file = new File("Encrypted Message.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//Read the lines
			String p = br.readLine();
			String q = br.readLine();
			String e = br.readLine();
			String encryption = br.readLine();
			
			br.close();
			
			//Decipher the message
			Decipher mess = new Decipher(encryption, Integer.valueOf(p), Integer.valueOf(q), Integer.valueOf(e));
			mess.decryption();
		}
		catch(FileNotFoundException nf) {
			nf.printStackTrace();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}
}
