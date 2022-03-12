public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("-*---YENİ ROUND----*");
                if(f1.start()) {
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(f2.name + ":" + f2.health + " canı kaldı");
                    if (isWin()) {
                        break;
                    }
                }
                else {
                this.f1.health = this.f2.hit(f1);
                System.out.println(f1.name + ":" + f1.health + " canı kaldı");
                if (isWin()) {
                    break;
                }
                }
            }
        } else {
            System.out.println("SİKLETLER UYMUYOR!!");
        }
    }
    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<= maxWeight) && (this.f2.weight>=minWeight &&this.f2.weight<=maxWeight);

        }
        boolean isWin(){
        if (this.f1.health==0){
            System.out.println(f2.name+ " kazandı!!!");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(f1.name+ " kazandı!!!");
            return true;
        }
        else
            return false;
        }
    }

