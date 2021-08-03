/*
 * @author rajatrawat
 */
 
public class Q6 {
    
    // keep track of elements
    static int front=-1,rear=-1;
    
    public static void main(String[]args)
    {
        
        QueueUsingArray qu=new QueueUsingArray();
        
        // size of queue
        System.out.println("Size of Queue: "+size(qu));
        
        // dequeue from empty queue
        dequeue(qu);
        
        
        enqueue(1, qu);
        enqueue(2, qu);
        enqueue(3, qu);
        
        System.out.println("Size of Queue: "+size(qu));
        
        // print entire queue
        print(qu);
        
        enqueue(4, qu);
        
        // delete node
        dequeue(qu);
        dequeue(qu);
        dequeue(qu);
        
        // print entire queue
        print(qu);
        
        System.out.println("Size of Queue: "+size(qu));
        
        dequeue(qu);
        
    }
    
    
    // enqueue function
    static void enqueue(int value, QueueUsingArray qu)
    {
        
        // enqueuing only when rear is within the bound of array index
        // check ki that if we increment rear will it cause overflow?
        if(rear+1==qu.arr.length)
        {
         System.out.println("Overflow");
         return;
        }
        
       rear++;
       qu.arr[rear]=value;
       
    }   
    
    
    // dequeue function
    static void dequeue(QueueUsingArray qu)
    {
        
       // whenever front & rear at at same index, means we have 0 elements in queue   
       if(front==rear)
       {
         System.out.println("Underflow");
         return;
       }
       
       // wherever front is pointing from the next index onwards we have elements in queue
       ++front;
    
   }
   
   
   // size function
    static int size(QueueUsingArray qu)
    {
       return (rear-front);   
    }
    
        
    // print function
    static void print(QueueUsingArray qu)
    {
        
        if(rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        
        else
        {
        
          System.out.print("Contents of Queue: ");
        
          // elements present in queue from front till rear
          for(int q=front+1; q<=rear; q++)
           {
             System.out.print(qu.arr[q]+" ");
           }
        
          System.out.println();
        }
        
    }
    
}

//QueueUsingArray class with 1 property: integer array
class QueueUsingArray
{
  int[]arr=new int[3];
}
