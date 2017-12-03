package CollectionExmples;

public class StudentSorting implements Comparable {
	String name;
	int age;
	int rollNo;
	public StudentSorting(String name, int age, int rollNo) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int compareTo(StudentSorting comparestu) {	
		int compareage=((StudentSorting)comparestu).getAge();
        /* For Ascending order*/
        return this.age-compareage;
        

        /* For Descending order do like this */
        //return compareage-this.studentage;
	}
	@Override
	public String toString() {
		return "StudentSorting [name=" + name + ", age=" + age + ", rollNo="
				+ rollNo + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
