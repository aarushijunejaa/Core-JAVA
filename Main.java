class Student_class_structure {

    int id;
    String n;

    public Student_class_structure(int id, String n) {
        this.id = id;
        this.n = n;
    }

}

public class Main{
    public static void main(String args[])
    {
       Student_class_structure s1 = new Student_class_structure(10,"Aarushi");
       System.out.println(s1.id);
       System.out.println(s1.n);
    }
}
