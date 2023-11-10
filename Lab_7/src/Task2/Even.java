package Task2;

public class Even implements Predicate<Integer> {

	@Override
	public boolean test(Integer i) {
		// TODO Auto-generated method stub
		return (i % 2 == 0);
	}

}
