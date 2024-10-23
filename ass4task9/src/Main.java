public class Main {
    public static void main(String[] args) {
        RptSys rptSys = new RptSys();

        RptGen pdfRpt = new PDFRptGen();
        rptSys.genRpt(pdfRpt);

        System.out.println();

        RptGen htmlRpt = new HTMLRptGen();
        rptSys.genRpt(htmlRpt);
    }
}
