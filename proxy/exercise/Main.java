package proxy.exercise;

public class Main {
  public static void main(String[] args) {
    var dbContext = new DbContext();

    // We read an object (eg a product) from a database.
    var product1 = dbContext.getProduct(1);
    var product2 = dbContext.getProduct(2);
    var product3 = dbContext.getProduct(3);

    System.out.println();
    // We modify the properties of the object in memory.
    dbContext.saveChanges();

    System.out.println();
    product1.setName("Updated Name");

    // DbContext should keep track of changed objects in memory.
    // When we call saveChanges(), it'll automatically generate
    // the right SQL statements to update our database.
    dbContext.saveChanges();

    // After saving the changes to the database, we can
    // change our in-memory object again and save the changes.
    System.out.println();
    product2.setName("PPP");
    dbContext.saveChanges();
  }
}
