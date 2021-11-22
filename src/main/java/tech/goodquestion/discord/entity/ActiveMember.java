package tech.goodquestion.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="active_user")
public class ActiveMember {

    @GeneratedValue
    @Id
    @Column(name="id_active_user")
    private long amountActiveMemberId;

    @Column(name="active_member", nullable = false)
    private int amountActiveMember;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "time",nullable = false)
    private Date time;


}
