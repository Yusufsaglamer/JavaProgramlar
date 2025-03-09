public class Student {
    Course c1;
    Course c2;
    Course c3;


    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3) {
      this.name=name;
      this.stuNo=stuNo;
      this.classes=classes;
      this.c1=c1;
      this.c2=c2;
      this.c3=c3;
      this.avarage=0.0;
      this.isPass=false;


    }
    void  addBulkExamNote(int note1,int note2,int note3,int sozluc1,int sozluc2,int sozluc3){
        if (note1>=0 && note1<=100){
            c1.note= note1;

        }
        if (note2>=0 && note2<=100){
            c2.note= note2;

        }
        if (note3>=0 && note3<=100){
            c3.note= note3;

        }
        if (sozluc1>=0 && sozluc1<=100){
           c1.sozlu=sozluc1;

        }
        if (sozluc2>=0 && sozluc2<=100){
            c2.sozlu=sozluc2;

        }

        if (sozluc3>=0 && sozluc3<=100){
            c3.sozlu=sozluc3;

        }

        }

    void isPass(){
        System.out.println("====================");
        calcuAvarage();

        if (this.avarage>=55){
            System.out.println("Sınıfı Geçtiniz");
            this.isPass=true;
        }
        else {
            System.out.println("Hababam sınıfı sınıfta kaldı.");
            this.isPass=false;
        }
        printNote();
    }

    void calcuAvarage(){

        double ratiosozluc2=0.20;
        double ratiosozluc1=0.30;
        double ratiosozluc3=0.40;

        double rationotec2=0.80;
        double rationotec1=0.70;
        double rationotec3=0.60;

        double c1Avrg,c2Avarg,c3Avrg;

        c1Avrg=((c1.note*rationotec1)+c1.sozlu*ratiosozluc1);
        c2Avarg=((c2.note*rationotec2)+c2.sozlu*ratiosozluc2);
        c3Avrg=((c3.note*rationotec3)+c3.sozlu*ratiosozluc3);
        this.avarage=(c1Avrg+c2Avarg+c3Avrg)/3.0;












    }



    void printNote(){
        System.out.println(c1.name +" Notu:"+c1.note);
        System.out.println(c2.name +" Notu:"+c2.note);
        System.out.println(c3.name +" Notu:"+c3.note);
        System.out.println(c1.name +" Sözlü Notu:"+c1.sozlu);
        System.out.println(c2.name +" Sözlü Notu:"+c2.sozlu);
        System.out.println(c3.name +" Sözlü Notu:"+c3.sozlu);
        System.out.println("Ortalamanız:"+this.avarage);





    }
}
