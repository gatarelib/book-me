package beans;

/**
 * Created by ahmedyakout on 5/4/18.
 */
public class Book {
    private int ISBN;
    private String title;
    private String publisherName;
    private String publisherDate;
    private float price;
    private BookCategory category;
    private int threshold;

    // GETTERS
    public int getISBN() {
        return ISBN;
    }

    public BookCategory getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getPublisherDate() {
        return publisherDate;
    }

    public String getTitle() {
        return title;
    }

    public int getThreshold() {
        return threshold;
    }

    // SETTERS
    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPublisherDate(String publisherDate) {
        this.publisherDate = publisherDate;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}