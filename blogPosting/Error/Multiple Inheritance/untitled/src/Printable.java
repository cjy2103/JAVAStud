public interface Printable {
    default void print(){
        System.out.println("A from interface");
    }
}
