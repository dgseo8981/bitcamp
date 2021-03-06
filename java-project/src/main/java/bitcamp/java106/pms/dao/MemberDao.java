package bitcamp.java106.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Member;

public interface MemberDao {
    int delete(String id);
    List<Member> selectList(Map<String,Object> map);
    int insert(Member member);
    int update(Member member);
    Member selectOne(String id);
    Member selectOneWithPassword(Map<String,Object> params);
    int count(Map<String, Object> params);
}
