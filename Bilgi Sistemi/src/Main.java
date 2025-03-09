public class Main {
    public static void main(String[] args) {

        Teacher t1=new Teacher("Mahmut Hoca","55555","TRH");
        Teacher t2=new Teacher("Graham","0001","FZK");
        Teacher t3=new Teacher("Külyutmaz","04432","BIO");


        Course tarih=new Course("Tarih","101","TRH");
             tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","101","FZK");
            fizik.addTeacher(t2);
        Course biyo=new Course("Biyoloji","101","BIO");
            biyo.addTeacher(t3);


        Student s1=new Student("inek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50,50,60,70);
        s1.isPass();


        Student s2=new Student("Güdük Necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,60,80,90,10);
        s2.isPass();

    }
}