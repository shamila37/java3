public class Student {

    static void studentId(String name, int id){
        System.out.println("Name :- " + name + " ID " + id);
    }

    static void studentId(int id, String name){
        System.out.println("Name :- " + name + " ID " + id);
    }

}

class Test1{
    public static void main(String[] args) {
        Student.studentId("Shamila", 19828);
        Student.studentId(25245,"Gawesh");
    }
}
