public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee(false);
        coffee.prepareBeverage();

        System.out.println();

        Beverage tea = new Tea(true);
        tea.prepareBeverage();
    }
}