package objectOriented;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println(course.courseId + "id has been added");
	}
	public void removeCourse(Course course) {
		System.out.println(course.courseId + "id has been removed");
	}
}
