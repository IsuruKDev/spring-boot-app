package com.synergentl.kube;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"empId"})
@Builder
public class Employee {

    private long empId;
    private String empNumber;
    private LocalDate joinedDate;
    private String email;
    private boolean active;
}
