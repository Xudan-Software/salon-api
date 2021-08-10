package com.xuandjordan.salonapi.slot;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xuandjordan.salonapi.salonservice.SalonServiceDetail;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

enum SlotStatus {
    AVAILABLE, LOCKED, CONFIRMED, CANCELLED
}




@Entity
@Data
@NoArgsConstructor
@ToString
public class Slot {

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    Set<SalonServiceDetail> availableServices;
    String stylistName;
    LocalDateTime slotFor;
    LocalDateTime lockedAt;
    LocalDateTime confirmedAt;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private SalonServiceDetail selectedService;
    private SlotStatus status;

}
