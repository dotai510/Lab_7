package Lab_7;

public class WordCount {
	private String word;
	private int count;
	public WordCount(String word, int count) {
		super();
		this.word = word;
		this.count = count;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getToken() {
		// TODO Auto-generated method stub
		return word;
	}
	
	
	
}
