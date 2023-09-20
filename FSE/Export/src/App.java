import java.util.List;
import java.util.Arrays;
public class App {
    
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

        Export exporter = new XMLExport();
        String result = exporter.export(tage);
        System.out.println(result);
    }

}
