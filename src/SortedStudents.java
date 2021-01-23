
import java.util.Comparator;
public class SortedStudents {
    public static void main(String[] args) {
        Student[] students = new Student[8];
        students[0] = new Student("Зинаида", "Иванова", 1123, 5);
        students[1] = new Student("Мария", "Булавкина", 8835, 4.6f);
        students[2] = new Student("Иван", "Отвёрткин", 7783, 3.7f);
        students[3] = new Student("Валентин", "Шниферштейн", 1111, 4);
        students[4] = new Student("Паулина", "Решето", 2934, 3);
        students[5] = new Student("Василий", "Петров", 4432, 3.5f);
        students[6] = new Student("Эмануил", "Сидоров", 2334, 4.32f);
        students[7] = new Student("Инакентий", "Розенкранц", 4432, 3.44f);

        Student.getList(students);
        Student.sort(students);
        Student.getList(students);

    }


}
