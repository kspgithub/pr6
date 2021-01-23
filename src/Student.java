import java.lang.reflect.Array;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private Integer id;
    private double gpa;

    public Student(String name, String surname, Integer id, double gpa) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gpa = gpa;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }


    @Override
    public int compareTo(Student o) {
        int result = this.id.compareTo(o.id);
        return result;
    }

    public static void getList(Student[] list){
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-32s | %6s | %s\n", "Имя", "ID", "Итоговый балл");
        System.out.println("------------------------------------------------------------");
        for ( int i = 0; i < list.length; ++i )
            System.out.printf("%-32s | %6d | %.2f\n", list[i].getFullName(), list[i].getId(), list[i].getGpa());
        System.out.println("------------------------------------------------------------");
    }

    public static void sort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
}
