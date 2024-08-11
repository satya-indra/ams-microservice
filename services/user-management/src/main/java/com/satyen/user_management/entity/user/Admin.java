package com.satyen.user_management.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("Admin")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Admin extends User {
    @Column(name = "adminrole")
    private String adminRole;
}
