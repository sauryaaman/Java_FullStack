package entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Show show;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Customer customer;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private BigDecimal totalAmount;

    private LocalDateTime bookedAt;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @ElementCollection
    @CollectionTable(
            name = "booking_seats",
            joinColumns = @JoinColumn(name ="booking_id")
    )
    @Column(name = "seat_label")
    public List<String> seatlabels= new ArrayList<>();


    public Booking()
    {

    }

    public Booking(Show show, String customerName, String customerEmail, String customerPhone, BigDecimal totalAmount, List<String> seatlabels) {
        this.show = show;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.totalAmount = totalAmount;
        this.bookedAt =LocalDateTime.now();
        this.seatlabels = new ArrayList<>(seatlabels);
        this.status =BookingStatus.CONFIRMED;
    }

    public Booking(Show show, Customer customer ,BigDecimal totalAmount,List<String> seatlabels)
    {
        this(show,customer.getName(),customer.getEmail(), customer.getPhone(), totalAmount,seatlabels);
        this.customer=customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(LocalDateTime bookedAt) {
        this.bookedAt = bookedAt;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public List<String> getSeatlabels() {
        return seatlabels;
    }

    public void setSeatlabels(List<String> seatlabels) {
        this.seatlabels = seatlabels;
    }
}
