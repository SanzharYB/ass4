import java.util.ArrayList;
import java.util.List;

public class VC {
    private final List<Version> versions = new ArrayList<>();

    public void save(Doc doc) {
        versions.add(doc.save());
    }

    public void list() {
        System.out.println("Document Versions:");
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }

    public void restore(Doc doc, int index) {
        if (index >= 1 && index <= versions.size()) {
            doc.restore(versions.get(index - 1));
            System.out.println("Restored to version " + index + ": " + doc.getContent());
        } else {
            System.out.println("Invalid version index.");
        }
    }
}
