public class pattern {
    public static void main(String[] args) {
        printPattern1(3);
        printPattern2(3);
        printPattern3(4);
        printPattern4(4);
    }

    private static void printPattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
    private static void printPattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void printPattern3(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void printPattern4(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

