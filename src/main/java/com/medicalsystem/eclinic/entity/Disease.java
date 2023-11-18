package com.medicalsystem.eclinic.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.medicalsystem.eclinic.enums.Symptoms;
import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "disease")
public class Disease {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ElementCollection(targetClass = Symptoms.class)
    @JoinTable(name = "symptoms", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "symptoms", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<Symptoms> symptoms = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    private List<Doctor> doctors;
}
