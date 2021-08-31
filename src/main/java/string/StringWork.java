package string;

public class StringWork {
    /**
     * Cho chuỗi sau: You Only Live Once. But if You do it right. once is Enough
     * 1. Đếm số từ viết in hoa trong chuỗi (VD: chuỗi trên có 7 ký tự in hoa)
     * 2. Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó (VD: You Only Live Once.
     * But If You Do It Right. Once Is Enough)
     * 3. Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa,
     * các chữ con lại viết thường (VD: You only live once. But if you do it right. Once is enough)
     */

    public static int countUppercase(String str) { //đếm số từ viết hoa
        int res = 0;
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                res++;
            }
        }
        return res;
    }

    public static String convertUppercaseFirstChar(String str) {//Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi
        String stringRes = "";
        char c = str.charAt(0);
        char tmp;

        stringRes += Character.toUpperCase(c);

        for (int i = 1; i < str.length(); i++) {
            tmp = str.charAt(i - 1);
            c = str.charAt(i);
            if (Character.isLetter(c) && Character.isSpaceChar(tmp)) {
                stringRes += Character.toUpperCase(c);
            } else {
                stringRes += c;
            }
        }
        return stringRes;

    }

    public static String convertUppercaseFirstSentence(String str) { //viết hoa đầu câu
        String stringRes = "";
        char c, tmp;
        int begin = 0;

        String str1 = str.toLowerCase();

        for (int i = 0; i < str1.length(); i++) { //xử lí trường hợp chuỗi nhập vào gồm nhiều kí tự trắng đầu đoạn
            //hoặc kí tự đặc biệt
            c = str1.charAt(i);
            begin++;
            stringRes += Character.toUpperCase(c);
            if (Character.isLetter(c)) {
                break;
            }
        }

        int j = begin;
        for (int i = j; i < str1.length(); i++) {
            c = str1.charAt(i);

            if (!Character.toString(c).equals(".")) {
                stringRes += c;
            } else {
                stringRes += c;
                for (j = i + 1; j < str1.length(); j++) { //người dùng có thể nhập nhiều space trước khi viết thêm câu mới
                    c = str1.charAt(j);
                    stringRes += Character.toUpperCase(c);
                    if (Character.isLetter(c))
                        break;
                }
            }
            i = j++;
        }
        return stringRes;
    }
}


