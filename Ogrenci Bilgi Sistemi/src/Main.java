public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe","90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli","90550000002", "KMY");

        Course mat = new Course("Matematik","MAT101","MAT");
        Course fzk = new Course("Fizik", "FZK101","FZK");
        Course kmy = new Course("Kimya","KMY101","KMY");

        mat.addTeacher(t1);
        fzk.addTeacher(t2);
        kmy.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 3,"140010002",mat, fzk,kmy);
        s1.addExamNote(65,32,45);
        s1.addsozluNote(90,80,95);
        s1.isPass();

        Student s2 = new Student("Deli Necmi",2,"200203004",mat,fzk,kmy);
        s2.addExamNote(76,55,34);
        s2.addsozluNote(100,85,90);
        s2.isPass();
    }
}