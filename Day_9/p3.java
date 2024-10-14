class p3{
	public static void main(String args[]){
		for(int i=4; i>=1; i--){
			char ch='A';
			char ch1='a';
			for(int j=1; j<=i; j++){
				if(i%2==0){
					System.out.print(ch+"  ");
				}
				else{
					System.out.print(ch1+"  ");
				}
				ch++;
				ch1++;
			}
		System.out.println();
		}
	}
}