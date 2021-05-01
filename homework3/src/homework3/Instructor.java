package homework3;

public class Instructor extends User{
		private int instructorNumber;
		private String education;
		
		public Instructor() {
			
		}
		
		public Instructor(int instructorNumber, String education) {
			super();
			this.instructorNumber = instructorNumber;
			this.education = education;
		}
		
		public int getInstructorNumber() {
			return instructorNumber;
		}

		public void setInstructorNumber(int instructorNumber) {
			this.instructorNumber = instructorNumber;
		}

		public String getEducation() {
			return education;
		}

		public void setEducation(String education) {
			this.education = education;
		}
		
}
