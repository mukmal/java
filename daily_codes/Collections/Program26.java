import java.util.*;
class Player implements Comparable<Player> {
	int jerNo;
	String pName;
	Player(int jerNo,String pName) {
		this.jerNo = jerNo;
		this.pName = pName;
	}
	public int compareTo(Player obj) {
		return jerNo-obj.jerNo;
	} 
	public String toString() {
		return "{ "+jerNo+": "+pName+" }";
	}
}
class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		Player p1 = new Player(33,"Hardik");
		Player p2 = new Player(1,"KLRahul");
		Player p3 = new Player(12,"Yuvraj");
		Player p4 = new Player(45,"Vadpav");

		tm.put(p1,"GT");
		tm.put(p2,"DC");
		tm.put(p3,"MI");
		tm.put(p4,"MI");

		System.out.println(tm);
	}
}

//{{ 1: KLRahul }=DC, { 12: Yuvraj }=MI, { 33: Hardik }=GT, { 45: Vadpav }=MI}




//TreeMap.put() triggers internal comparisons.
//
//Each comparison calls your Player.compareTo() method.
//
//TreeMap uses those results to place the new key correctly in the Red-Black Tree.
//
//During traversal/printing, ordering is guaranteed by repeated compareTo() results.
