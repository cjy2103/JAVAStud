public abstract class Beverage {
    public final void prepareBeverage(){
        boilWater();
        brew();
        pourIntoCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 추상 메서드 - 하위 클래스에서 구현해야 함
    protected abstract void brew();

    // 추상 메서드 - 하위 클래스에서 구현해야 함
    protected abstract void addCondiments();

    // 공통 메서드
    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    private void pourIntoCup() {
        System.out.println("컵에 따르는 중");
    }

    protected boolean customerWantsCondiments() {
        return false;
    }

}
