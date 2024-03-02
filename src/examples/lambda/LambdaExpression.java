package examples.lambda;

public class LambdaExpression {
    public static void main(String[] args) {
        DoValue<Integer> area1 = (int k1,int k2) -> {
            int area = k1*k2/2;
            return area;
        } ;

        DoValue<Integer> area2 = (k1,k2) -> {
            int area = 1/2*k1*k2;
            return area;
        } ;

        DoValue<Integer> area3 = (k1,k2) -> {
            return 1/2*k1*k2;
        } ;

        ShowValue<Integer> show = value-> System.out.println(value);

        Triangle triangle = new Triangle(6,8);
        show.show(area1.getArea(triangle.getKatetFirst(), triangle.getKatetSecond()));
    }
}