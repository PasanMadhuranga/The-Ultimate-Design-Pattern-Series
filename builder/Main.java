package builder;

public class Main {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        presentation.addSlide(new Slide("Slide 3"));

        PDFDocumentBuilder pdfBuilder = new PDFDocumentBuilder();
        presentation.export(pdfBuilder);
        PdfDocument finalPdf = pdfBuilder.getPdfDocument();
        System.out.println(finalPdf);

        System.out.println();

        MovieBuilder movie_builder = new MovieBuilder();
        presentation.export(movie_builder);
        Movie finalMovie = movie_builder.getMovie();
        System.out.println(finalMovie);
    }
}
