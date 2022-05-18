package zenner.community.zenner.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import zenner.community.zenner.model.User;

@Mapper
public interface UserMapper {
    @Insert("insert into MY_USER (USER_NAME,ACCOUNT_ID,TOKEN,GMT_CREATE,GMT_MODIFIED) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")

    public void insert(User user);
}
