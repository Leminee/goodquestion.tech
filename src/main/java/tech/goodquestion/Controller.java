package tech.goodquestion;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.goodquestion.entity.AmountMember;
import tech.goodquestion.service.ActiveMemberServiceImpl;
import tech.goodquestion.service.AmountServiceImpl;
import tech.goodquestion.service.NewMemberServiceImpl;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class Controller {

    @Autowired
    private final AmountServiceImpl amountService;

    @Autowired
    private final NewMemberServiceImpl newMemberService;

    @Autowired
    private final ActiveMemberServiceImpl activeUserService;

    public Controller(AmountServiceImpl amountServiceImpl, NewMemberServiceImpl newMemberService, ActiveMemberServiceImpl activeUserServiceImp) {
        this.amountService = amountServiceImpl;
        this.newMemberService = newMemberService;
        this.activeUserService = activeUserServiceImp;
    }


    @GetMapping("/amountmember/log")
        public List<AmountMember> getAmountUserLog() {

        return amountService.getAmountMemberLogs();
    }

    @GetMapping("/amountmember/max")
    public int getMaxAmountUser() {

        return amountService.getMaxAmountMember();

    }

    @GetMapping("/activeuser/now")
    public int getCurrentActiveUser() {

        return activeUserService.getCurrentActiveMember();

    }

    @GetMapping(path ="/activeuser/record", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getRecordActiveUser() {

        return activeUserService.getRecordActiveMember();

    }

    @GetMapping("/newuser")
    public String getLatestUserJoinedName() {

        return newMemberService.getLatestJoinedMemberName();

    }

    @GetMapping("/newuser/time")
    public String getLatestUserJoinedDate() {

        return newMemberService.getLatestJoinedMemberDateTime();

    }
}
