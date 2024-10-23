public abstract class RptGen {
    public final void genRpt() {
        fmtHeader();
        fmtBody();
        fmtFooter();
    }

    protected abstract void fmtHeader();
    protected abstract void fmtBody();
    protected abstract void fmtFooter();
}
