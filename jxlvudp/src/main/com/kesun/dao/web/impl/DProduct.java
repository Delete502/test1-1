package kesun.dao.web.impl;

import kesun.dao.DaoSupport;
import kesun.dao.web.INotice;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dProduct")
public class DProduct extends DaoSupport implements INotice {
    public DProduct() {
        setMapperName("mapper.ProductMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
