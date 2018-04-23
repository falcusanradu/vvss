public class Palindrom {

    public Palindrom() {
    }

    public boolean isPalindrom(String original) {
        int i = original.length() - 1;

        for (int j = 0; i > j; ++j) {
            if (original.charAt(i) != original.charAt(j)) {
                return false;
            }

            --i;
        }

        return true;
    }

    /**
     * If str is not palindrom it searches for the greatest seqence of palindroms in str.
     *
     * @param str mandatory
     * @return str or max sequence of palindroms
     */
    public String searchPal(String str) {
        String max = "";
        if (str.equals("")) {
            return "Stringul este gol";
        } else if (str.length() != 1 && !isPalindrom(str)) {
            for (int i = 0; i < str.length() - 1; ++i) {
                for (int j = str.length() - 1; j > i; --j) {
                    if (isPalindrom(str.substring(i, j + 1)) && max.length() < str.substring(i, j + 1).length()) {
                        max = str.substring(i, j + 1);
                    }
                }
            }

            return max;
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        Palindrom p = new Palindrom();
        System.out.println(p.searchPal("k"));
    }
}
