package tech.goodquestion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.goodquestion.repository.ActiveMemberRepository;

@Service
public class ActiveUserServiceImpl implements IActiveUser{

    @Autowired
    private final ActiveMemberRepository activeMemberRepository;

    public ActiveUserServiceImpl(ActiveMemberRepository activeMemberRepository) {
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
