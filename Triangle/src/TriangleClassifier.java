public class TriangleClassifier {
    public static String getTriangle(int a, int b, int c) {
        boolean triangularConditions = a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
        if (triangularConditions) {
            boolean b1 = a == b;
            boolean b2 = b == c;
            boolean b3 = a == c;
            if (b1 && b2) {
                return "Tam giac deu";
            } else if (b1 || b2 ||b3) {
                return "Tam giac can";
            }
            return "Tam giac thuong";
        }
        return "Khong phai tam giac";
    }
}
