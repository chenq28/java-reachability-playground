import org.apache.commons.collections.ListUtils;
import java.util.ArrayList;
import org.nd4j.util.ArchiveUtils;
import java.io.File;


public class Butler extends ButlerBase{

    public void welcome() {

        // https://app.snyk.io/vuln/SNYK-JAVA-COMMONSCOLLECTIONS-472711
        // Should appear as Potentially Reachable
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("World");

        System.out.println(ListUtils.union(list1, list2));
                ArchiveUtils.unzipFileTo("./malicious_file.zip", "./unzipped/");
        File f = new File("/tmp/evil.txt");
        if (f.exists()) {
            throw new Exception("Malicious file /tmp/evil.txt was created");
        };
    }
}
