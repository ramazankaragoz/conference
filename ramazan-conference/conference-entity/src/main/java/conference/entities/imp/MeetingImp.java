package conference.entities.imp;

import conference.entities.core.BaseEntity;
import conference.entities.interfaces.IMeeting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Entity
@Table(name = "MEETING")
public class MeetingImp extends BaseEntity implements IMeeting {

    @Column(name = "NAME")
    String name;
    @Column(name = "DESCRIPTION")
    String description;

    public MeetingImp() {
    }

    public MeetingImp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
