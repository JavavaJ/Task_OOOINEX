package task2.better_solution.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private char character;
    private Map<Character, TrieNode> children = new HashMap<>();
    private boolean isLeaf;

    public TrieNode() {}

    public TrieNode(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }
}
