package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractTourismLicense;
import ro.ase.cts.clase.TourismLicense;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractTourismLicense licenta1 = TourismLicense.getInstance("012345","31.03.2026");
        AbstractTourismLicense licenta2 = TourismLicense.getInstance("016445","31.04.2026");

        System.out.println(licenta1);
        licenta1.setLicenseNumber("22222");
        System.out.println(licenta1);
        licenta1.setLicenseNumber("23232");
        System.out.println(licenta1);
        System.out.println(licenta2);

    }
}
