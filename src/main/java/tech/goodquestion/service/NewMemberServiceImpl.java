package tech.goodquestion.service;

import org.springframework.stereotype.Service;
import tech.goodquestion.repository.NewMemberRepository;

@Service
public class NewMemberServiceImpl implements INewMember{

    private final NewMemberRepository newMemberRepository;

    public NewMemberServiceImpl(NewMemberRepository newMemberRepository) {
        this.newMemberRepository = newMemberRepository;
    }

    @Override
    public String getLatestJoinedMemberName() {
        return newMemberRepository.getLatestJoinedMemberName();
    }

    @Override
    public String getLatestJoinedMemberDateTime() {
        return newMemberRepository.getLatestJoinedMemberDateTime();
    }
}
