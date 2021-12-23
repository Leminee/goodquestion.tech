package tech.goodquestion.discord.api.service;

import tech.goodquestion.discord.api.entity.AmountMember;

import java.util.List;

public interface IAmountMemberService {

    int getMaxAmountMember();
    List<AmountMember> getAmountMemberLogs();
}
