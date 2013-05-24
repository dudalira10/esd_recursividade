public class Fatorial{

	public static int fatorial(int num){
		if(num == 0){
			return 1;
		}
		else
			return num * fatorial(num - 1);
	}
	
	public static void main(String args[]){
			int aux = Integer.parseInt(args[0]);
			System.out.println(fatorial(aux));
			
		
	}


}
