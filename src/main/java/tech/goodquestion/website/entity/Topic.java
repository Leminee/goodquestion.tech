package tech.goodquestion.website.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="topic")
public class Topic {

    @Id
    @GeneratedValue
    @Column(name="id_topic", nullable = false)
    private long topicId;

    @Column(name="content",nullable = false)
    private String topicContent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user", nullable = false, referencedColumnName = "id_user")
    private User user;

    @Column(name="vote", nullable = false)
    private int vote = 0;


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "posted_at", nullable = false)
    private Date postedAt;


}
