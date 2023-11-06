package Lab_7;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class MyWordCount {

	public static final String fileName = "data/fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadWord(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public List<WordCount> getWordCounts() {
		// TODO
		Map<String, Integer>  wordCountMap = new HashMap<>();
		
		for(String word : words) {
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word)+1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		
		List<WordCount> wordCounts = new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				String word = entry.getKey();
				Integer count = entry.getValue();
				WordCount wordCount = new WordCount(word, count);
				
		        wordCounts.add(wordCount);
		}
		return wordCounts;
		}
	
	public Set<String> getUniqueWords() {
		// TODO
		Set<String> nWord = new HashSet<>();
		Map<String, Integer> wordCountMap = new HashMap<>()	;
		
		for(String word : words) {
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) +1);
			}	else {
				wordCountMap.put(word, 1);
			}
		}
		for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			if(entry.getValue() ==1) {
				nWord.add(entry.getKey());
			}
		}
		return nWord;
		}
	public Set<String> getDistinctWords() {
		// TODO
		Set<String> distinctWords = new HashSet<>();
		
		for (String word : words) {
			distinctWords.add(word);
		}
		return distinctWords;
		}
	public Set<WordCount> exportWordCounts() {
		// TODO
		Map<String, Integer> wordCountMap = new TreeMap<>();
		Set<WordCount> wordCounts = new HashSet<>();
		
		for (String word : words) {
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) +1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			WordCount wordCount = new WordCount(entry.getKey(), entry.getValue());
			wordCounts.add(wordCount);
		}
		for (WordCount wordCount : wordCounts) {
	        System.out.println(wordCount.getToken() + " - " + wordCount.getCount());
	    }
		return wordCounts;
		}
	public Set<WordCount> exportWordCountsOrderByOccurence() {
		// TODO
		Map<String, Integer> wordCountMap = new HashMap<>()	;
		Set<WordCount> wordCounts = new TreeSet<>(Collections.reverseOrder());
		
		for (String word : words) {
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) +1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		
	    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	        WordCount wordCount = new WordCount(entry.getKey(), entry.getValue());
	        wordCounts.add(wordCount);
	    }
	    
	    for (WordCount wordCount : wordCounts) {
	        System.out.println(wordCount.getToken() + " - " + wordCount.getCount());
	    }

		
		return wordCounts;
		}

	public Set<WordCount> filterWords(String pattern) {
	    // Tạo một bản sao của danh sách words để thực hiện việc loại bỏ
	    List<String> filteredWords = new ArrayList<>(words);

	    // Loại bỏ các từ bắt đầu bằng pattern
	    filteredWords.removeIf(word -> word.startsWith(pattern));

	    // Tạo một Map để đếm số lần xuất hiện của từng từ trong danh sách đã lọc
	    Map<String, Integer> wordCountMap = new HashMap<>();
	    for (String word : filteredWords) {
	        if (wordCountMap.containsKey(word)) {
	            wordCountMap.put(word, wordCountMap.get(word) + 1);
	        } else {
	            wordCountMap.put(word, 1);
	        }
	    }

	    // Tạo các đối tượng WordCount từ Map và thêm vào tập hợp wordCounts
	    Set<WordCount> wordCounts = new TreeSet<>();
	    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	        WordCount wordCount = new WordCount(entry.getKey(), entry.getValue());
	        wordCounts.add(wordCount);
	    }

	    return wordCounts;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
