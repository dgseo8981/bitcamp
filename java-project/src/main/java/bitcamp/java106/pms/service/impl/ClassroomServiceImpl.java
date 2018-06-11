package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.ClassroomDao;
import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.service.ClassroomService;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    
    ClassroomDao classroomDao;
    
    public ClassroomServiceImpl(ClassroomDao classroomDao) {
        this.classroomDao = classroomDao;
    }
    
    @Override
    public List<Classroom> list(int pageNo, int pageSize) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("startRowNo", (pageNo - 1) * pageSize);
        params.put("pageSize", pageSize);
        
        return classroomDao.selectList(params);
    }
    
    @Override
    public Classroom get(int no) {
        return classroomDao.selectOne(no);
    }
    
    public int add(Classroom classroom) {
        return classroomDao.insert(classroom);
    }
    
    public int update(Classroom classroom) {
        return classroomDao.update(classroom);
    }
    
    public int delete(int no) {
        return classroomDao.delete(no);
    }
}
