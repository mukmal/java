import java.util.*;
class IteratorMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(18,"virat");
		hm.put(19,"virat");
		hm.put(20,"virat");
		hm.put(21,"virat");
		System.out.println(hm);
		Set<Map.Entry> data = hm.entrySet();
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			Map.Entry val = (Map.Entry)itr.next();
			System.out.println(val.getKey()+":"+val.getValue());
		}		
	}
}
//{18=virat, 19=virat, 20=virat, 21=virat}
//18:virat
//19:virat
//20:virat
//21:virat
//
