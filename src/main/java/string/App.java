package string;

import static string.StringWork.*;

public class App {
    public static void main(String[] args) {
        //test1
        String str = "You Only Live Once. But if You do it right. once is Enough";
        int res = countUppercase(str);
        System.out.println("Số từ viết hoa là: " + res);

        String res1 = convertUppercaseFirstChar(str);
        System.out.println("-> Chuỗi in hoa toàn bộ chữ cái đầu: \n" + res1);

        String res2 = convertUppercaseFirstSentence(str);
        System.out.println("-> Chuỗi chỉ in hoa chữ cái đầu câu: \n" + res2);

        //test2: chuỗi có nhiều ngoại lệ
        System.out.println("========Test2==========");
        String str2 = "    -You Only LIVE ONE... " +
                "But if You do it right.\n once is Enough";
        res = countUppercase(str2);
        System.out.println("Số từ viết hoa là: " + res);

        res1 = convertUppercaseFirstChar(str2);
        System.out.println("-> Chuỗi in hoa toàn bộ chữ cái đầu: \n" + res1);

        res2 = convertUppercaseFirstSentence(str2);
        System.out.println("-> Chuỗi chỉ in hoa chữ cái đầu câu: \n" + res2);
    }
}
