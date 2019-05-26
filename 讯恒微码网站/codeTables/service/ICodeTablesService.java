package com.qhit.codeTables.service;

import java.util.List;
import com.qhit.codeTables.pojo.CodeTables;
/**
* Created by GeneratorCode on 2019/05/09
*/
public interface ICodeTablesService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    CodeTables findById(Object id);

    List<CodeTables> search(CodeTables codeTables);

}