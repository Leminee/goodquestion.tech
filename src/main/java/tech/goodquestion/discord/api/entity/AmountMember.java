package tech.goodquestion.discord.api.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity()
@Table(name="number_member")
public class AmountMember {

    @GeneratedValue
    @Id
    @Column(name="id")
    private long amountMemberId;

    @Column(name="total_member", nullable = false)
    private int totalMember;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at",nullable = false)
    private Date updatedAt;


}
