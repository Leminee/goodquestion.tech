package tech.goodquestion.discord.api.service;

public interface IAmountMessagesService {

    int getAmountMessages();
    int getAmountMessagesSinceLastWeek();
    int getAmountMessagesSinceLastMonth();
}
