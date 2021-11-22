package tech.goodquestion.discord.service;

import tech.goodquestion.discord.entity.AmountMember;

import java.util.List;

public interface IAmountMemberService {

    int getMaxAmountMember();
    List<AmountMember> getAmountMemberLogs();
}
