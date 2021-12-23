package tech.goodquestion.discord.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.goodquestion.discord.api.service.AmountMessagesServiceImpl;

@RestController
@RequestMapping("/api/v1/amount-messages/")
public class AmountMessagesController {

  private final AmountMessagesServiceImpl amountMessagesService;

    public AmountMessagesController(AmountMessagesServiceImpl amountMessagesService) {
        this.amountMessagesService = amountMessagesService;
    }

    @GetMapping()
    public int getAmountMessages(){
        return amountMessagesService.getAmountMessages();
    }
}
