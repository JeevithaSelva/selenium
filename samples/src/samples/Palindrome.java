package samples;

public class Palindrome {
	public static void main(String args[]){
		/*/
		int r,sum=0,temp;    
		  int n=454;
		  
		  temp=n;    
		  while(n>0){ 
			  System.out.println("when n value is"+n);
		   r=n%10;  
		   		   
		   sum=(sum*10)+r;                                       
		   n=n/10; 
		   System.out.println(sum);
		   System.out.println(r);
		   System.out.println(n);

		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");  
		  /*/
		String s1="hello";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++){
		System.out.println(ch[i]);
		}
		String[] array = {"A", "#", "B","#","C","#"};
		 for(int i=0; i<array.length; i++) 
			 
		 {
			 if (i%2==0)
			 {
				 System.out.println("even numbers");
			 }
			 else
			 {
				 System.out.println("odd numbers");
				 if (array[i] == "#")
				 {
					System.out.println("# values"); 
				 }
				 else
				 {
					 System.out.println("not # values");  
				 }
			 }
		 }
	
	}
}
