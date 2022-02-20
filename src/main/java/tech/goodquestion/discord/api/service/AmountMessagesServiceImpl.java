package tech.goodquestion.discord.api.service;

import org.springframework.stereotype.Service;
import tech.goodquestion.discord.api.repository.AmountMessagesRepository;

@Service
public class AmountMessagesServiceImpl implements IAmountMessagesService {

    private final AmountMessagesRepository amountMessagesRepository;

    public AmountMessagesServiceImpl(AmountMessagesRepository amountMessagesRepository) {
        this.amountMessagesRepository = amountMessagesRepository;
    }

    @Override
    public int getAmountMessages() {
        return amountMessagesRepository.getAmountMessages();
    }

    @Override
    public int getAmountMessagesSinceLastWeek() {
        return amountMessagesRepository.getAmountMessagesSinceLastWeek();
    }

    @Override
    public int getAmountMessagesSinceLastMonth() {
        return amountMessagesRepository.getAmountMessagesSinceLastMonth();
    }
}
