package branch_and_bound;

class Item{
	private int profit;
	private int weight;
	private int total_profit;
	private int total_weight;
	
	public Item(int p, int w) {
		profit = p;
		weight = w;
	}
	public int getProfit() { return profit; }
	public int getWeight() { return weight; }
	public int getRatio() { return profit/weight; }
	
}


public class KSP {
	
	private int max_profit;
	
	public void checkItem(Item[] items, int i) {
	}

	
	public static void main(String[] args) {
		Item[] items = new Item[4];
		items[0] = new Item(40,2);
		items[1] = new Item(30,5);
		items[2] = new Item(50,10);
		items[3] = new Item(10,5);
	}
}
