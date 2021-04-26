package objectOriented;

public class Main {

	public static void main(String[] args) {
		
		InstructorProvider instructorProvider = new InstructorProvider(007, "Engin Demirog");
		System.out.println(instructorProvider.hostname);

		Course course1 = new Course(01,"introduction to programming", "Engin Demirog");
		Course course2 = new Course(02,"C#", "Engin Demirog");		
		Course course3 = new Course(03,"java", "Engin Demirog");
		
		
		Course[] courseS = {course1,course2,course3};
		
		for(Course course : courseS) {
			System.out.println("short courses name: "+ course.courseName);
		}
		
		System.out.println("---------------NUMBER OF COURSE-----------------");
		
		System.out.println("number of courses available : " + courseS.length);
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course3);
		System.out.println("-----------3 ÝD HAS BEEN ADDED-----------------");
}
	
		
	

}
	

