package tech.goodquestion.discord.api.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="user_join")
public class NewMember {

    @GeneratedValue
    @Id
    @Column(name="id")
    private long joinId;

    @Column(name="id_discord", nullable = false)
    private long userId;

    @Column(name="user_tag", nullable = false)
    private String userTag;

    @Column(name="username", nullable = false)
    private String username;

    @Column(name="avatar_url", nullable = false)
    private String avatarUrl;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "joined_at",nullable = false)
    private Date joinedAt;
}
