package Lab1;

import java.util.Arrays;

public class Array {
	
	final int size;  //The maximum capacity of A
    int [] A ;
    int load=0;  //number of elements in A
    
    Array(int n)
    { size = n;
      A = new int[size];  
    }
    
    //Ex3 a    
    void addFirst(int e)
    { 	if(load < size) {
	    	load = load + 1;
	    	int i = size-1;
	    	while(i>0) {
	    		A[i] = A[i-1];
	    		i = i-1;
	    	}
	    	A[0] = e;
    }
    	//System.out.println(Arrays.toString(A));
    }
     //Ex3 b 
    void addLast(int e)
    {  	if(load < size) {
	    	int i =0;
	    	load = load + 1;
	    	while(true) {
	    		if(A[i]==0) {
	    			A[i] = e;
	    			break;
	    		}
	    		i = i+1;
    		}
    	}
    	//System.out.println(Arrays.toString(A));
    }

    //Ex3 c
    void addAtIndex(int e, int index)
    {  
    	if(load<size) {
	    	load = load + 1;
	    	for(int i = 0;i < size - index;i++) {
	    		A[size-i-1] = A[size-i-2];
	    	}
	    	A[index] = e;
    	}
    	//System.out.println(Arrays.toString(A));
    }
    
    //Ex4 a
    int removeFirst()
    {   
    	if(load != 0) {
	    	load = load -1;
	    	for(int i = 0;i < size-1;i++) {
	    		A[i] = A[i+1];
    	}
    	}
    	//System.out.println(Arrays.toString(A));
    	return 0;
    }

    //Ex4 b
     int removeLast()
    {  
    	if(load != 0) {
	    	int i =0;
	     	load = load - 1;
	     	while(true) {
	     		if(A[i]==0) {
	     			A[i-1] = 0;
	     			break;
	     		}
	     		i = i+1;
	     	}
     	//System.out.println(Arrays.toString(A));
    	}
    	return 0;
    }

     //Ex4 c
     int removeAtIndex(int index)
    {  
    	if(load != 0) {
	    	load = load - 1;
	     	for(int i = 0;i < size - index - 1;i++) {
	     		A[index + i] = A[index + i + 1] ;
	     	}
    	}
     	//System.out.println(Arrays.toString(A));
    	return 0;
    }
    
     //Ex5 a
     int  getElementAtIndex(int index)
     {  
    	 return A[index];
     }
     
    //Ex5 b
     void  setElementAtIndex(int val, int index)
     {   
    	 A[index] = val;
     }
     
     
    void printArray( )
    {  for (int i=0; i< load; i++ )
       {  System.out.print(A[i]+" ");
       }
      System.out.println("\nArray load is " +load);
    }

    public static void main(String [] args)
    {
        Array A = new Array(10);
     
        //Uncomment this section to test Ex3 a 
        
        A.addFirst(9);
        A.addFirst(1);
        A.addFirst(4);
        System.out.println("After addFirst 9, 1, and 4 to A");
        System.out.println("Your Answer is");
        A.printArray();
        System.out.println("Correct Answer is\n4 1 9 \nArray load is 3");
       

        //Uncomment this section to test Ex3 b 
	
        System.out.println("----------------------------------");  
        A.addLast(2);
        A.addLast(5);
        A.addLast(8);
        System.out.println("After addLast 2, 5, and 8 to A");
        System.out.println("Your Answer is");
        A.printArray();
        System.out.println("Correct Answer is\n4 1 9 2 5 8 \nArray load is 6");
        

	//Uncomment this section to test Ex3 c 
        
        System.out.println("----------------------------------"); 
        A.addAtIndex(6, 2);
        A.addAtIndex(3, 4);
        System.out.println("After add 6 at index 2, and add 3 at index 4 to A ");
        System.out.println("Your Answer is");
        A.printArray();
        System.out.println("Correct Answer is\n4 1 6 9 3 2 5 8 \nArray load is 8");
        

         //Uncomment this section to test Ex4 a
        
        System.out.println("----------------------------------"); 
        A.removeFirst();
        A.removeFirst();
        System.out.println("After removeFirst twice ");
        System.out.println("Your Answer is");
        A.printArray();
        System.out.println("Correct Answer is\n6 9 3 2 5 8 \nArray load is 6");
         

         //Uncomment this section to test Ex4 b
        
        System.out.println("----------------------------------"); 
        A.removeLast();
        A.removeLast();
        System.out.println("After removeLast twice ");
        System.out.println("Your Answer is");
        A.printArray();
        System.out.println("Correct Answer is\n6 9 3 2 \nArray load is 4");
         

         //Uncomment this section to test Ex4 c
        
        System.out.println("----------------------------------"); 
        A.removeAtIndex(1);
        A.removeAtIndex(1);
        System.out.println("After removeAtIndex 1 twice ");
        System.out.println("Your Answer is");
        A.printArray();
        System.out.println("Correct Answer is\n6 2 \nArray load is 2");
         

        //Uncomment this section to test Ex5 a
        
        System.out.println("----------------------------------");
        A.setElementAtIndex(7, 1);
        System.out.println("After set value at index 1 to 7 ");
        System.out.println("Your Answer is");
        A.printArray();
        System.out.println("Correct Answer is\n6 7 \nArray load is 2");
         

	 //Uncomment this section to test Ex5 b
        
        System.out.println("----------------------------------");
        System.out.println("Your Answer is");
        System.out.println("Value at A[1]= " + A.getElementAtIndex(1));
        System.out.println("Correct Answer is\nValue at A[1]= 7");
      
    }
}
