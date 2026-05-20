import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", "2025001", "男", 88));
        list.add(new Student("李四", "2025002", "女", 95));
        list.add(new Student("王五", "2025003", "男", 76));
        list.add(new Student("赵六", "2025004", "女", 92));
        ClassManager manager1 = new BasicManager(list);
        manager1.printAllStudents();
        manager1.printAverageScore();
        ClassManager manager2 = new AdvancedManager(list);
        manager2.printAllStudents();
        manager2.printAverageScore();
        RandomNumHandlerDemo.main(null);
    }
}
