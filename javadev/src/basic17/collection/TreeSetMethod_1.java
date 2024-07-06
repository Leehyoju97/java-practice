package basic17.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod_1 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 50; i > 0; i -= 2) {	
			treeSet.add(i);
		}
		
		System.out.println(treeSet.toString());	// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
		
		System.out.println(treeSet.first());	// 2
		
		System.out.println(treeSet.last());		// 50
		
		System.out.println(treeSet.lower(26));	// 24
		
		System.out.println(treeSet.higher(26));	// 28
		
		System.out.println(treeSet.floor(25));	// 24
		
		System.out.println(treeSet.floor(26));	// 26
		
		System.out.println(treeSet.ceiling(25));	// 26
		
		System.out.println(treeSet.ceiling(26));	// 26
		
		System.out.println();
		
		int treeSetsize = treeSet.size();
		System.out.println(treeSetsize);	//25
		
		for (int i = 0; i < treeSetsize; i++) {
			System.out.print(treeSet.pollFirst() + " ");	// 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 
		}
		
		System.out.println();
		System.out.println(treeSet.size());	// 0
		
		
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		
		treeSetsize = treeSet.size();
		
		for (int i = 0; i < treeSetsize; i++) {
			System.out.print(treeSet.pollLast() + " ");	// 50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 
		}
		
		System.out.println();
		
		System.out.println(treeSet.size());	// 0
		
		for (int i = 50; i > 0; i -= 2) {
			treeSet.add(i);
		}
		
		SortedSet<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet.toString());// [2, 4, 6, 8, 10, 12, 14, 16, 18]
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);
		System.out.println(nSet.toString());	// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
		
		nSet = treeSet.headSet(20, false);
		System.out.println(nSet.toString());	// [2, 4, 6, 8, 10, 12, 14, 16, 18]
		
		System.out.println("========================");
		sSet = treeSet.tailSet(20);	// [20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
		System.out.println(sSet.toString());
		
		nSet = treeSet.tailSet(20, true);
		System.out.println(nSet.toString());	//[20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
		
		nSet = treeSet.tailSet(20, false);
		System.out.println(nSet.toString());	// [22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
		
		sSet = treeSet.subSet(10, 20);
		System.out.println(sSet.toString());	// [10, 12, 14, 16, 18]
		
		nSet = treeSet.subSet(10, true, 20, false);
		System.out.println(nSet.toString());	// [10, 12, 14, 16, 18]
		
		nSet = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet.toString());	// [12, 14, 16, 18, 20]
		
		System.out.println(treeSet);	// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);	// [50, 48, 46, 44, 42, 40, 38, 36, 34, 32, 30, 28, 26, 24, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2]
		
		descendingSet = descendingSet.descendingSet();
		System.out.println(descendingSet);	// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
	}
}
