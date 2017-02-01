public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int age;
	
    public Student (String firstName, String lastName, int id, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.id        = id;
        this.age       = age;
    }
	
	
	
    /**
     * Returns the first name string
     */
	
    public String getfirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the Student.
     *
     * @param firstName that is the desired first name string
     */
	
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
	
    /**
     * Returns the string that is the last name of the Student
     */
	
    public String getlastName() {
        return lastName;
    }
	
    /**
     * Sets the desired last name of the student.
     *
     * @param lastName the desired last name of the student string
     */
	
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
	
    /**
     * Returns the age of the student
     */
	
    public int getAge() {
        return age;
    }
	
    /**
     * Sets the age of the student. This age must be non-negative and not zero.
     *
     * @param age the new, non-negative age of the student.
     * @throws IllegalArgumentException if a negative or zero age is given.
     */
	
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }
	
    /**
     * Returns the id of the student
     */

    public int getID() {
        return id;
		
    }

    /**
     * Sets the id of the student. This value must be non-negative.
     *
     * @param id the new, non-negative id of the student.
     * @throws IllegalArgumentException if a negative id is given.
     */
	
    public void setID(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException();
        }
    }
		
	
    public static void main(String[] args) {
        Student A = new Student("Ryan", "Rosol", 123456, 19);
        A.setAge(21);
        System.out.println(A.getAge());
        System.out.println(A.getfirstName());
    }

}
