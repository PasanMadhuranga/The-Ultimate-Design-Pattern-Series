package flyweight.exercise;

public class Main {
  public static void main(String[] args) {
    var sheet = new SpreadSheet(new CellContextFactory());
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setContent(0, 0, "Pasan");
    sheet.setContent(0, 2, "Dimalsha");
    sheet.setContent(1, 1, "Sajitha");
    sheet.setFontFamily(0, 0, "Arial");
    sheet.setFontFamily(0, 2, "Calibri");
    sheet.render();
  }
}
