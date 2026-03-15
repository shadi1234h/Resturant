public class Food {
    String name;
    String category;
    String incredients;
    double price;
    String notes;

    public Food(String category, String incredients, String name, double price,String notes) {
        this.category = category;
        this.incredients = incredients;
        this.name = name;
        this.notes = notes;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
