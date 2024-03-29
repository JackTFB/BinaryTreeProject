public class tree_tester 
{
    public static void main (String[] args)
    {  
        TestTree();
    }

    public static void TestTree ()
    {
        btnode_int root = new btnode_int(5);
        root.setLeft(new btnode_int(3));
        root.getLeft().setLeft(new btnode_int(1));
        root.getLeft().setRight(new btnode_int(4));
        root.setRight(new btnode_int(9));
        root.getRight().setLeft(new btnode_int(6));

        root.InorderPrint();


        System.out.println("\nSearching for the key 4:");
        btnode_int result = root.searchBinaryTreeWithPath(4);
        if (result != null) {
            System.out.println("Successfully found the node with key 4.");
        } else {
            System.out.println("The node with key 4 was not found.");
        }


    int[] arr = {5, 3, 1, 9, 6, 4};

    btnode_int tree = build_tree(arr);

    tree.InorderPrint();
    }

    public static btnode_int build_tree(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        btnode_int root = new btnode_int(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insertIntoBST(root, arr[i]);
        }
        return root;
    }

    public static void insertIntoBST(btnode_int node, int value) {
        if (value < node.getData()) {
            if (node.getLeft() == null) {
                node.setLeft(new btnode_int(value));
            } else {
                insertIntoBST(node.getLeft(), value);
            }
        } else if (value > node.getData()) {
            if (node.getRight() == null) {
                node.setRight(new btnode_int(value));
            } else {
                insertIntoBST(node.getRight(), value);
            }
        }
    }

    
}
