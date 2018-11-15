package fi.multisilta.liquibase.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "test_item")
public class TestItem {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "timestamp")
    private Instant timestamp;

    @Column(name = "value")
    private String value;

}
