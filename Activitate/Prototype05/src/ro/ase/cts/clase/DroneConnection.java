package ro.ase.cts.clase;

public class DroneConnection implements IDroneConnection {

    private String ip;

    private DroneConnection() {
    }

    public DroneConnection(String ip) {
        this.ip = ip;
    }

    private static DroneConnection instanta = null;

    public static synchronized DroneConnection getInstance() {
        if (instanta == null) {
            instanta = new DroneConnection();
        }
        return instanta;
    }

    @Override
    public void setIp(String ip) {
        this.ip=ip;
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("ip").append(ip);
        System.out.println(sb.toString());
    }
}
