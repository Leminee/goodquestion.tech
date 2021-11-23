package tech.goodquestion.discord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.goodquestion.discord.entity.AmountMember;
import tech.goodquestion.discord.service.AmountMemberServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/v1/server-member/")
public class AmountMemberController {

    private final AmountMemberServiceImpl amountMemberService;


    public AmountMemberController(AmountMemberServiceImpl amountMemberService) {
        this.amountMemberService = amountMemberService;
    }

    @GetMapping("log")
    public List<AmountMember> getAmountUserLog() {

        return amountMemberService.getAmountMemberLogs();
    }

    @GetMapping("amount")
    public int getMaxAmountUser() {

        return amountMemberService.getMaxAmountMember();

    }
}
