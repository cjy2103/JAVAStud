public class MusicCDFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new MusicCD();
    }
}
