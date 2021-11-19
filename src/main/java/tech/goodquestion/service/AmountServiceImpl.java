package tech.goodquestion.service;

import tech.goodquestion.entity.AmountMember;
import tech.goodquestion.repository.AmountMemberRepository;

import javax.persistence.Entity;
import java.util.List;

@org.springframework.stereotype.Service
public class AmountServiceImpl implements IAmountService{

    private final AmountMemberRepository amountMemberRepository;

    public AmountServiceImpl(AmountMemberRepository amountMemberRepository) {
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
