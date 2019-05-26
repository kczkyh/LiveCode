package com.qhit.codeErweima.service.impl;

import com.qhit.codeErweima.service.ICodeErweimaService;
import java.util.List;
import com.qhit.codeErweima.dao.ICodeErweimaDao;
import com.qhit.codeErweima.pojo.CodeErweima;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2019/05/09
*/

@Service 
public class CodeErweimaServiceImpl  implements ICodeErweimaService {

    @Resource 
    ICodeErweimaDao dao;

    @Override 
    public boolean insert(Object object) { 
        return dao.insert(object); 
    } 

    @Override 
    public boolean update(Object object) { 
        return dao.update(object); 
    } 

    @Override 
    public boolean updateSelective(Object object) { 
        return dao.updateSelective(object); 
    } 

    @Override 
    public boolean delete(Object id) { 
        CodeErweima codeErweima = findById(id); 
        return dao.delete(codeErweima); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public CodeErweima findById(Object id) { 
        List<CodeErweima> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<CodeErweima> search(CodeErweima codeErweima) { 
        return dao.search(codeErweima); 
    } 

}