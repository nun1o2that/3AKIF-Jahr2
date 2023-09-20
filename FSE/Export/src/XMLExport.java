import java.util.List;

public class XMLExport implements Export {
    public String export(List<String> data) {
        String result = "<data>";

        for (String d : data) {
            result += "<data>" + d + "</data";
        }
        result += "</data";
        return result;
    }
}
