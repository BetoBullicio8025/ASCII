
import java.util.Scanner;
    public class ASCII {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un texto: ");
            String str = scanner.nextLine();

            boolean esConsecutiva = true;

            for (int i = 1; i < str.length(); i++) {
                if ((int) str.charAt(i) != (int) str.charAt(i - 1) + 1) {
                    esConsecutiva = false;
                    break;
                }
            }

            System.out.println("Es consecutiva: " + esConsecutiva);
        }
      }

