public class casting_DownCasting {
    public static void main(String[] args) {
        PersonCasting p = new StudentCasting("Lee"); // upcasting
        StudentCasting s;

        s = (StudentCasting)p; // downcasting
        s.grade = "A"; // no error

        System.out.println(s.grade); // no error
    }
}
