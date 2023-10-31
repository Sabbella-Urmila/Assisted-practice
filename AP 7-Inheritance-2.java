package javaprograms;

public class InbuiltDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title="Simplilearn online courses";
		//method1:contains()
		if(title.contains("l")){
			System.out.println("title is valid");
		}
		else {
			System.out.println("title is not valid");
		}
		//method2:equals()
		//this method will compare 2 strings of every character
		//it will give output as true or false
		if(title.equals("Simplilearnonlinecourses")) {
			System.out.println("title is valid");
			
		}
		else {
			System.out.println("title is not valid");
		}
	
		//method 3:substring()
				String title2= "practice labs java";
				String result=title2.substring(14);
				if(result.equals("java")) {
					System.out.println("string is valid");
				}
				else {
					System.out.println("string is not valid");
				}
	}
}
	
	
