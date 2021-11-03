public class Student extends Person {
    private String m_studentID;

    public String getStudentID()
    {
        return m_studentID;
    }

    public void setStudentID(String m_studentID)
    {
        this.m_studentID = m_studentID;
    }

    public void Set(String name, int age, String studentID)
    {
        Set(name, age);
        setStudentID(studentID);
    }

    // constructors
    Student()
    {
        super(); // calls the super constructor
        setStudentID("0000000000");
    }

    Student(String name, int age, String studentID)
    {
        super();
        setStudentID("00000000000");
    }

    // methods
    public void Studies()
    {
        System.out.println(getName() + " is studying.");
    }
    @Override
    public String toString()
    {
        String outputString = super.toString();
        outputString += "StudentID: " + getStudentID()+ "\n";
        return outputString;
    }
}
