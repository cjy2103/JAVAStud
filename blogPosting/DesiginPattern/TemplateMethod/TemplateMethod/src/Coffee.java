public class Coffee extends Beverage{

    private final boolean customerWantsCondiments;

    public Coffee(boolean customerWantsCondiments) {
        this.customerWantsCondiments = customerWantsCondiments;
    }

    @Override
    protected void brew() {
        System.out.println("커피 우리는중");
    }

    @Override
    protected void addCondiments() {
        System.out.println("설탕, 우유 추가중");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return customerWantsCondiments;
    }
}
