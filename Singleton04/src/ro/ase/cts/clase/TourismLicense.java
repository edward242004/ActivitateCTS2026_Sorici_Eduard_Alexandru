package ro.ase.cts.clase;

public class TourismLicense implements AbstractTourismLicense {

    private String licenseNumber;
    private String data;
    private boolean modificat;
    private TourismLicense() {
    }

    private static TourismLicense instanta = null;

    private TourismLicense(String licenseNumber, String data) {
        this.licenseNumber = licenseNumber;
        this.data = data;
    }

    public static synchronized TourismLicense getInstance(String licenseNumber, String data) {
        if (instanta == null) {
            instanta = new TourismLicense(licenseNumber, data);
        }

        return instanta;
    }

    @Override
    public void setLicenseNumber(String numar) throws Exception {
            if (modificat==true) {
                throw new Exception("Numar setat");
            } else {
                instanta.licenseNumber = numar;
                modificat = true;
            }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Licenta cu ");
        sb.append("license number ").append(licenseNumber);
        sb.append(", data ").append(data);
        sb.append(", modificat ").append(modificat);
        return sb.toString();
    }
}
