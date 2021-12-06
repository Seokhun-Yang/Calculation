public class Calculation {

    // 사칙연산
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println(a + b); // a 더하기 b
        System.out.println(a - b); // a 빼기 b
        System.out.println(a * b); // a 곱하기 b
        System.out.println(a / b); // a 나누기 b

    //증감 연산
        int i = 10;
        int j = 20;
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);

        int k = 0;
        System.out.println(k++); // 값이 참조된 후에 증가
        System.out.println(k--);
        System.out.println(++k); // 값이 참조되기 전에 증가
        System.out.println(--k);

    }
}