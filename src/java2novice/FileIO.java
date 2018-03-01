package java2novice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.AbstractDocument.BranchElement;

public class FileIO {
	
	private static Map<String,Integer> hm = new HashMap<String, Integer>();

	public static void main(String[] args) {
		
		readLinesAndPutInHM();
		List<Map.Entry<String, Integer>> sortedList = sortHmByValues();
		
		for(Map.Entry<String, Integer> entry:sortedList){
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		
		
		
		
		
		
	}

	private static List sortHmByValues() {
		Set<Map.Entry<String,Integer>> mapSet = hm.entrySet();
		List<Map.Entry<String, Integer>>	mapList = new ArrayList<Map.Entry<String,Integer>>(mapSet);
		Collections.sort(mapList, new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2){
				return e2.getValue().compareTo(e1.getValue());
			}
		});
		return mapList;
	}

	private static void readLinesAndPutInHM() {
		try {
			FileReader fr = new FileReader("C:/Test.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println(line);
				String[] wordsInLine = line.split(" ");
				
				for(String str: wordsInLine){
					if(hm.containsKey(str)){
						hm.put(str, hm.get(str)+1);
					}else{
						hm.put(str, 1);
					}
						
				}
			}
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
