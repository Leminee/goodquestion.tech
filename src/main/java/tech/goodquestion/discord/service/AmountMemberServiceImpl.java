package tech.goodquestion.discord.service;

import tech.goodquestion.discord.entity.AmountMember;
import tech.goodquestion.discord.repository.AmountMemberRepository;

import java.util.List;

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

    @Override
    public List<AmountMember> getAmountMemberLogs(){

        return amountMemberRepository.findAll();
    }
}
