package com.zf.dao;

import com.zf.domian.HdArticle;
import com.zf.domian.HdUsers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * AreaRepository
 *
 * @author zf
 * @date 16/3/19
 */
public interface UsersRepository extends PagingAndSortingRepository<HdUsers, Integer> {


    HdUsers findByMobilePhoneAndPassword(String mobile_phone,String password);

    HdUsers findByUserNameAndPassword(String mobile_phone, String password);

//    HdUsers registerUser(String mobile_phone, String password);

    HdUsers findByWeixinId(String weixin_id);

    HdUsers findByUserName(String username);

    HdUsers findByUserId(Integer useid);

//    @Modifying
//    @Transactional
//    @Query("delete from User u where u.active = false")
//    void deleteInactiveUsers();
}
