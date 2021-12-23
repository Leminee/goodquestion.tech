package tech.goodquestion.discord.api.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity()
@Table(name="user_message_content")
public class AmountMessages {

    @Id
    @Column(name="id_message")
    private long messageId;

    @Column(name="id_discord", nullable = false)
    private long discordId;

    @Column(name="content", nullable = false)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "posted_at",nullable = false)
    private Date postedAt;

}
