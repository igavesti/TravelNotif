package id.co.travel.travelnotif.repository.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "notif_history")
@Data
public class NotifHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @CreationTimestamp
    @Column(name = "created_date")
    private LocalDateTime createdData;
    @Column(name = "email")
    private String email;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "body")
    private String body;
}
