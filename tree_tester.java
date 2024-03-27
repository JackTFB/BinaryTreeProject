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

    }

    
}
