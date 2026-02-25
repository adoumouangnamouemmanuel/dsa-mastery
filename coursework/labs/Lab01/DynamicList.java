import java.util.Arrays;

/**
 * DynamicList.java
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
class DynamicList {
    private BookRecord[] records;
    private int size;
    private int capacity;

    // Constructor
    public DynamicList() {
        this.records = new BookRecord[10];
        this.size = 0;
        this.capacity = 10;
    }

    // Add method
    public void add(BookRecord record) {
        if (size == capacity) {
            capacity *= 2;
            records = Arrays.copyOf(records, capacity);
        }
        records[size++] = record;
    }

    // Remove method
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            records[i] = records[i + 1];
        }
        size--;
    }

    // Get method
    public BookRecord get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return records[index];
    }

    // Size method
    public int size() {
        return size;
    }

    // Print method
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(records[i]);
        }
    }
}