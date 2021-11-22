package tech.goodquestion.discord.service;

import org.springframework.stereotype.Service;
import tech.goodquestion.discord.repository.ActiveMemberRepository;

@Service
public class ActiveMemberServiceImpl implements IActiveMemberService {

    private final ActiveMemberRepository activeMemberRepository;

    public ActiveMemberServiceImpl(ActiveMemberRepository activeMemberRepository) {
        this.activeMemberRepository = activeMemberRepository;
    }


    @Override
    public int getCurrentActiveMember() {
        return activeMemberRepository.getCurrentActiveMember();
    }

    @Override
    public int getRecordActiveMember(){
        return activeMemberRepository.getRecordActiveMember();
    }



}
