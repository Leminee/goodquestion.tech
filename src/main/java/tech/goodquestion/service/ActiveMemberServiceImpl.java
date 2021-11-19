package tech.goodquestion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.goodquestion.repository.ActiveMemberRepository;

@Service
public class ActiveMemberServiceImpl implements IActiveMemberService {

    @Autowired
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
