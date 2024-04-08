package company;

public class library {

    public static void main(String[] args) {
     // length()メソッド
        String str = " Hello World! ";
        System.out.println(str.length()); // 14

        // substring()メソッド
        System.out.println(str.substring(1, 4)); // "Hel"

        // contains()メソッド
        System.out.println(str.contains("llo")); // true

        // replace()メソッド
        System.out.println(str.replace('l', 'L')); // " HeLLo WorLd! "

        // trim()メソッド
        System.out.println(str.trim()); // "Hello World!"

        // formatted()メソッド
        String name = "Alice";
        int age = 25;
        double height = 1.7;

        String formattedString = "Name: %s, Age: %d, Height: %.2f".formatted(name, age, height);
        System.out.println(formattedString);
    }

}
