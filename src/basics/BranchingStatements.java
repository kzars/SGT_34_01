package basics;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            if (i == 1) {
                break;
            }
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i);
            if(i == 8){
                continue;
            }
        }

        for (int i = 0; i <= 100; i++){
            if (i % 2 > 0){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i =0; i <= 100; i+=2){
            System.out.print(i + " ");
        }









    }
}
