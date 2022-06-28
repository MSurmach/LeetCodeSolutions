package my.solutions;

import java.util.List;

public class Solution589 {
    public List<Integer> preorder(Node root) {

        return null;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
