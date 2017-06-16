package conference.controller;

import conference.entities.imp.MeetingImp;
import conference.entities.interfaces.IMeeting;
import conference.interfaces.IMeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@RestController
@RequestMapping(value = "meeting")
public class MeetingController {
    @Autowired
    private IMeetingService meetingService;

    @RequestMapping(value = "findById",method = RequestMethod.GET)
    public @ResponseBody
    IMeeting findById(@RequestBody @RequestParam("id") Long id)
    {
        return (IMeeting) meetingService.getById(id);
    }

    @RequestMapping(value = "create",method = RequestMethod.POST)
    public @ResponseBody boolean create(@RequestBody MeetingImp meeting)
    {
        return meetingService.create(meeting);
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public @ResponseBody boolean update(@RequestBody MeetingImp meeting)
    {
        return meetingService.update(meeting);
    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public @ResponseBody boolean delete(@RequestBody @RequestParam("id")Long id)
    {
        return meetingService.delete(id);
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public @ResponseBody
    List<IMeeting> getList()
    {
        return meetingService.getList();
    }
}
