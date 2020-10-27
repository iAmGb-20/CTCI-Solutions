import java.util.*;

public class Serialize_Deserialize extends BST {
    public static final String DELIMITER = ",";
    public static final String NULLSYMBOL = "X";

    public String serialize(BSTNode root)
    {
        if (root == null) return NULLSYMBOL+DELIMITER;
        String leftSerialized = serialize(root.left);
        String rightSerialized = serialize(root.right);
        return  root.data + DELIMITER+ leftSerialized + rightSerialized;
    }

    public BSTNode deserialize(String data)
    {
        Queue<String> nodesLeft = new LinkedList<>();
        nodesLeft.addAll(Arrays.asList(data.split(DELIMITER)));
        return helper(nodesLeft);
    }
    public BSTNode helper(Queue<String>nodesLeft)
    {
        String valueforNode = nodesLeft.poll();
        if (valueforNode.equals(NULLSYMBOL)) return null;

        BSTNode newNode = new BSTNode(Integer.valueOf(valueforNode));
        newNode.left = helper(nodesLeft);
        newNode.right = helper(nodesLeft);
        return newNode;

    }
}
