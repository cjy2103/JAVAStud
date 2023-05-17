public class Tea extends Beverage{

    private final boolean customerWantsCondiments;

    public Tea(boolean customerWantsCondiments) {
        this.customerWantsCondiments = customerWantsCondiments;
    }

    @Override
    protected void brew() {
        System.out.println("차 우려내는중");
    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬 추가중");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return customerWantsCondiments;
    }
}
