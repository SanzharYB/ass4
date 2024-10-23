public class Main {
    public static void main(String[] args) {
        Doc doc = new Doc();
        VC vc = new VC();

        doc.edit("Version 1: Initial content.");
        vc.save(doc);

        doc.edit("Version 2: Added some text.");
        vc.save(doc);

        doc.edit("Version 3: More updates here.");
        vc.save(doc);

        vc.list();

        vc.restore(doc, 2);
        System.out.println("Current content: " + doc.getContent());
    }
}
