package InheritanceAndInterfaces;
/*Write a class MonsterTruck whose methods have the behavior below.
 Don't just print/return the output; whenever possible, use inheritance to
 reuse behavior from the superclass.*/

public class MonsterTruck extends Truck{

    public static void main(String[] args) {
        MonsterTruck monsterTruck = new MonsterTruck();
        monsterTruck.m1();
        System.out.println();
        monsterTruck.m2();
        System.out.println("\n"+monsterTruck.toString());
    }

    public void m1(){
        System.out.println("monster 1");
    }
    public void m2(){
        super.m1();
        super.m2();
    }
    public String toString(){
        return "monster "+super.toString();
    }
}
