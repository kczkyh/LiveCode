package com.qhit.codeErweima.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.codeErweima.pojo.CodeErweima;
import java.util.List;

/** 
* Created by GeneratorCode on 2019/05/09
*/

@Mapper  
public interface ICodeErweimaDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<CodeErweima> search(CodeErweima codeErweima);

    List findByCid(Object cid);

    List findByUrl(Object url);

    List findByCount(Object count);

    List findByLasttime(Object lasttime);

    List findBySort(Object sort);

    List findByStart(Object start);

}