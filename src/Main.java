public class Main {
    public static void main(String[] args) {
        long[] analytics = {5, 4, 7, 9, 14};
        SalesManager salesManager = new SalesManager(analytics);
        System.out.println(salesManager.max());
    }
}
