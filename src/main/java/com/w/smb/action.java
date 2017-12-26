package com.w.smb;

import com.w.smb.bean.User;
import com.w.smb.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class action {

    @Autowired
    UserDao userDao;

    @RequestMapping("/insertUser")
    public void insertUserAction() {
        User user = new User();
        user.setId("999");
        user.setUsername("KKUB");
        user.setPassword("w35");
        userDao.insertUser(user);
    }

    @RequestMapping("hello")
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        return mav;
    }

}
