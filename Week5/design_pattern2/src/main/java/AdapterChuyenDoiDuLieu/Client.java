package AdapterChuyenDoiDuLieu;

public class Client {
    public static void main(String[] args) {
        String xmlData = "<person><name>Ngo Hiep</name><age>21</age></person>";
        String jsonData = "{\"person\":{\"name\":\"Ngo Hiep\",\"age\":21}}";

        // Tạo đối tượng XML
        XmlData xml = new XmlDataImpl(xmlData);

        // Chuyển đổi XML -> JSON
        JsonData jsonAdapter = new XmlToJsonAdapter(xml);
        System.out.println("Converted JSON:");
        System.out.println(jsonAdapter.getJson());

        // Chuyển đổi JSON -> XML
        String json = "{ \"name\": \"Ngo Hiep\", \"age\": 21, \"city\": \"Binh Dinh\" }";
        String xmlOutput = JsonToXmlAdapter.convertJsonToXml(json);
        System.out.println("\nConverted XML:");
        System.out.println(xmlOutput);
    }
}
