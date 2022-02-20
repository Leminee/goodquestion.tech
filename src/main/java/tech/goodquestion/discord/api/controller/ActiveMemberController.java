package tech.goodquestion.discord.api.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.goodquestion.discord.api.service.ActiveMemberServiceImpl;

@RestController
@RequestMapping("/api/v1/active-user/")
@CrossOrigin("*")
public class ActiveMemberController {

    private final ActiveMemberServiceImpl activeMemberService;

    public ActiveMemberController(ActiveMemberServiceImpl activeUserService) {
        this.activeMemberService = activeUserService;
    }

    @GetMapping("now")
    public int getCurrentActiveMember() {

        return activeMemberService.getCurrentActiveMember();

    }

    @GetMapping(path ="record", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getRecordActiveMember() {

        return activeMemberService.getRecordActiveMember();

    }
}
