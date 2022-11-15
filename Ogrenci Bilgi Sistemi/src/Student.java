public class Student {
    String name, studentNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    int avarage;
    boolean isPass;

    Student(String name, int classes, String studentNo, Course mat,
            Course fizik, Course kimya){
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addExamNote(int mat, int kimya, int fizik){
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }
    public void addsozluNote(int matSozlu, int kimyaSozlu, int fizikSozlu){
        if (matSozlu >= 0 && matSozlu <= 100) {
            this.mat.sozluNotu = matSozlu;
        }

        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            this.fizik.sozluNotu = fizikSozlu;
        }

        if (kimyaSozlu >= 0 && kimyaSozlu <= 100) {
            this.kimya.sozluNotu = kimyaSozlu;
        }
    }

    public void isPass(){
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Sisteme bütün notlar girilmemiş." +
                    "\nLütfen notları tamalayınız.");
        } else if (this.mat.sozluNotu == 0 || this.kimya.sozluNotu == 0 || this.fizik.sozluNotu == 0) {
            System.out.println("Sisteme bütün sözlü notları girilmemiştir.\nLütfen bütün notları tamamlayınız");
        } else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.avarage);
            if (this.isPass){
                System.out.println("Sınıfı geçtiniz.");
            }
            else{
                System.out.println("Sınıfta kaldınız.");
            }
        }

    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    public void calcAvarage(){
        double fizikToplam = ((this.fizik.note * 0.8) + (this.fizik.sozluNotu * 0.2));
        double kimyaToplam = ((this.kimya.note * 0.8) + (this.kimya.sozluNotu * 0.2));
        double matToplam = ((this.mat.note * 0.8) + (this.mat.sozluNotu * 0.2));
        this.avarage = (int) (fizikToplam + kimyaToplam + matToplam) / 3; //int dönüşümü yapılmasının amacı çıktıda virgülden sonra uzun çıktaların olamasının önlemek.
    }
    public void printNote(){
        System.out.println("=====================");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik Notu: " + this.mat.note);
        System.out.println("Fizik Notu: " + this.fizik.note);
        System.out.println("Kimya Notu: " + this.kimya.note);
    }
}
