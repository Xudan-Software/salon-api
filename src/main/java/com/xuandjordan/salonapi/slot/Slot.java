package com.xuandjordan.salonapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    Set<SalonServiceDetail> availableServices;

    @ManyToOne
    private SalonServiceDetail selectedService;

    String stylistName;

    LocalDateTime slotFor;

    private SlotStatus status;

    LocalDateTime lockedAt;
    LocalDateTime confirmedAt;

}




enum SlotStatus {
    AVAILABLE, LOCKED, CONFIRMED, CANCELLED
}
