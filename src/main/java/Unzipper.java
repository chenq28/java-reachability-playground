
public class Unzipper {
    public static void main(String[] args) throws Exception {

        ButlerBase butler = new Butler();
        ButlerBase butler2 = butler;
        butler2.welcome();
        // https://app.snyk.io/vuln/SNYK-JAVA-ORGND4J-72550
        // should appear as Reachable
    }
}
