package com.github.lomasz.spring.boot.template.adapter.out.persistence;

import com.github.lomasz.spring.boot.template.application.domain.model.NewTemplate;
import com.github.lomasz.spring.boot.template.application.domain.model.Template;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
@Table(name = "template")
public class TemplateEntity {

    private static final String SEQUENCE_NAME = "template_seq";

    @Id
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 5, nullable = false)
    private String acronym;

    @Column(nullable = false)
    private BigDecimal budget;

    public static TemplateEntity fromDomain(NewTemplate newTemplate) {
        return TemplateEntity.builder()
                .name(newTemplate.name())
                .budget(newTemplate.budget())
                .acronym(newTemplate.acronym())
                .build();
    }

    public Template toDomain() {
        return Template.builder()
                .id(this.id)
                .name(this.name)
                .acronym(this.acronym)
                .budget(this.budget)
                .build();
    }
}
