
public class Rivision15 {
	public static void calculator(int y, int z) {
		System.out.println(y+z);
		System.out.println(y-z);
		System.out.println(y*z);
		System.out.println(y/z);
		System.out.println(y%z);
		
			
		}
		public static void calculatorX() {
			System.out.println(2+2);
	}
		public static void calculatorW(int y, int z) {
			System.out.println(y+z);
		}
		public static int calculatorM(int y,int z) {
			System.out.println(y+z);
			return y+z;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String
		String fullname="Kul Rimal";
		System.out.println(fullname);
		
		String a =fullname.toUpperCase();
		System.out.println(a);
		
		//method changing
		int a1=fullname.toUpperCase().toLowerCase().length();
		System.out.println(a1);
		
		//comparison Relational operator
		// < , > , <= , >= , == , !=
		// entity < entity ---->>boolean
		System.out.println(10<12);//true
		System.out.println(9>8);//true
		System.out.println(5<=2);//false
		System.out.println(7>=6);//true
		System.out.println(5==5);//true
		System.out.println(7!=7);//false
		
		
		
		//Logical operator
		//AND,OR,NOT
		
		// AND operation
		
		// True && True ===>  True 
		// True && False ==>  False
		// False && True ==>  False
	    // False && False ==> False
		System.out.println(50==50&&40<30);//false
		
		
		// OR operator
		// True && True ===>  True 
	    // True && False ==>  True
	    // False && True ==>  True
	    //False && False ==> False
		System.out.println(10==10&&13>11);//true
		
		// NOT 
		// True -- False
		// False-- True 
			System.out.println(!(20 < 10)); //true
			
		// Conditional statements 
			
		//used when input has multiple outcomes
		
			
			
		 // numberT > 20 && numberT <= 25 >>>>> 10 %
		 // numberT > 25 && numberT < = 35  >>>>20 %
		 // numberT > 35 >>>> 30 %
			
			int numberT=27;
			if(numberT>20&&numberT<=25) {
				System.out.println("10% discount");
				}
			if(numberT>25&&numberT<=30) {
				System.out.println("20% discount");
			}
			if(numberT>35) {
				System.out.println("30% discount");
				
				}
			if(numberT>20&&numberT<=25) {
				System.out.println("10% discount");
			}
			else if(numberT>25&&numberT<=30) {
				System.out.println("20% dicount");
			}
			else if(numberT>35) {
				System.out.println("30% discount");
			}
			else{
				System.out.println("Wrong amount");
			}
			
			
			
			int marks = 85;
		if(marks > 99) {
			System.out.println("Grade A");
		}
			if(marks >85 ) {
				System.out.println("Grade B");
			}
			if(marks > 75) {
				System.out.println("Grade C");
			}
			
			if(marks > 99) {
				System.out.println("Grade A");
			}
			else if(marks > 85) {
				System.out.println("Grade B");
			}
			else if(marks > 75) {
				System.out.println("Grade C");
			}
			else {
				System.out.println("Grade dosent match");
			}
			
			// Tenary operator
		     int a2= 130;
		     int b2=200;
		     if(a2>b2) {
		    	 System.out.println("a2 is grater");
		    	 
		     }
		     else {
		    	 System.out.println("b2 is greater");
		     }
		     int min=(a2>b2)?a2:b2;
		     System.out.println(min);
		     
		     String minval=(a2<b2)?"a2 is small":"b2 is small";
		     System.out.println(minval);
		     
		     
		  // Switch case
				
				String city = "matthews";
				switch(city) {
				case "matthews":
				case "charlotte":
					System.out.println("NC");
					break;
				case "manhattan":
				case "queen":
					System.out.println("NY");
					break;
				case "san francisco":
				case "oak land":
					System.out.println("CA");
					break;
				default:
					System.out.println("Plese enter correct city");
				}
				
				//Loops
				
				//for(intiliazation ; conditionCheck; increment) {
					// statement
				
				//print 1 to 5 using for loops
				int  a3=5;
				for(int i=0;i<=5;i++) {
					System.out.println(i);
					
				}
				//break
				for(int i=0;i<=5;i++) {
					System.out.println(i);
					if(i==3) {
						break;
					}
					
				}
				//continue
				for(int i=0;i<=5;i++) {
					if(i==3) {
						continue;
					}
					System.out.println(i);
				}
				 //while
				int b=5;
				while(b<=5) {
					System.out.println(b);
					b++;
				}
				
		  //berak
				while(b<=5) {
					System.out.println(b);
					if(3==3) {
						break;
					}
					b++;
				}
				//continue
				
				while(b>=1) {
					if(3==3) {
						b--;
						continue;
					}
					System.out.println(b);
					b--;
				}
				
				// functions 
				int y=5;
				int z=7;
				System.out.println(y+z);
				System.out.println(y-z);
				System.out.println(y*z);
				System.out.println(y/z);
				System.out.println(y%z);
				
				int y1=50;
				int z1=70;
				System.out.println(y1+z1);
				System.out.println(y1-z1);
				System.out.println(y1*z1);
				System.out.println(y1/z1);
				System.out.println(y1%z1);
				
				calculator(5,7);
				calculator(50,70);
				
				calculatorX();
				calculatorX();
				
				calculatorW(3,2);
				calculatorW(2,1);
				
				int y2=calculatorM(5,7);
				System.out.println(y2);
				System.out.println(y2+5);
				
				
				

	}

}
