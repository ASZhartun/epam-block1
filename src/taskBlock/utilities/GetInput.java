package taskBlock.utilities;

import java.util.Scanner;

public class GetInput {
    Scanner scanner;

    public GetInput() {
        this.scanner = new Scanner(System.in);
    }

    public String scan() {
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        }
        else {
            System.out.println("Error");
            input = "";
        }
        return input;
    }
    public void close() {
        scanner.close();
    }
}
