package tech.goodquestion.service;

import tech.goodquestion.entity.AmountMember;

import java.util.List;

public interface IAmountService {

    int getMaxAmountMember();
    List<AmountMember> getAmountMemberLogs();
}
