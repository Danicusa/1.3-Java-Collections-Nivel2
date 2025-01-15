package level1ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name = "";
		String capitalAnswer = "";
		String capital = "";
		Scanner sc = new Scanner(System.in);
		int score = 0;
		HashMap<String, String> map = createMapFromFile("C:/Users/danic/Downloads/countries.txt");

		List<String> keys = new ArrayList<String>(map.keySet());	
		Random random = new Random();

		System.out.println("Enter your name:");
		name = sc.next();
		
		for (int i = 0; i<10; i++) {
		String randomCountry = keys.get(random.nextInt(keys.size()));
		capital = map.get(randomCountry);
		System.out.println("What is la capital of " + randomCountry);
		capitalAnswer = sc.next();
		
			if (capitalAnswer.equalsIgnoreCase(capital)){
				System.out.println("Correct! The capital of " + randomCountry + " is :" + capital + "\n");
				score++;
			} else { 
				System.out.println("Incorrect! The capital of " + randomCountry + " is : " + capital + "\n");
			}
		}
		txtWriter(name,score);
    }
	
	public static HashMap<String, String> createMapFromFile(String filePath) {
        HashMap<String, String> map = new HashMap<>();
      
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ", 2);
                if (parts.length >= 2) {
                    String pais = parts[0].trim();  
                    String capital = parts[1].trim(); 
                    map.put(pais, capital);
                } else {
                    System.out.println("Formato incorrecto en la línea: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }      
        return map;
	}
	
	public static void txtWriter(String name, int score) {
		File filePath = new File("C:/Users/danic/OneDrive/Escritorio/classification.txt");
		try(FileWriter fw = new FileWriter(filePath, true)) {
			fw.write("The player " + name + " got " + score + " points. \n");
			System.out.println("The score has been correctly added to the document.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

