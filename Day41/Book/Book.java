package Day41.Book;

import java.time.LocalDate;

public class Book {
private String name;
private String author;
private LocalDate publishedDate;
private Double leatherBoundPrice;
private Double hardCoverPrice;
private Double audioBookPrice;

    public Book() {
    }

    public Book(String name, String author, LocalDate publishedDate, Double leatherBoundPrice,
                Double hardCoverPrice, Double audioBookPrice) {
        this.name = name;
        this.author = author;
        this.publishedDate = publishedDate;
        this.leatherBoundPrice = leatherBoundPrice;
        this.hardCoverPrice = hardCoverPrice;
        this.audioBookPrice = audioBookPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Double getLeatherBoundPrice() {
        return leatherBoundPrice;
    }

    public void setLeatherBoundPrice(Double leatherBoundPrice) {
        this.leatherBoundPrice = leatherBoundPrice;
    }

    public Double getHardCoverPrice() {
        return hardCoverPrice;
    }

    public void setHardCoverPrice(Double hardCoverPrice) {
        this.hardCoverPrice = hardCoverPrice;
    }

    public Double getAudioBookPrice() {
        return audioBookPrice;
    }

    public void setAudioBookPrice(Double audioBookPrice) {
        this.audioBookPrice = audioBookPrice;
    }

    public boolean hastThreePrices(){
       return getHardCoverPrice()!=null && getLeatherBoundPrice()!=null && getAudioBookPrice()!=null;
    }

    @Override
    public String toString() {
        return "Book-->" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishedDate=" + publishedDate +
                ", leatherBoundPrice=" + leatherBoundPrice +
                ", hardCoverPrice=" + hardCoverPrice +
                ", audioBookPrice=" + audioBookPrice;
    }
}
