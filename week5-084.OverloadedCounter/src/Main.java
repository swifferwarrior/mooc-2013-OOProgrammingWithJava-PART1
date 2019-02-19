public class Main {
    public static void main(String[] args) {
        Counter c = new Counter(true);
        
        System.out.println(c.value());
        
        c.increase();
        System.out.println(c.value());
        
        c.decrease();
        System.out.println(c.value());
        
        c.increase(7);
        System.out.println(c.value());
        
        c.decrease(8);
        System.out.println(c.value());
    }
}
