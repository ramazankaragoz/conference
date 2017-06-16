package conference.dao.imp;

import conference.dao.core.BaseDAO;
import conference.dao.interfaces.IMeetingDao;
import conference.entities.imp.MeetingImp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Repository
public class MeetingDaoImp extends BaseDAO<Long,MeetingImp> implements IMeetingDao<MeetingImp>{
    @Override
    public MeetingImp getById(Long id) {
        return getByID(id);
    }

    @Override
    public Boolean createEntity(MeetingImp meetingImp) {
        return create(meetingImp);
    }

    @Override
    public Boolean deleteEntity(MeetingImp meetingImp) {
        return delete(meetingImp);
    }

    @Override
    public Boolean updateEntity(MeetingImp meetingImp) {
        return update(meetingImp);
    }

    @Override
    public List<MeetingImp> getList() {
        return list();
    }
}
