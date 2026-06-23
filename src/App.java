public class App {
    public static void main(String[] args) throws Exception {
        String javaStr = "J@va 11is the be$t56";

        Reversed reversed = new Reversed();

        String reversedString = reversed.reversedString(javaStr);

        System.out.println(reversedString);
    }
    
}
