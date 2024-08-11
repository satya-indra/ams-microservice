package com.satyen.user_management.entity.apartment;

import com.satyen.user_management.entity.Society;
import com.satyen.user_management.entity.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "Apartments")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID apartmentId;

    @Column(nullable = false)
    private String apartmentNumber;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "societyId", nullable = false)
    private Society society;
}
