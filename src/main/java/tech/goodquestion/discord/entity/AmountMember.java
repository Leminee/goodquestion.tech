package tech.goodquestion.discord.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity()
@Table(name="number_member")
public class AmountMember {

    @GeneratedValue
    @Id
    @Column(name="id_number_member")
    private long amountMemberId;

    @Column(name="total_member", nullable = false)
    private int totalMember;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "time",nullable = false)
    private Date time;


}
