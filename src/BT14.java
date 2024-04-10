public class BT14 {
    public static void main(String[] args) {
        Student studen1 = new Student(1, "Nguyen Van A", 8.5);
        Student studen2 = new Student(2, "Nguyen Van B", 9.5);
        Student studen3 = new Student(3, "Nguyen Van C", 7.5);
        Student[] students = {studen1, studen2, studen3};
        System.out.println("Before sort:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("After sort:");
        Student[] bubbleSortedStudents = bubbleSort(students.clone());
        for (Student student : bubbleSortedStudents) {
            System.out.println(student);
        }
        Student[] selectionSortedStudents = selectionSort(students.clone());
        for (Student student : selectionSortedStudents) {
            System.out.println(student);
        }
        Student[] insertionSortedStudents = insertionSort(students.clone());
        for (Student student : insertionSortedStudents) {
            System.out.println(student);
        }
    }

    private static Student[] bubbleSort(Student[] students) {
        for (int unsortedArrLen = students.length; unsortedArrLen > 0; unsortedArrLen--) {
            for (int i = 0; i < unsortedArrLen - 1; i++) {
                if (students[i].score() > students[i + 1].score()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }
        return students;
    }

    private static Student[] selectionSort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            Student temp = students[i];
            int minIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].score() < students[minIndex].score()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                students[i] = students[minIndex];
                students[minIndex] = temp;
            }
        }
        return students;
    }

    private static Student[] insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student temp = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].score() > temp.score()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = temp;
        }
        return students;
    }
}
