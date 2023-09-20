import java.util.List;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        List<String> tage = Arrays.asList(
            "MO",
            "DI",
            "MI",
            "DO",
            "FR",
            "SA",
            "SO"
        );

        Export exporterXML = new XMLExport();
        String result = exporterXML.export(tage);
        System.out.println(result);

        Export exporterCSV = new CSVExport();
        result = exporterCSV.export(tage);
        System.out.println(result);
    }

}
