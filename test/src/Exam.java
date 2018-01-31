import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        //사용자가 입력한 숫자를 저장하는 변수
        int num1;
        //사용자가 키보드 입력 준비
        Scanner kb = new Scanner(System.in);
        //사용자로부터 숫자 입력
        System.out.println("반지름을 입력하세요.");
        num1 = kb.nextInt();

        System.out.println("원의 넓이는?");
        System.out.println(area(num1));
    }
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


        /*
        System.out.println("abc"+3);
        System.out.println(1+4);
        System.out.println("Welcome to Java");
        System.out.println("First Java program");
        System.out.println("abc"+"def");

        System.out.println("Programing! It's fun.");

        System.out.println("My name is Hong Gil Dong");
        System.out.println("I am 13 years old");

        System.out.println("(@) (@)");
        System.out.println("(=^.^=)");
        System.out.println("(-m-m-)");

        System.out.println("I can program well.");
        System.out.println("Dreams come true.");

        System.out.println("My height");
        System.out.println(170);
        System.out.println("My weight");
        System.out.println("68.600000");
        System.out.println(5 + "Dan");
        System.out.println(5+" + "+2+" = "+10);

        System.out.println("item   count   price");
        System.out.println("pen"     +20+   "100");
        */

        //작성자 : 김예지
        //작성일 : 18.01.10
        //작성이유 : 수업...
        //.......

        /*
        작성자 : 김예지
        작성일 : 18.01.10
        작성이유 : 수업...
        .......
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        int num1;
        num1=10;

        int num2=20;
        int num3=num1+num2;
        System.out.println(num1+"+"+num2+"="+num3);
        */
//-------------------------------------------------------------------------------------------------------------

        /* 변수 연습 문제
        Q1. 문자를 저장하는 변수만들기
        Q2. 변수에 문자 'a' 저장하기
        Q3. 변수에 저장한 문자 'a' 출력하기
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        char name;
        name = 'a';

        System.out.println(name);
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        int n1=8;
        int n2=2;

        int resurt=n1+n2;
        System.out.println("덧셈 결과 : " + resurt);

        resurt=n1-n2;
        System.out.println("뺄셈 결과 : " + resurt);
        System.out.println("곱셈 결과 : " + n1*n2);
        System.out.println("나눗셈 결과 : " + n1/n2);
        System.out.println("나머지 결과 : " + n1%n2);
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        Q1. 정수 3개 저장하는 변수만들기
        Q2. 변수에 값 저장하기 (30 60 90)
        Q3. 합계 출력하기
        Q4. 평균 출력하기
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        int num1, num2, num3;
        num1= 30;
        num2= 60;
        num3= 90;
        int sum = num1+num2+num3;
        double average = sum / 3;

        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+average);
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        int num1, num2, num3;
        num1= 30;
        num2= 60;
        boolean resurlt;

        resurlt = num1 < num2;
        System.out.println("결과는 : "+resurlt);
        */
//-------------------------------------------------------------------------------------------------------------

//      관계 연산자 6가지 <, >, <=, >=, ==, !=
//      논리 연산자 3가지 &&(and), ||(or), !(not)

//-------------------------------------------------------------------------------------------------------------
        /*
        int num = 10;

        if(num>0) {
            System.out.println("num은 0보다 크다");
        }
        if((num%2) == 0) {
            System.out.println("num은 짝수");
        } else {
            System.out.println("num은 홀수");
        }
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        int score = 45;

        if (score >= 90) {
            System.out.println("성적은 수 입니다.");
        }
        else if(score >= 80) {
            System.out.println("성적은 우 입니다.");
        }
        else if(score >= 70) {
            System.out.println("성적은 미 입니다.");
        }
        else if(score >= 60) {
            System.out.println("성적은 양 입니다.");
        }
        else {
            System.out.println("성적은 가 입니다.");
        }
        */
//-------------------------------------------------------------------------------------------------------------
        // 2018/01/22 수업내용
        /*
        int n = 3;

        switch(n) {
            case 1:
                System.out.println("simple Java");
                break;

            case 2:
                System.out.println("funny Java");
                break;

            case 3:
                System.out.println("Fantastic Java");
                break;

            default:
                System.out.println("best Java");
                break;
        }

        System.out.println("hi java");
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        String str = "강아지";

        switch (str) {
            case "쥐":
                System.out.println("mouse");
                break;
            case "고양이":
                System.out.println("cat");
                break;
            case "강아지":
                System.out.println("dog");
                break;
            default:
                System.out.println("단어가 없습니다");
        }
        */
//-------------------------------------------------------------------------------------------------------------
        //2018/01/23 수업내용
        /*
        // 키보드 입력을 준비
        Scanner kb = new Scanner(System.in);
        // 입력할 숫자를 저장하는 변수
        String str;

        //문자를 키보드로 입력받음
        str = kb.nextLine();

//        //사용자가 입력한 숫자를 변수 num에 저장
//        num = kb.nextInt();

        //저장한 숫자를 출력함
        System.out.println(str);
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        Scanner keyboard=new Scanner(System.in);

        System.out.println("당신의 이름은?");
        String str=keyboard.nextLine();
        System.out.println("안녕하세요"+str+'님');
        System.out.println("당신은 스파게티를 좋아한다는데, 진실입니까?");
        boolean isTrue=keyboard.nextBoolean();
        if(isTrue==true)
            System.out.println("오~ 좋아하는군요.");
        else
            System.out.println("이런 아니었군요.");
        System.out.println("당신과 동생의 키는 어떻게 되나요?");
        double num1=keyboard.nextDouble();
        double num2=keyboard.nextDouble();
        double diff=num1-num2;
        if(diff>0)
            System.out.println("당신이"+diff+"만큼 크군요.");
        else
            System.out.println("당신이"+(-diff)+"만큼 작군요.");
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        int num = 0;
        int num2 = 0;
        //do while을 활용한 반복 출력
        do {
            System.out.println("java" +num);
            num++;
        } while (num<5);
        //while을 활용한 반복 출력
        while (num2<5) {
            System.out.println("java" +num2);
            num2++;
        }
        //for를 활용한 반복 출력
        for(int num3 = 0; num3 < 5; num3++) {
            System.out.println("java" +num3);
        }
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        String str;

        Scanner keyboard =  new Scanner(System.in);
        str = keyboard.nextLine();
//        System.out.println(str);
        for(int num=0; num<20; num++) {
            System.out.println(str);
        }
        */
//-------------------------------------------------------------------------------------------------------------

        /*
        for(int num2=1; num2<=10; num2++){
            System.out.print(num2*a +"");
        }for(int num2=0; num2<10; num2++){
            System.out.print((num2+1)*a +"");
        }
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        int num = 2;
        while (num < 10){
            if (num%5==0){
                break;
            }
            System.out.println(num);
            num++;
        }
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        //숫자를 저장하는 변수
        int num = 1;
        //숫자를 1씩 증가 시키면서 6의 배수이고 14의 배수인지 반복하여 무한루프로 검사
        while (true){
            //숫자를 6으로 나누어서 값이 0이고 숫자를 14로 나누어서 값이 0이어야 if부분이 참
            if(num%6==0 && num%14==0){
                //무한루프를 탈출
                break;
            }
            //숫자를 1 증가시킴
            num++;
        }
        //6과 14의 공배수를 출력
        System.out.println(num);
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        System.out.println("프로그램의 시작");
        hiEveryone(23);
        hiEveryone(24);
        System.out.println("프로그램의 끝");
    }
        public static  void  hiEveryone (int age)
    {
        System.out.println("좋은 아침입니다.");
        System.out.println("제 나이는 "+ age+"세입니다.");
    }
        */
//-------------------------------------------------------------------------------------------------------------
        /*
        System.out.println(adder(1,1));
        System.out.println(multi(1,2));
        System.out.println(divide(4,2));
        System.out.println(minus(5,2));
        System.out.println(modular(6,4));
        */
    /*
    }
    public static double adder (double num1, double num2){
        //덧셈값을 저장하는 변수 생성
        double resurt;
        //덧셈 연산 실행
        resurt = num1 + num2;
        //덧셈한 결과 값을 리턴(도출)
        return  resurt;
    }

    public static double multi (double num1, double num2){
        //곱셈값을 저장하는 변수 생성
        double resurt;
        //곱셈 연산 실행
        resurt = num1 * num2;
        //곱셈한 결과 값을 리턴(도출)
        return resurt;
    }

    public static double divide (double num1, double num2){
        //나눗셈값을 저장하는 변수 생성
        double resurt;
        //나눗셈 연산 실행
        resurt = num1 / num2;
        //나눗셈한 결과 값을 리턴(도출)
        return resurt;
    }

    public static double minus (double num1, double num2){
        //뺄셈값을 저장하는 변수 생성
        double resurt;
        //뺄셈 연산 실행
        resurt = num1 - num2;
        //뺄셈한 결과 값을 리턴(도출)
        return resurt;
    }

    public static double modular (double num1, double num2){
        //나머지값을 저장하는 변수 생성
        double resurt;
        //나머지 연산 실행
        resurt = num1 % num2;
        //나머지 결과 값을 리턴(도출)
        return resurt;

        //사용자가 입력한 숫자를 저장하는 변수
        double num1;
        double num2;

        //연산자를 구분할 문자를 저장하는 변수
        String operator;

        //사용자 키보드 입력 준비
        Scanner kb = new Scanner(System.in);
        //사용자로 부터 숫자 입력
        System.out.println("첫번째 숫자를 입력하세요.");
        num1 = kb.nextDouble();
        //개행문자 제거를 위한 flush 처리
        kb.nextLine();

        System.out.println("연산을 선택하세요(덧셈:a, 뺄셈:b, 곱셈:c, 나눗셈:d, 나머지:e)");
        operator = kb.nextLine();

        System.out.println("두번째 숫자를 입력하세요.");
        num2 = kb.nextDouble();

        switch (operator){
            case "a":
                System.out.println("덧셈한 결과는 다음과 같습니다.");
                System.out.println(adder(num1, num2));
                break;
            case "b":
                System.out.println("뺄셈한 결과는 다음과 같습니다.");
                System.out.println(minus(num1, num2));
                break;
            case "c":
                System.out.println("곱셈한 결과는 다음과 같습니다.");
                System.out.println(multi(num1, num2));
                break;
            case "d":
                System.out.println("나눗셈한 결과는 다음과 같습니다.");
                System.out.println(divide(num1, num2));
                break;
            case "e":
                System.out.println("나머지 결과는 다음과 같습니다.");
                System.out.println(modular(num1, num2));
                break;
            default:
                System.out.println("연산을 잘못 입력하셨습니다.");
        }

        System.out.println(adder(num1,num2));
        System.out.println(minus(num1,num2));
        System.out.println(multi(num1,num2));
        System.out.println(divide(num1,num2));
        System.out.println(modular(num1,num2));
    */
}
