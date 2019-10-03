package task2.better_solution.trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Trie {
    private TrieNode rootNode;

    public Trie() {
        rootNode = new TrieNode();
    }

    public void insert(String word) {
        Map<Character, TrieNode> children = rootNode.getChildren();

        int wordLen = word.length();
        for (int i = 0; i < wordLen; i++) {
            char character = word.charAt(i);

            TrieNode currentTrieNode;
            if (children.containsKey(character)) {
                currentTrieNode = children.get(character);
            } else {
                currentTrieNode = new TrieNode(character);
                children.put(character, currentTrieNode);
            }

            children = currentTrieNode.getChildren();

            // set leaf node
            if (i == wordLen - 1) {
                currentTrieNode.setLeaf(true);
            }
        }

    }

    // returns the last TrieNode of word
    public TrieNode searchTrieNode(String word) {
        Map<Character, TrieNode> children = rootNode.getChildren();
        TrieNode currentTrieNode = rootNode;
        int wordLen = word.length();
        for (int i = 0; i < wordLen; i++) {
            char currentChar = word.charAt(i);
            if (children.containsKey(currentChar)) {
                currentTrieNode = children.get(currentChar);
                children = currentTrieNode.getChildren();
            } else {
                // if there's no such word in a Trie
                return null;
            }
        }

        return currentTrieNode;
    }

    public List<String> getAllWords(String prefix) {
        TrieNode currentNode = searchTrieNode(prefix);

        if (currentNode != null) {
            List<String> allWords = new ArrayList<>();
            addAllWords(currentNode, prefix, allWords);
            return allWords;
        }

        // if the Trie doesn't contain the prefix
        return Collections.emptyList();
    }

    // the method is used for purposes of recursion
    private void addAllWords(TrieNode node, String word, List<String> allWords) {
        if (node.isLeaf()) {
            allWords.add(word);
        }
        Map<Character, TrieNode> currentChildren = node.getChildren();
        for (Map.Entry<Character, TrieNode> entry : currentChildren.entrySet()) {
            TrieNode nextTrieNode = entry.getValue();
            addAllWords(nextTrieNode, word + entry.getKey(), allWords);
        }
    }

}
