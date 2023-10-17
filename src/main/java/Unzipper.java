import org.nd4j.util.ArchiveUtils;
import java.io.File;

public class Unzipper {
    public static void main(String[] args) throws Exception {

        Butler butler = new Butler();
        butler.welcome();
        // https://app.snyk.io/vuln/SNYK-JAVA-ORGND4J-72550
        // should appear as Reachable
        Butler b = new Butler();
        b.welcome();
    }
}
