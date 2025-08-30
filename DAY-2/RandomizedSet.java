
import java.util.*;

class RandomizedSet {

    Map<Integer, Integer> indexMap;  // stores the value and its index in the list
    List<Integer> list;              // stores the actual values
    Random random;

    public RandomizedSet() {
        indexMap = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }
        indexMap.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }

        // Get the index of the element to be removed
        int index = indexMap.get(val);

        // Move the last element to the position of the element to remove
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        indexMap.put(lastElement, index);

        // Remove the last element
        list.remove(list.size() - 1);
        indexMap.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String args[]) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.print(randomizedSet.insert(1));   // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        System.out.print(randomizedSet.remove(2));  // Returns false as 2 does not exist in the set.
        System.out.print(randomizedSet.insert(2));   // Inserts 2 to the set, returns true.
        System.out.print(randomizedSet.getRandom()); // getRandom() should return either 1 or 2 randomly.
        System.out.print(randomizedSet.remove(1));  // Removes 1 from the set, returns true.
        System.out.print(randomizedSet.insert(2));   // Returns false as 2 is already in the set.
        System.out.println(randomizedSet.getRandom()); // Since 2 is the only number in the set, getRandom() will return 2.
    }
}
