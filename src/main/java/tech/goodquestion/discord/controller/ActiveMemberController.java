package tech.goodquestion.discord.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.goodquestion.discord.service.ActiveMemberServiceImpl;

@RestController
@RequestMapping("/api/v1/active-user/")
public class ActiveMemberController {

    private final ActiveMemberServiceImpl activeMemberService;

    public ActiveMemberController(ActiveMemberServiceImpl activeUserService) {
        this.activeMemberService = activeUserService;
    }


    @GetMapping("now")
    public int getCurrentActiveUser() {

        return activeMemberService.getCurrentActiveMember();

    }

    @GetMapping(path ="record", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getRecordActiveUser() {

        return activeMemberService.getRecordActiveMember();

    }
}
