package tech.goodquestion.discord.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tech.goodquestion.discord.api.entity.AmountMessages;

public interface AmountMessagesRepository extends JpaRepository<AmountMessages,Long> {

    @Query(value = "SELECT COUNT(id_discord) FROM user_message_content;",
            nativeQuery = true)
    int getAmountMessages();

    @Query(value = "SELECT COUNT(id_discord) FROM user_message_content WHERE posted_at >= NOW() - INTERVAL 1 WEEK",
            nativeQuery = true)
    int getAmountMessagesSinceLastWeek();

    @Query(value = "SELECT COUNT(id_discord) FROM user_message_content WHERE posted_at >= NOW() - INTERVAL 1 MONTH",
            nativeQuery = true)
    int getAmountMessagesSinceLastMonth();
}
