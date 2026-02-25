/**
 * LibrarySystem.java
 * 
 * Author: Emmanuel Adoum
 * Date: 25/02/2026
 * 
 * Description: This class implements a dynamic array-based list data structure.
 * It provides methods for adding, removing, and retrieving records.
 * 
 * Fields:
 * - records: The array of records.
 * - size: The number of records in the list.
 * - capacity: The current capacity of the array.
 */
class LibrarySystem {
    public static void main(String[] args) {
        DynamicList list = new DynamicList();
        list.add(new BookRecord("B001", "CleanCode", "RobertMartin", "Available"));
        list.add(new BookRecord("B002", "TheAlgorithms", "CLRS", "Available"));
        list.remove(1);
        list.get(0);
        list.size();
        list.print();
    }
}