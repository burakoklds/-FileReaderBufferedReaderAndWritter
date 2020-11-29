import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(new BufferedReader (new FileReader("Arabalar.txt")))){
			
			while(scanner.hasNextLine()) { 
				
				String araba_bilgisi =  scanner.nextLine(); 
				
				String[] array  = araba_bilgisi.split(",");
				
				if(array[1].trim().equals("Seat")) {
					System.out.println("Araba Bilgisi : " + araba_bilgisi);
				}
			}
			
		}
		catch (FileNotFoundException ex) {
			
			System.out.println("Dosya Bulunumadý...");
		}
        catch (IOException ex) {
			
			System.out.println("Dosya Açýlýrken Hata oldu");
		}
		
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter("Arabalar.txt",true))){
//			
//			writer.write("Gül , Seat");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Dosya Açýlýrken Hata oldu");
//		}
	}

}
