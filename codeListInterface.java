import java.util.ArrayList;


public interface codeListInterface {
	public boolean isEmpty();
	public void enqueue(ArrayList<String> x);
	public void delete(ArrayList<String> guess,int[] response);
	public ArrayList<String> peek();
	public boolean checkMatch(ArrayList<String> toCheck, ArrayList<String> guess, int[] response);
	public void printList();
	public void generate ( String[] permutations, int position, int value);
	public ArrayList<String> getNextGuess();
	public void generateFull (String[] permutations, int position, int value );
}
