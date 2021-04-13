public class UrlMain {
    public static void main(String[] args) {
        Url url = new StandardUrl();
        String param1 = url.getParam("param1", "url_example?param1=99&param2=string");
        System.out.println(param1);


        Url url1 = new ExtendedUrl();
        String param2 = url1.getParam("param2", "url_example/param2.55/param3.byte");
        String param3 = url1.getParam("param3", "url_example/param2.55/param3.byte");

        System.out.println(param2 + param3);
    }
}
