package conference.imp;

import conference.dao.interfaces.IMeetingDao;
import conference.entities.imp.MeetingImp;
import conference.interfaces.IMeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Service
@Transactional
public class MeetingServiceImp implements IMeetingService<MeetingImp> {

    @Autowired
    private IMeetingDao meetingDao;

    @Override
    public MeetingImp getById(Long id) {
        return (MeetingImp) meetingDao.getById(id);
    }

    @Override
    public Boolean create(MeetingImp meetingImp) {
        return meetingDao.createEntity(meetingImp);
    }

    @Override
    public Boolean delete(MeetingImp meetingImp) {
        return meetingDao.deleteEntity(meetingImp);
    }

    @Override
    public Boolean update(MeetingImp meetingImp) {
        return meetingDao.updateEntity(meetingImp);
    }

    @Override
    public List<MeetingImp> getList() {
        return meetingDao.getList();
    }
}
