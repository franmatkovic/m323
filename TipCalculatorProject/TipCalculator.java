package TipCalculatorProject;

import java.util.List;

public class TipCalculator {

    // Pure Function: berechnet Trinkgeld basierend auf Anzahl der Personen
    public static int calculateTipPercentage(List<String> names) {
        if (names == null || names.isEmpty()) {
            return 0;
        } else if (names.size() > 5) {
            return 20;
        } else {
            return 10;
        }
    }
}
