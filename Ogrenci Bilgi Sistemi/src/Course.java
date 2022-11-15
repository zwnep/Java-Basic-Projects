public class Course {
    String name;
    String ders_ıd;
    String code;
    int sozluNotu;
    int note;
    Teacher courseTeacher;

    Course(String name, String code, String ders_ıd){
        this.name = name;
        this.ders_ıd = ders_ıd;
        this.note = 0;
        this.code = code;
    }
    public void addTeacher(Teacher t1){
        if (this.ders_ıd.equals(t1.Branch)) {
            this.courseTeacher = t1;
            System.out.println(" İşlem Başarılı.");
        }
        else{
            System.out.println(t1.name + " Akademisyeni bu dersi veremez.");
        }
    }
    public void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
