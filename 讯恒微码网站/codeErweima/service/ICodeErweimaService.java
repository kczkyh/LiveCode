package com.qhit.codeErweima.service;

import java.util.List;
import com.qhit.codeErweima.pojo.CodeErweima;
/**
* Created by GeneratorCode on 2019/05/09
*/
public interface ICodeErweimaService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    CodeErweima findById(Object id);

    List<CodeErweima> search(CodeErweima codeErweima);

}