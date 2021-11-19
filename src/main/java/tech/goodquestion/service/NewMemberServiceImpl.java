package tech.goodquestion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.goodquestion.repository.NewMemberRepository;

@Service
public class NewMemberServiceImpl implements INewMember{

    @Autowired
    private final NewMemberRepository newMemberRepository;

    public NewMemberServiceImpl(NewMemberRepository newMemberRepository) {
        this.newMemberRepository = newMemberRepository;
    }

    @Override
    public String getLatestJoinedMemberName() {
        return newMemberRepository.getLatestJoinedMemberName();
    }

    @Override
    public String getLatestJoinedMemberDate() {
        return newMemberRepository.getLatestJoinedMemberDate();
    }
}
