public class Main {
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();

        a.push("a");
        a.push("b");
        a.push("c");
        a.push("d");
        a.push("e");
        a.push("f");

        System.out.println(a);
        String str = "f";
        int b = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.peek().equalsIgnoreCase(str)){
                break;
            }
            a.pop();
            b++;
        }
        System.out.println(str);
        System.out.println(b);
    }
}
