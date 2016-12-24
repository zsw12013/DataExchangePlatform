package zhousw.sys.web;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zhousw.sys.facade.SysUserFacade;

import com.alibaba.fastjson.JSONObject;
/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>

 */
@Controller
public class SysIndexController {

    @Resource
    private SysUserFacade sysUserFacade;

    /**
     * <B>方法名称：</B>系统首页<BR>
     * <B>概要说明：</B><BR>
     *
     * @param request 页面请求
     * @param response 页面响应
      * @return ModelAndView 模型视图
     */
    @RequestMapping("/sysindex.html")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView ret = new ModelAndView();
        List<JSONObject> list = this.sysUserFacade.getList();
        for (JSONObject jsonObject : list) {
            System.out.println(jsonObject);
        }
        System.out.println(this.sysUserFacade.getById("admin"));
        System.out.println(this.sysUserFacade.generateKey());
        return ret;
    }





}
