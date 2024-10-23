public class PDFRptGen extends RptGen {
    @Override
    protected void fmtHeader() {
        System.out.println("Generating PDF Header");
    }

    @Override
    protected void fmtBody() {
        System.out.println("Generating PDF Body");
    }

    @Override
    protected void fmtFooter() {
        System.out.println("Generating PDF Footer");
    }
}
