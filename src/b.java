public class b {
    public static void main(String[] args) {

        Long before = System.currentTimeMillis();
        String str = "FA5B4710F78C";
        String regex = "(.{2})";
        str = str.replaceAll(regex, "$1:");
        str = str.substring(0, str.length() - 1);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        System.out.println(str);
        System.out.println(589/750.0);
        String s="b6625c01c65e16f40d110000";
    }
}
