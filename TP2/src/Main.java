import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void infopPerso() {
        System.out.println("pe");
    }

    public void isBinarySumInArray(int[] integer, int val){
        boolean sum = false;
        for (int i=0; i<integer.length; i++) {
            for (int j=i+1; j<integer.length; j++ ) {
                if (integer[i] + integer[j] == val) {
                    sum = true;
                    break;
                }
            }
        }
        System.out.println(sum);
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        } else if (delta == 0) {
            float racine = -b / (2 * a);
            System.out.println("Ce polynome a une racine reelle double : " + racine + "");
        } else {
            float racine1 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            float racine2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("Ce polynome a deux racines reelles : " + racine1 + " et " + racine2);
        }
    }

}