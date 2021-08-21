package hashTable;

import hashTable.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void add() {
        User danny = new User("danny",23);
        User eric = new User("eric",25);
        User matt = new User("matt",24);

        HashTable hashTable = new HashTable();
        hashTable.add(danny);
        hashTable.add(eric);
        hashTable.add(matt);

        System.out.println(hashTable);

        User user = hashTable.get(25);
        System.out.println(user);
    }
}