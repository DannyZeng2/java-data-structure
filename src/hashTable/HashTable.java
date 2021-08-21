package hashTable;

import hashTable.entity.User;

import java.util.Arrays;

public class HashTable {
    private User[] users = new User[10 ];

    public void add(User user) {
        int idx = user.hashCode();
        users[idx] = user;
    }

    public User get(int age) {
        return users[age % 10];
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
