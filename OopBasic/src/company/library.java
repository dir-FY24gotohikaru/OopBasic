package company;

public class library {

    public static void main(String[] args) {
     // length()メソッド
        String str = " Hello World! ";
        System.out.println(str.length()); // 14
        //空白も含めた半角文字数を返す

        // substring()メソッド
        System.out.println(str.substring(1, 4)); // "Hel"
        //半角１文字目から４文字目までを返す

        // contains()メソッド
        System.out.println(str.contains("llo")); // true
        //文字列に「llo」が含まれていたら「true」を返す

        // replace()メソッド
        System.out.println(str.replace('l', 'L')); // " HeLLo WorLd! "
        //小文字の「l」を大文字の「L」に置換する

        // trim()メソッド
        System.out.println(str.trim()); // "Hello World!"
        //先頭と末尾の空白を削除して表記する

        // formatted()メソッド
        String name = "Alice";
        int age = 25;
        double height = 1.7;

        String formattedString = "Name: %s, Age: %d, Height: %.2f".formatted(name, age, height);
        System.out.println(formattedString);
        //なぜ「.formatted」の形になるのか分からないので質問すること！
    }

}
