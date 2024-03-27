public class btnode_int 
{
    private int data;
    private btnode_int left;
    private btnode_int right;
    // methods

    // constructor
    public btnode_int(int initialData)
    {
        data = initialData;
        left = null;
        right = null;
    } 
    
    // Gets the data from this node
    public int getData( )
    {
        return data;
    } 

    // Gets reference to left child
    public btnode_int getLeft( )
    {
        return left;
    } 

    // Gets reference to right child
    public btnode_int getRight( )
    {
        return right;
    } 
    
    // Set data of this node
    public void setData(int newData) 
    {
        data = newData;
    }

    // Set left child
    public void setLeft(btnode_int newLeft) 
    {
        left = newLeft;
    }

    // Set right child
    public void setRight(btnode_int newRight) 
    {
        right = newRight;
    }

    public void InorderPrint()
    {
        if (left != null)
        {
            left.InorderPrint();
        }
        System.out.println(data);
        if (right != null)
        {
            right.InorderPrint();
        }
    }


}
