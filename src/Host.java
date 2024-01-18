public class Host {

    String hosting(String x){
        return x;
    }

    int hosting(int x){
        return x;
    }

    double hosting(double x){
        return x;
    }
    public static void main(String[] args) {
        Host host = new Host();
        System.out.println(host.hosting(8));
        System.out.println(host.hosting(89.654));
        System.out.println(host.hosting("Hoster"));
    }
}
