import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
        // TODO...
        System.out.print("첫 번째 숫자를 입력해주세요 : ");
        double num1 = input.nextDouble();

        System.out.println(" ");

        System.out.print("원하는 연산자를 입력해주세요 : ");
        String operator = input.next();

        System.out.println(" ");

        System.out.print("두 번째 숫자를 입력해주세요 : ");
        double num2 = input.nextDouble();

        System.out.println(" ");

        double result = 0;

        switch (operator) {
            case "+":
                result = (num1 + num2);
                break;
            case "-":
                result = (num1 - num2);
                break;
            case "*":
                result = (num1 * num2);
                break;
            case "/":
                result = (num1 / num2);
                break;
            default:
                System.out.println("연산자를 잘못입력했습니다.");
                break;
        }
        System.out.println("답 : " + result);
    }
}
