package com.groupd.bms.repository;

import org.apache.ibatis.annotations.Mapper;

import com.groupd.bms.model.MemberLogin;
import com.groupd.bms.model.Member;
import java.util.Map;
import java.util.HashMap; 

@Mapper
public interface UserRepository {
    
    /**
     * 사용자 로그인 조회
     * @param username
     * @return
     */
    void memLoginProc(MemberLogin memberLogin);

    /**
     * 로그인 정보 가져온다.
     * @return
     */
    HashMap<String, Object> memUserInfo(Map<String, Object> params);

    /*
     * 사용자 정보를 조회한다.
     * @param userID
     */
    HashMap<String, Object> insertRegister(String userid, String password, String name, String firstName, String lastName, String email);
    
}
