package tech.goodquestion.website.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;
import tech.goodquestion.website.elasticsearch.Indices;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Document(indexName = Indices.TOPIC_INDEX)
@Setting(settingPath = "static/settings.json")
@Table(name="topic")
public class Topic {

    @Id
    @GeneratedValue
    @Field(type = FieldType.Keyword)
    @Column(name="id_topic", nullable = false)
    private long topicId;


    @Field(type = FieldType.Text)
    @Column(name="description", nullable = false)
    private String topicDescription;

    @Column(name="content",nullable = false)
    @Field(type = FieldType.Text)
    private String topicContent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user", nullable = false, referencedColumnName = "id_user")
    private User user;

    @Column(name="vote", nullable = false)
    private int vote = 0;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "posted_at", nullable = false)
    @Field(type = FieldType.Date)
    private Date postedAt;

}
