public class Practice {
    public static void main(String[] args) {
        int cost = 10000;
        int paid = 50000;
        System.out.println("Change: " + (paid - cost) + " Won");

        double discount = 30; // 소수점 값을 나오게 하기 위해서는 int 가 아닌 double 을 사용한다.
        int original = 43200;
        System.out.println("Cost: " + (original * (discount / 100)));
    }
}
