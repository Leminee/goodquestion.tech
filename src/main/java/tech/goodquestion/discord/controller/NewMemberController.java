package tech.goodquestion.discord.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.goodquestion.discord.service.NewMemberServiceImpl;


@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class NewMemberController {

    private final NewMemberServiceImpl newMemberService;

    public NewMemberController(NewMemberServiceImpl newMemberService) {
        this.newMemberService = newMemberService;
    }


    @GetMapping("/newuser/name")
    public String getLatestUserJoinedName() {

        return newMemberService.getLatestJoinedMemberName();

    }

    @GetMapping("/newuser/time")
    public String getLatestUserJoinedDate() {

        return newMemberService.getLatestJoinedMemberDateTime();

    }
}
