public class InheritRandom extends Random {
    public InheritRandom() {
        super();
    }
    public InheritRandom(String str) {
        super(str);
    }
    public static void main(String[] args) {
        InheritRandom cls = new InheritRandom("Hello");
        System.out.println(cls);
    }
}