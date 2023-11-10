package Lab_7;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MyWordCountUsingMap {
	public static final String fileName = "E:\\File_Môn Học\\Git_CTDL\\Lab_7\\Lab_7\\src\\Lab_7\\hamlet.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCountUsingMap() {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Map<String, Integer> getWordCounts() { 
		Map<String, Integer> mc = new TreeMap<>();
		for(String word : words	) {
			mc.put(word, mc.getOrDefault(word, 0) +1);
		}
		return mc;
	}
	public static void main(String[] args) {
		MyWordCountUsingMap mwcum = new MyWordCountUsingMap();
		
		Map<String, Integer> mc1 = mwcum.getWordCounts();
		System.out.println(mc1);
	}
}
