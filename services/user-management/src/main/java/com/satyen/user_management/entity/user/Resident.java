package com.satyen.user_management.entity.user;

import com.satyen.user_management.entity.apartment.Apartment;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
@DiscriminatorValue("Resident")
public class Resident extends User {
    @Column(name = "isowner")
    private Boolean isOwner;
//
//    @OneToMany(mappedBy = "user")
//    private List<Apartment> apartments;

}
