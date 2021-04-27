class PersonCasting {
    String name;
    String id;

    public PersonCasting(String name) {
        this.name = name;
    }
}

class StudentCasting extends PersonCasting {
    String grade;
    String department;

    public StudentCasting(String name) {
        super(name);
    }
}

public class casting_UpCasting {
    public static void main(String[] args) {
        PersonCasting p;
        StudentCasting s = new StudentCasting("Lee");
        p = s; // upcasting

        System.out.println(p.name); // no error
        
        // p.grade = "A" // error
        // p.department = "Com"; // error

        // reference p 이용 시 Student 객체의 멤버 중 Person의 멤버만 접근 가능
        // reference s 이용 시 Student 객체의 멤버, Person 객체의 멤버 모두 접근 가능
    }
}
