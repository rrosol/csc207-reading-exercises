public class StringMethods {

    public static boolean endsWithRep(String s1, String s2, int n) {
        String comp = s2;
        for(int i = 1; i < n; i++) {
            comp += s2;
        }
        return s1.endsWith(comp);
    }


public static void main(String[] args) {
    System.out.println(endsWithRep("foobarbar", "bar", 1));
    System.out.println(endsWithRep("foobarbar", "baz", 1));
}

}
