class p2{
	public static void main(String args[]){
		int a=20, b=30, c=40;
		if(a<b && a<c){
			System.out.print(a+" is the smallest");
		}
		else if(b<a && b<c){
			System.out.print(b+"is the smallest");
		}
		else{
			System.out.print(c+"is the smallest");
		}
	}
}