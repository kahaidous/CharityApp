package ma.emsi.charityapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "Utilisateur")
public class Users {
    public Users() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCin() {
        return cin;
    }

    public Date getDate() {
        return date;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Users(Long id, String firstName, String lastName, String cin, Date date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Nom_famille")
    private String firstName;
    private String lastName;
    @Column(unique = true, length = 8,
            updatable = false,nullable = false)
    private String cin;
    @Temporal(TemporalType.DATE)
    private Date date;
    private Date createdAt;
    //private Date updatedAt;

    private String address;

}
