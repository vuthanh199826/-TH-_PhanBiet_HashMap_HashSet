import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("name1",20,"HN");
        Student student2 = new Student("name2",20,"HN");
        Student student3 = new Student("name3",20,"HN");
        Map<Integer,Student> hashMap = new HashMap<>();
        hashMap.put(2,student1);
        hashMap.put(1,student3);
        hashMap.put(3,student2);
        for (Map.Entry<Integer,Student> student: hashMap.entrySet()){
            System.out.println(student);
        }
        System.out.println("--------------------------");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student:students){
            System.out.println(student);
        }

    }
}
