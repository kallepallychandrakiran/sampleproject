class Fib {
	public static void main(String[]args){
		int n = 27 ;
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibonacci series till " + n + " terms: ");
		for(int i=1;i<=n;++i){
				System.out.print(firstTerm+",");
				int nextTerm = firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
		}
	}
}