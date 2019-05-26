package com.qhit.codeTables.pojo;


/** 
* Created by GeneratorCode on 2019/05/09
*/ 

public class CodeTables { 
    private Integer cid;    //主键 
    private String cname;    //标题 
    private Integer count;    //扫描上限 
    private Integer type;    //类型(1按顺序切换2随机切换) 
    private String logo;    //图标 
    private String eid;   //二维码
    private String spare;    //备用
    private String creattime;    //创建 
    private Integer start;    //状态(1开启2禁用)
    private String secret;//密匙
    private String cover;//封面

    public String getSecret(String orderIdByUUId) {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getCid() {
        return cid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    } 

    public String getCname() { 
        return cname;
    }

    public void setCname(String cname) { 
        this.cname = cname;
    }
    public Integer getCount() { 
        return count;
    }

    public void setCount(Integer count) { 
        this.count = count;
    } 

    public Integer getType() { 
        return type;
    }

    public void setType(Integer type) { 
        this.type = type;
    } 

    public String getLogo() { 
        return logo;
    }

    public void setLogo(String logo) { 
        this.logo = logo;
    }
    public String getSpare() { 
        return spare;
    }

    public void setSpare(String spare) { 
        this.spare = spare;
    }
    public String getCreattime() { 
        return creattime;
    }

    public void setCreattime(String creattime) { 
        this.creattime = creattime;
    }
    public Integer getStart() { 
        return start;
    }

    public void setStart(Integer start) { 
        this.start = start;
    } 


 }