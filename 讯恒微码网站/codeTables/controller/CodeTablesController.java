package com.qhit.codeTables.controller; 

import com.qhit.Utils.InetAddress.InetAddr;
import com.qhit.Utils.PathUtils.PathCommon;
import com.qhit.Utils.Encryption.UUID16;
import com.qhit.Utils.QrCode.QRCodeUtil;
import com.qhit.codeTables.pojo.CodeTables;
import com.qhit.codeTables.service.ICodeTablesService;
import com.qhit.lmUplod.lmUplod.pojo.LmUpload;
import org.springframework.http.HttpRequest;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/** 
* Created vgby GeneratorCode on 2019/05/09
*/ 

@RestController 
@RequestMapping("/codeTables") 
public class CodeTablesController { 

    @Resource 
    ICodeTablesService codeTablesService; 

    @RequestMapping("/insert") 
    public void insert(CodeTables codeTables,HttpServletRequest request) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String data = df.format(new Date());// new Date()为获取当前系统时间
        String orderIdByUUId = UUID16.getOrderIdByUUId();//加密
        String s = InetAddr.GetInetAddress(request);//ip
        s=s+orderIdByUUId;
//
        // 嵌入二维码的图片路径
        String imgPath = "D:/二维码/dog.jpg";
        // 生成的二维码的路径及名称
        String destPath = "D:/二维码/qrcode/jam.jpg";
        //生成二维码
        QRCodeUtil.encode(s, imgPath, destPath, true);

        codeTables.getSecret(s);
        codeTables.setCreattime(data);
        codeTables.setStart(1);
        codeTablesService.insert(codeTables); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer cid) { 
        codeTablesService.delete(cid); 
    } 

    @RequestMapping("/update") 
    public void update(CodeTables codeTables) { 
        codeTablesService.update(codeTables); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(CodeTables codeTables) { 
        codeTablesService.updateSelective(codeTables); 
    } 

    @RequestMapping("/load") 
    public CodeTables load(Integer cid) { 
        CodeTables codeTables = codeTablesService.findById(cid); 
        return codeTables; 
    } 

    @RequestMapping("/list") 
    public List<CodeTables> list() throws UnknownHostException {

        List<CodeTables> list = codeTablesService.findAll();
        return list;
    } 

    @RequestMapping("/search") 
    public List<CodeTables> search(CodeTables codeTables) { 
        List<CodeTables> list = codeTablesService.search(codeTables); 
        return list; 
    }
    @RequestMapping("/uopload")
    public LmUpload uploadImages(@RequestParam("file") MultipartFile file) throws IOException {
        //新版本
        String fileName = UUID.randomUUID().toString() + file.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
        //获取跟目录
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if (!path.exists()) {
            path = new File("");
        }
        //如果上传目录为/static/images/upload/,则可以如下获取
        File fileDir = new File(path.getAbsolutePath(), PathCommon.uploadWebImages());
        if (!fileDir.exists()) {
            fileDir.mkdirs();
            System.out.println(fileDir.getAbsolutePath());
            //在开发测试模式时，得到地址为：{项目跟目录}/target/static/images/upload/
            //在打成jar正式发布时，得到的地址为:{发布jar包目录}/static/images/upload/
        }
        file.transferTo(new File(fileDir.getAbsolutePath(), fileName));
        Map<String, String> result = new HashMap<String, String>();
        result.put("name", file.getOriginalFilename());
        result.put("size", String.valueOf(file.getSize()));
        LmUpload json = new LmUpload();
        json.setCode(200);
        json.setFilename(fileName);
        json.setName("null");
        return json;
    }

} 
