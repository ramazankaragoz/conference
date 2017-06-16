package conference.entities.core;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */

@MappedSuperclass
public class BaseEntity {

    @Id
    @Column
    @GeneratedValue
    private Long id;
    @Column(name = "UPDATE_DATE")
    private Date updateDate;
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Column(name = "DELETED")
    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
