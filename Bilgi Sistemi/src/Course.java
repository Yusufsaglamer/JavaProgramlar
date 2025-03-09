public class Course {
    String name;
    String code;
    String prefix;
    double note;
    double sozlu;
    Teacher teacher;
    //burda teacher sınfından çağırıcağımız bir teacher niteliği,nesnesi oluşturduk.
    //çünkü nesnelerde veri tipi gibi kullabılabiliyor.

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        double note=0;
        double sozlu=0;





    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            // burda artık t1 nesnesi oldu çünkü main kısmında bu metoda y1 nesnesi girdik.
           // printTeacher();
        }else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }

    }
    void printTeacher(){
        this.teacher.print();
        // burda yukarıdaki teacher niteliğini teacher classındaki print metoduna entegre ettik.
    }



}
