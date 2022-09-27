class cars12{
	int licenceplateno;
	String carname ;
	static String woner="KUL";
	public cars12(int licno,String name) {
		this.licenceplateno=licno;
		this.carname=name;
	}
	public void start() {
		System.out.println("bhum bhum");
		System.out.println(this.carname);
	}
	public static void cal() {
		System.out.println("I can be called without object");
	}
}







public class Rivision16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// with call constructor
		cars12 car=new cars12(123,"BMW");
		System.out.println(car.licenceplateno);
		System.out.println(car.carname);
		
		car.start();
		car.cal();
		System.out.println(car.woner);

	}

}
