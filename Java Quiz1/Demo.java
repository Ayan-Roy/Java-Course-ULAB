package Quiz1;

public class Demo {
	
	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		
		
		
		obj1.name = "Jalal Uddin";
		obj1.isMale = true;
		obj1.isProfessor = false;
		obj1.slot = "Fall";
		obj1.year = 2018;
		
		obj2.name = "Mesbah Karim";
		obj2.isMale = true;
		obj2.isProfessor = true;
		obj2.slot = "Spring";
		obj2.year = 2017;
		
		obj3.name = "Salma Sheikh";
		obj3.isMale = false;
		obj3.isProfessor = false;
		obj3.slot = "Summer";
		obj3.year = 2018;
		
			
		
		
		
		System.out.println(obj1.name+", "+obj1.retuurnGender(obj1.isMale)+"  "+obj1.returnPosition(obj1.isProfessor)+" joined in "+obj1.slot+" "+obj1.year);
		
		System.out.println(obj2.name+", "+obj2.retuurnGender(obj2.isMale)+"  "+obj2.returnPosition(obj2.isProfessor)+" joined in "+obj2.slot+" "+obj2.year);

		System.out.println(obj3.name+", "+obj3.retuurnGender(obj3.isMale)+"  "+obj3.returnPosition(obj3.isProfessor)+" joined in "+obj3.slot+" "+obj3.year);

		
		
		
		
	}

}
