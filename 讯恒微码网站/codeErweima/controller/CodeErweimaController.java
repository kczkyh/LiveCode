package com.qhit.codeErweima.controller; 

import com.qhit.codeErweima.pojo.CodeErweima; 
import com.qhit.codeErweima.service.ICodeErweimaService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2019/05/09
*/ 

@RestController 
@RequestMapping("/codeErweima") 
public class CodeErweimaController { 

    @Resource 
    ICodeErweimaService codeErweimaService; 

    @RequestMapping("/insert") 
    public void insert(CodeErweima codeErweima) { 
        codeErweimaService.insert(codeErweima); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer eid) { 
        codeErweimaService.delete(eid); 
    } 

    @RequestMapping("/update") 
    public void update(CodeErweima codeErweima) { 
        codeErweimaService.update(codeErweima); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(CodeErweima codeErweima) { 
        codeErweimaService.updateSelective(codeErweima); 
    } 

    @RequestMapping("/load") 
    public CodeErweima load(Integer eid) { 
        CodeErweima codeErweima = codeErweimaService.findById(eid); 
        return codeErweima; 
    } 

    @RequestMapping("/list") 
    public List<CodeErweima> list()  { 
        List<CodeErweima> list = codeErweimaService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<CodeErweima> search(CodeErweima codeErweima) { 
        List<CodeErweima> list = codeErweimaService.search(codeErweima); 
        return list; 
    } 

} 
