// instanceof 연산자
// reference가 가리키는 객체 타입 식별을 위해 사용함
// referenct instanceof classtype
// t/f 값 return

class e4_Person {}
class e4_Student extends e4_Person {}
class e4_Researcher extends e4_Person {}
class e4_Professor extends e4_Researcher {}

public class E4_InstanceOfEx {
    static void print(e4_Person p) {
        if(p instanceof e4_Person) System.out.print("Person ");
        if(p instanceof e4_Student) System.out.print("Student ");
        if(p instanceof e4_Researcher) System.out.print("Researcher ");
        if(p instanceof e4_Professor) System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() -> \t"); print(new e4_Student());
        System.out.print("new Researcher() -> \t"); print(new e4_Researcher());
        System.out.print("new Professor() -> \t"); print(new e4_Professor());
    }
}