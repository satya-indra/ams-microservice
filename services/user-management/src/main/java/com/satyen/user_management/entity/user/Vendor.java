package com.satyen.user_management.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@DiscriminatorValue("Vendor")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Vendor extends User {
    @Column(name = "vendordetails")
    private String vendorType; // e.g., plumber, electrician, carpenter
//    private long vendorId;
}
