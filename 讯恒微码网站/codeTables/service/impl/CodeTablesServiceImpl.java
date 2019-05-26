package com.qhit.codeTables.service.impl;

import com.qhit.codeTables.service.ICodeTablesService;
import java.util.List;
import com.qhit.codeTables.dao.ICodeTablesDao;
import com.qhit.codeTables.pojo.CodeTables;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2019/05/09
*/

@Service 
public class CodeTablesServiceImpl  implements ICodeTablesService {

    @Resource 
    ICodeTablesDao dao;

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
        CodeTables codeTables = findById(id); 
        return dao.delete(codeTables); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public CodeTables findById(Object id) { 
        List<CodeTables> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<CodeTables> search(CodeTables codeTables) { 
        return dao.search(codeTables); 
    } 

}