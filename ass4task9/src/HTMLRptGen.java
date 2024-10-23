public class HTMLRptGen extends RptGen {
    @Override
    protected void fmtHeader() {
        System.out.println("Generating HTML Header");
    }

    @Override
    protected void fmtBody() {
        System.out.println("Generating HTML Body");
    }

    @Override
    protected void fmtFooter() {
        System.out.println("Generating HTML Footer");
    }
}
