package Lab0;

public class Intro2JavaNForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//EX1
        makeMultTable(63);
        */
		/*//EX2
        deductK(105,8); 
        */
		/*//EX3
        makeUpwardRightTriangle(6);
        */
		/*//EX4
        makeDownwardRightTriangle(5);
        System.out.println("The Correct answer is ");   
        System.out.println("*****\n****\n***\n**\n*\n");
	        */
		/*//EX5
        makeUpwardIsosceles(4);
        System.out.println("The Correct answer is ");   
        System.out.println("    *\n   ***\n  *****\n *******\n*********\n");  
	    */    
	}

	public static void makeMultTable(int M)
    {
		System.out.println("X	"+M);
		for(int i=0; i<=12;i++) {
			System.out.println(i+"	"+M*i);
		}
    }
	
	public static void deductK(int M, int k)
    {  
		for(int i=0; M>0;i++) {
			System.out.print(M+" ");
			M=M-k;
		}
    }
	public static void makeUpwardRightTriangle(int w)
    {  
		for(int i=0; i<=w;i++) {
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
	public static void makeDownwardRightTriangle(int w)
    { 
		for(int i=0; i<=w;i++) {
			for(int j=0; j<w-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
	public static void makeUpwardIsosceles(int w)
    {  
		for(int i=0; i<=w;i++) {
			for(int k=0; k<w-i;k++) {
				System.out.print(" ");
			}
			for(int l=0; l<=i;l++) {
				System.out.print("*");
			}
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}
