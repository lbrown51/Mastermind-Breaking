import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;



public class Attempt implements codeListInterface{
	private SingleNode head = new SingleNode();
	private SingleNode tail = new SingleNode();
	long count = 0;
	String[] colors;
	
	public Attempt(String[] colors){
		head.next =  tail;
		tail.prev = head;
		this.colors = colors;
	}
	
	
	
	public boolean isEmpty() {
		if (head.next == tail && tail.prev == head)
			return true;
		else
			return false;
	}

	
	public void enqueue(ArrayList<String> x) {
		SingleNode Node = new SingleNode();
		Node.data = x;
		
		Node.next = head.next;
		Node.prev = head;
		Node.next.prev = Node;
		head.next = Node;
		
		
		
	}

	
	
		
	
	public ArrayList<String> peek() {
		SingleNode Node = tail.prev;
		return Node.data;
	}

	

	public void delete(ArrayList<String> guess,int[] response) {
		// TODO Auto-generated method stub
		SingleNode Current = head.next;
		while (Current.next!=null){

			if (checkMatch(Current.data,guess,response)){
				count--;
				Current.prev.next = Current.next;
				Current.next.prev = Current.prev;
				
			}
			Current = Current.next;
		}
		System.out.println(count);
		
	}


	@Override
	public boolean checkMatch(ArrayList<String> toCheck, ArrayList<String> guess, int[] response) {
		int black = 0;
		int white = 0;
		ArrayList<String> temp = new ArrayList<String>(guess);
		ArrayList<String> tempCheck = new ArrayList<String>(toCheck);
		System.out.println(tempCheck);
		

		for (int i = 0; i< temp.size()-1; i++){
			if (tempCheck.get(i).equals(temp.get(i)))
				tempCheck.remove(i);
				temp.remove(i);
				black++;
		}
		
		for(int j = 0; j< tempCheck.size()-1;j++)
			for (int k = 0; k<temp.size()-1;k++)
				if (tempCheck.get(j).equals(temp.get(k))){
					tempCheck.remove(j);
					temp.remove(k);
					white++;
				}
		if (response[0]==black && response[1]==white){
		
			return true;			
		}
		
		return false;
	}


	

	public void generate( String[] permutations, int position, int value) {
		// TODO Auto-generated method stub
 		

		 permutations[position] = colors[value];
		 
		 	if(position == permutations.length-1){
		 		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(permutations));
		 		count++;
		 		enqueue(arrayList);
		 		
		 		
		 	}
		 	else{
		 		for (int i = 0; i<colors.length;i++)
		 			generate(permutations, position+1,i);
		 	}
			            	
		}



	
	public void printList() {
		// TODO Auto-generated method stub
		SingleNode Current = head.next;
		
		if (isEmpty())
			System.out.println("Node Empty");
		else{
			System.out.println(Current.data);
			 while (Current.next!= tail){
				Current = Current.next;
				System.out.println(Current.data);

			}
			
		}
		System.out.println(count);
	}



	public void generateFull(String[] permutations, int position, int value) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i<colors.length;i++){
			
			String temp = colors[0];
			colors[0] = colors[i];
			colors[i] = temp;
			generate(permutations, position, value);
		}
	System.out.println(count);
	}



	public ArrayList<String> getNextGuess() {
		// TODO Auto-generated method stub
		SingleNode Current = head.next;
			for (int i = 0; i<count/4; i++){
				Current = Current.next;
			}
			
			Current.prev.next = Current.next;
			Current.next.prev = Current.prev;
			return Current.data;
	}





	



	

	
	}
	
	
	