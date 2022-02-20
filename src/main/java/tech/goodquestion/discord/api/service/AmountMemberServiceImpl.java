package tech.goodquestion.discord.api.service;

import tech.goodquestion.discord.api.repository.AmountMemberRepository;

@org.springframework.stereotype.Service
public class AmountMemberServiceImpl implements IAmountMemberService {

    private final AmountMemberRepository amountMemberRepository;

    public AmountMemberServiceImpl(AmountMemberRepository amountMemberRepository) {
        this.amountMemberRepository = amountMemberRepository;
    }

    @Override
    public int getMaxAmountMember() {

        return amountMemberRepository.getAmountMember();

    }

}
