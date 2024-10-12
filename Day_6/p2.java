class P2{
	public static void main(String args[]){
		double percentage = 89.0;
		char grade ='A' ;
		if(percentage >= 90 && percentage <= 100){
			grade = 'A';
		}
		else if(percentage >= 80 && percentage <= 89){
			grade = 'B';
		}
		else if(percentage >= 70 && percentage <= 79){
			grade = 'C';
		}
		else if(percentage >= 60 && percentage <= 69){
			grade = 'D';
		}
		else if(percentage >= 50 && percentage <= 59){
			grade = 'E';
		}
		else if(percentage >= 49){
			grade = 'F';
		}
		System.out.println("The grade is: " + grade);
	}
}