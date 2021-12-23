package tech.goodquestion.discord.api.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="user_online")
public class ActiveMember {

    @GeneratedValue
    @Id
    @Column(name="id")
    private long amountActiveMemberId;

    @Column(name="amount", nullable = false)
    private int amountActiveMember;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at",nullable = false)
    private Date time;


}
