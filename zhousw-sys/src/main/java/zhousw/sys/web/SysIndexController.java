package zhousw.sys.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zhousw.sys.entity.SysUser;
import zhousw.sys.facade.SysUserFacade;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
  * @since 2016年2月29日
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
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView ret = new ModelAndView();
        SysUser user = this.sysUserFacade.getUser();
        System.out.println(user);

        return ret;
    }




}
