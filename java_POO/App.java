public class App{
    public static void main(String[] args) {
        User userA = new User("Rafael", "Luis");
        System.out.println(userA.output());
        System.out.println(userA.output(false));
        System.out.println(userA.toString());

    }
}