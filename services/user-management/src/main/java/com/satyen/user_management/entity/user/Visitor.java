package com.satyen.user_management.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
@DiscriminatorValue("Visitor")
public class Visitor extends User {
    @Column(name = "visitpurpose")
    private String visitorType; // e.g., guest, vendor, domestic help
}
