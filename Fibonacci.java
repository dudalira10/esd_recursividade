public class Fibonacci{
		
		public static int fibonacci(int num){
			if((num == 1) || (num == 2)){
				return 1;
			}
			else
				return (fibonacci(num - 1) + fibonacci(num - 2));		
		}
		
		public static void main(String args[]){
			int aux = Integer.parseInt(args[0]);
			System.out.println(fibonacci(aux));
			
		}
		


}
