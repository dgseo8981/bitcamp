package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
    
    MemberDao memberDao;
    
    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    
    @Override
    public List<Member> list(int pageNo, int pageSize) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("startRowNo", (pageNo - 1) * pageSize);
        params.put("pageSize", pageSize);
        
        return memberDao.selectList(params);
    }
    
    @Override
    public Member get(String id) {
        return memberDao.selectOne(id);
    }
    
    @Override
    public boolean isExist(String id, String password) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("id", id);
        params.put("password", password);
        
        return memberDao.count(params) > 0 ? true : false;
    }
    
    public int add(Member member) {
        return memberDao.insert(member);
    }
    
    public int update(Member member) {
        return memberDao.update(member);
    }
    
    public int delete(String id) {
        return memberDao.delete(id);
    }
}
