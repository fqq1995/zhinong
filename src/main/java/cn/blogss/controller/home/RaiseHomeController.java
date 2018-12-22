package cn.blogss.controller.home;/*
    create by LiQiang at 2018/4/22   
*/

import cn.blogss.pojo.RaiseOrders;
import cn.blogss.pojo.Users;
import cn.blogss.service.HomeRaiseService;
import cn.blogss.service.RaiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/home")
public class RaiseHomeController {
    @Autowired
    HomeRaiseService homeRaiseService;

    @Autowired
    HttpServletRequest request;

    @Autowired
    private RaiseService raiseService;

    //    农资查看
    @RequestMapping(value = "/raise/{pageNow}",method = RequestMethod.GET)
    public String raisePage(@PathVariable String pageNow, Model model){
        String cid = request.getParameter("cid");
        homeRaiseService.raiseList(pageNow,model,cid);
        return "home/raise/raise";
    }

    //    农资详情
    @RequestMapping("/raise/raise_detail/{raiseId}")
    public String raiseDetail(@PathVariable int raiseId,Model model){
        homeRaiseService.raiseDetail(raiseId,model);
        return "home/raise/raise_detail";
    }

    //提交订单
    @RequestMapping(value = "/raise/raise_submit",method = RequestMethod.GET)
    public String raiseSubmit(Model model){
        Users user = (Users)request.getSession().getAttribute("user") ;

        if(user == null){
            return "redirect:/home/login";
        }

        int raiseId = Integer.parseInt(request.getParameter("raiseId"));
        int raiseMount = Integer.parseInt(request.getParameter("raiseMount"));

        homeRaiseService.raiseSubmit(raiseId,raiseMount,model);

        return "home/raise/raise_submit";
    }

    //订单付款
    @RequestMapping(value = "/raise/raise_pay",method = RequestMethod.GET)
    public String raisePay(@ModelAttribute RaiseOrders raiseOrders){
        Users user = (Users)request.getSession().getAttribute("user") ;


        int userId = user.getId();
        raiseOrders.setUserId(userId);

        int code = homeRaiseService.raisePay(raiseOrders);

        if(code != 0){
            return "home/raise/pay_success";
        }

        return "home/raise/pay_fail";
    }


}
