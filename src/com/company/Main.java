package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Trie trie = new Trie();

        String contacts [] = {"moh", "mounir"};

        trie.insertIntoTrie(contacts);

        String query = "ghada";

        trie.displayContacts(query);
    }
}
