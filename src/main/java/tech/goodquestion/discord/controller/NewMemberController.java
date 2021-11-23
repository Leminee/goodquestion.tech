package tech.goodquestion.discord.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.goodquestion.discord.service.NewMemberServiceImpl;


@Slf4j
@RestController
@RequestMapping("/api/v1/new-user/")
public class NewMemberController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final NewMemberServiceImpl newMemberService;

    public NewMemberController(NewMemberServiceImpl newMemberService) {
        this.newMemberService = newMemberService;
    }


    @GetMapping("name")
    public String getLatestUserJoinedName() {

        return newMemberService.getLatestJoinedMemberName();

    }

    @GetMapping("time")
    public String getLatestUserJoinedDate() {

        return newMemberService.getLatestJoinedMemberDateTime();

    }
}
