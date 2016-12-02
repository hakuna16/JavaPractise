package com.rituj.mvc;

public class MVCPatternDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student model = retriveStudentDataFromDB();
	
	StudentView view = new StudentView();
	
	StudentController controller = new StudentController(model,view);
	 
	controller.updateView();

    //update model data
    controller.setStudentName("John");

    controller.updateView();
	}
	
	public static Student retriveStudentDataFromDB(){
			
			Student student = new  Student();
			student.setName("rituj");
			student.setRollno("1001");
			
		return student;
		
	}

}
