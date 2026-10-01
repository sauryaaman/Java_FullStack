package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Theatre theatre;

    private LocalDateTime startsAt;

    private LocalDateTime endsAt;

    private BigDecimal ticketprice;

    private int totalSeats;


    private int availableSeats;

    private boolean active=true;


    @Version  //locking
    private long version;

    public Show(Movie movie, Theatre theatre, LocalDateTime startsAt, LocalDateTime endsAt, BigDecimal ticketprice,int totalSeats) {
        this.movie = movie;
        this.theatre = theatre;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.ticketprice=ticketprice;
        this.totalSeats = totalSeats;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public LocalDateTime getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(LocalDateTime startsAt) {
        this.startsAt = startsAt;
    }

    public LocalDateTime getEndsAt() {
        return endsAt;
    }

    public BigDecimal getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(BigDecimal ticketprice) {
        this.ticketprice = ticketprice;
    }

    public void setEndsAt(LocalDateTime endsAt) {
        this.endsAt = endsAt;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public void reserve(int seats)
    {
        if (seats <= 0 || seats > availableSeats ) {

            throw  new IllegalArgumentException("Not Enough seat available");
        }

        availableSeats-=seats;
    }

    public void release(int seats)
    {
//        availableSeats=Math.min(totalSeats,availableSeats+seats);

        availableSeats+=seats;

    }

}
