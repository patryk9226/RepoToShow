package document;

public class DocumentChecker {
    public static void main(String[] args) {
        Document exelDokument = new ExelDocument();
        Document pdfDokument = new PdfDocument();

        exelDokument.getDescription();
        pdfDokument.getDescription();

    }
}
