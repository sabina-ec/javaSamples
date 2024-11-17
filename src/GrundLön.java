public class GrundLön {
    private double grundlon = 8000;// Grundlön
    private double provision = 0.09;// (9% = 9 / 100 = 0,09)Provision på försäljningen

    // Metod som beräknar total lön baserat på försäljningen
    public double beraknaLon(double forsumn) {
        double prestationslon = forsumn * provision;// 9% av försäljningssumman
        return grundlon + prestationslon;// Total lön

    }
}
