import java.util.List;

public class CSVExport implements Export {
    public String export(List<String> data) {
        String result = "Tage\n";
        for (String d : data) {
            result += d + "\n";
        }
        return result;
    }
}
