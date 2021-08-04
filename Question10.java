/*
 * @author rajatrawat
 */
 
public class Main {
    
    public static void main(String[]args)
    {
        
        BSTUsingLL root=new BSTUsingLL(50, null, null);
        
        // creation of BST
        root=create(root);
        
        // print BST
        System.out.println("Initially Created BST:");
        print(root);
        System.out.println();
        
        // insertion in BST
        insert(root, 34);
        
        System.out.println("BST after insertion:");
        print(root);
        System.out.println();
        
        
        // deletion in BST
        root=delete(root, 58); // case 1-> Deleted node has 0 child
        root=delete(root, 30); // case 2-> Deleted node has 1 child
        root=delete(root, 50); // case 3-> Deleted node has both childs
        
        // find in BST -> if present return true else false
        System.out.println(find(root, 60));
        
        System.out.println("FINAL BST:");
        print(root);
        System.out.println();
    }
    
    static BSTUsingLL create (BSTUsingLL root)
    {
        BSTUsingLL left1=new BSTUsingLL(40, null, null);
        BSTUsingLL right1=new BSTUsingLL(60, null, null);
        BSTUsingLL left2=new BSTUsingLL(30, null, null);
        BSTUsingLL right2=new BSTUsingLL(56, null, null);
        BSTUsingLL left3=new BSTUsingLL(35, null, null);
        BSTUsingLL right3=new BSTUsingLL(58, null, null);
        
        root.left=left1;
        root.right=right1;
        left1.left=left2;   //           50
        left1.right=null;   //         /     \
        left2.left=null;    //       40       60
        left2.right=left3;  //      /  \      / \
        right1.left=right2; //    30   42  56  null
        right1.right=null;  //    / \     /   \
        right2.left=null;   //   null 35 null  58    
        right2.right=right3; //       /\      /  \
        left3.left=null;     //    null null null  null
        left3.right=null;
        right3.left=null;
        right3.right=null;
        
        return root;
        
    }
    
    
    // insertion function
    static BSTUsingLL insert(BSTUsingLL root, int value)
    {
        
        if(root==null)
        {
         BSTUsingLL newnode=new BSTUsingLL(value, null, null);    
         return newnode;
        }
        
        if(value<=root.value)
        {
            root.left=insert(root.left, value);
        }
        
        else
        {
            root.right=insert(root.right, value);
        }
       
       return root;
       
    }   
    
    
    // deletion function
    static BSTUsingLL delete(BSTUsingLL root, int value)
    {
        if(root==null)
        return root;
        
        if(value<root.value)
        {
            root.left=delete(root.left ,value);
        }
        
        else if(value>root.value)
        {
            root.right=delete(root.right ,value);
        }
        
        else if(value==root.value)
        {
            //case 1 -> No child
            if(root.left==null && root.right==null)
            return null;
            
            //case 2 -> 1 child
            else if(root.left==null && root.right!=null)
            return root.right;
            
            else if(root.left!=null && root.right==null)
            return root.left;
            
            //case 3 -> both childs
            else if(root.left!=null && root.right!=null)
            {
              // get largest from left & assign it as root value
              root.value=findmaxonleft(root.left);
              
              // delete that maximum value recursively
              root.left=delete(root.left, root.value);
            }
            
        }
        
        return root;
    }
   
    // find max on left side
    static int findmaxonleft(BSTUsingLL root)
    {
        int max=Integer.MIN_VALUE;
        
        while(root!=null)
        {
            if(root.value>max)
            max=root.value;
            
            root=root.right;
            
        }
        
        return max;
    }
   
   // find function
    static boolean find(BSTUsingLL root, int value)
    {
       if(root==null)
       return false;
        
       if(root.value==value)
       return true;
       
       return (find(root.left, value) || find(root.right, value) );
    }
    
        
    // print function
    static void print(BSTUsingLL root)
    {
        if(root==null)
        return;
        
        System.out.print(root.value+" ");
        print(root.left);
        print(root.right);
        
    }
    
}

//BSTUsingLL class with 3 properties: value, left child & right child
class BSTUsingLL
{
  int value;
  BSTUsingLL left;
  BSTUsingLL right;
  
  BSTUsingLL(int value, BSTUsingLL left,BSTUsingLL right)
  {
      this.value=value;
      this.left=left;
      this.right=right;
  }
}
