import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        //입력 값을 저장할 변수 선언
        int a;
        //입력을 받기 위해 준비
        Scanner kb = new Scanner(System.in);
        //사용자로부터 입력을 받아 변수에 저장
        a = kb.nextInt();
        //횟수를 저장하는 변수 num 생성 후 횟수를 0으로 저장
        int num = 0;
        //10번 반복하여 출력
        while (num < 10) {
            num++;
            System.out.print(num*a + " ");
        }
    }
}
//-------------------------------------------------------------------------------------------------------------
        /*
        //사용자가 입력한 숫자를 저장하는 변수
        int num1;
        //사용자가 키보드 입력 준비
        Scanner kb = new Scanner(System.in);
        //사용자로부터 숫자 입력
        System.out.println("숫자를 입력하세요.");
        num1 = kb.nextInt();
        */

        /* type1
        if(num1>1000) {
            System.out.println("입력한 숫자가 1000보다 큽니다.");
        } else {
            System.out.println("1에서 입력한 숫자까지의 합은?");
            System.out.println(addOneToValue(num1));
        }
        */

        /*type2
        if(num1>1000) {
            System.out.println("입력한 숫자가 1000보다 큽니다.");
            return;
        }
        System.out.println("1에서 입력한 숫자까지의 합은?");
        System.out.println(addOneToValue(num1));
        */

        /*
        public static int addOneToValue(int num1) {
            int temp = 1;
            int result = 0;

            while (temp <= num1) {
                result = result + temp;
                temp = temp + 1;
            }
        }
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        //사용자가 입력한 숫자를 저장하는 변수
        int num1;
        //사용자가 키보드 입력 준비
        Scanner kb = new Scanner(System.in);
        //사용자로부터 숫자 입력
        System.out.println("반지름을 입력하세요.");
        num1 = kb.nextInt();

        System.out.println("원의 넓이는?");
        System.out.println(area(num1));

        //오늘 순서도에서 쓰인 area() 함수
    public static double area (int radian) {
        double temp;
        double result;
        //오늘 순서도
        temp = multi(radian, radian);
        result = multi(temp, 3.14);
        //어제 순서도
        //result = radian * radian *3.14;
        return result;
    }
    public static double multi(double num1, double num2) {
        double result;
        //곱셈 연산 실행
        result = num1 * num2;
        //곱셈한 결과 값을 리턴(도출)
        return result;
    }
        */

