public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
        Iphone iP10 = new Iphone("X", 100, "AT&T", "Zing Zing Zing!");

        s9.displayInfo();
        System.out.println("\n");
        System.out.println(s9.ring());
        System.out.println(s9.unlock());
        System.out.println("\n");

        iP10.displayInfo();
        System.out.println("\n");
        System.out.println(iP10.ring());
        System.out.println(iP10.unlock());
    }
}
