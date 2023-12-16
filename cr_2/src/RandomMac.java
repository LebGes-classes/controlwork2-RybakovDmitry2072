import java.util.ArrayList;
import java.util.Comparator;

public class RandomMac {
    public void distributeMacbooks(ArrayList<StudentOfinstitute> students) {
        int macbookCount = (int) (students.size() * 0.25);
        students.sort(Comparator.comparingInt(StudentOfinstitute::getRating).reversed());

        System.out.println("\nСтуденты, получившие макбуки:");
        for (int i = 0; i < Math.min(macbookCount, students.size()); i++) {
            System.out.println(students.get(i));
        }
    }
}
