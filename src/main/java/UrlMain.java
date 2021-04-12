public class UrlMain {
    public static void main(String[] args) {
        Url url = new StandardUrl();
        String param1 = url.getParam("param1", "url_example?param1=99&param2=string");
        System.out.println(param1);

    }
}
