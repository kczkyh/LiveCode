package com.qhit.codeTables.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.codeTables.pojo.CodeTables;
import java.util.List;

/** 
* Created by GeneratorCode on 2019/05/09
*/

@Mapper  
public interface ICodeTablesDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<CodeTables> search(CodeTables codeTables);

    List findByCname(Object cname);

    List findByCount(Object count);

    List findByEid(Object eid);

    List findByType(Object type);

    List findByLogo(Object logo);

    List findBySpare(Object spare);

    List findByCreattime(Object creattime);

    List findByStart(Object start);

}