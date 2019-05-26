package com.qhit.codeErweima.pojo;


/** 
* Created by GeneratorCode on 2019/05/09
*/ 

public class CodeErweima { 
    private Integer eid;    //主键 
    private Integer cid;    //所属 
    private String url;    //路径 
    private Integer count;    //已扫次数 
    private String lasttime;    //结束 
    private Integer sort;    //序号 
    private Integer start;    //状态(1开启2禁用) 

    public Integer getEid() { 
        return eid;
    }

    public void setEid(Integer eid) { 
        this.eid = eid;
    } 

    public Integer getCid() { 
        return cid;
    }

    public void setCid(Integer cid) { 
        this.cid = cid;
    } 

    public String getUrl() { 
        return url;
    }

    public void setUrl(String url) { 
        this.url = url;
    }
    public Integer getCount() { 
        return count;
    }

    public void setCount(Integer count) { 
        this.count = count;
    } 

    public String getLasttime() { 
        return lasttime;
    }

    public void setLasttime(String lasttime) { 
        this.lasttime = lasttime;
    }
    public Integer getSort() { 
        return sort;
    }

    public void setSort(Integer sort) { 
        this.sort = sort;
    } 

    public Integer getStart() { 
        return start;
    }

    public void setStart(Integer start) { 
        this.start = start;
    } 


 }