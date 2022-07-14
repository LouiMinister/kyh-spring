package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Member {

    @Id
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    // LocalDate, LocalDateTime 을 쓰자 (@Temporal 말고)
    private LocalDate createDate2;

    @Lob
    private String description;

    public Member(){

    }
}