package taskBlock.utilities;

import java.util.Scanner;

public class GetInput {
    public static int integer() {
        int result = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            result = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong value...");
        }
        return result;
    }
}
