import java.util.ArrayList;
import java.util.List;

public class Doc {
    private String content;

    public void edit(String newContent) {
        this.content = newContent;
    }

    public String getContent() {
        return content;
    }

    public Version save() {
        return new Version(content);
    }

    public void restore(Version version) {
        this.content = version.getContent();
    }
}
