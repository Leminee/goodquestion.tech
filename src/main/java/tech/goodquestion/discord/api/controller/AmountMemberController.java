package tech.goodquestion.discord.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.goodquestion.discord.api.service.AmountMemberServiceImpl;

@RestController
@RequestMapping("/api/v1/server-member/")
@CrossOrigin("*")
public class AmountMemberController {

    private final AmountMemberServiceImpl amountMemberService;

    public AmountMemberController(AmountMemberServiceImpl amountMemberService) {
        this.amountMemberService = amountMemberService;
    }


    @GetMapping("amount")
    public int getMaxMember() {

        return amountMemberService.getMaxAmountMember();

    }
}
