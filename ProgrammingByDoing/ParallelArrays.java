import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        String[] names ={"Bongo","Matovu","Mugenyi","Pascal","Ouji"};
        double[] avGrade = {33.342,97.3422,68.2341,87.9768,78.97124};
        int[] id = {1234,1341,3123,9873,6183,8613};
        System.out.println("Values: ");
        for(int i=0;i<names.length;i++){
            System.out.println("\t\t"+names[i]+" "+avGrade[i]+" "+id[i]);
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("\nID number to find: ");
        int inNum = scan.nextInt();

        for(int i=0;i<names.length;i++) {
            if(inNum == id[i]){
                System.out.println("Found in slot "+i+"\n\t\tName: "+names[i]+"\n\t\tAverage: "+avGrade[i]+"\n\t\tID: "+id[i]);
            }
        }
    }
}
