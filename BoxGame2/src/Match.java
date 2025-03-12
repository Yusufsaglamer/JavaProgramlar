public class Match {
    Fighter f1;
    Fighter f2;
    Fighter first;
    Fighter second;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void startFight(){

        if(Math.random()>0.5){
            this.first=f1;
            this.second=f2;


        }else {
            this.first=f2;
            this.second=f1;
        }
        System.out.println(first.name+" İlk başlıayacak yarışmacı.");
    }

    void run(){
        if (isCheck()){
            startFight();
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("==== YENi ROUND===");

                    this.second.health = this.first.hit(this.second);
                    if (isWin()) {
                        break;

                }
                    this.first.health = this.second.hit(this.first);
                    if (isWin()) {
                        break;
                    }
                System.out.println(this.f1.name+ " Sağlık: "+this.f1.health);
                System.out.println(this.f2.name+ " Sağlık: "+this.f2.health);
            }

        }

    }
    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }
    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " kazandı! ");
            return true;

        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " kazandı! ");
            return true;
        }
        return false;
    }

}
