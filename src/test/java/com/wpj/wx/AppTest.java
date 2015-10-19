package com.wpj.wx;

import com.wpj.wx.daomain.TbHeader;
import com.wpj.wx.daomain.TbList;
import com.wpj.wx.daomain.TbMenu;
import com.wpj.wx.daomain.TbSlider;
import com.wpj.wx.serviceImpl.HeaderServiceImpl;
import com.wpj.wx.serviceImpl.ListServiceImpl;
import com.wpj.wx.serviceImpl.MenuServiceImpl;
import com.wpj.wx.serviceImpl.SliderServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = App.class,
        initializers = ConfigFileApplicationContextInitializer.class)
@WebIntegrationTest({"server.port=0", "management.port=0"})
@TransactionConfiguration(defaultRollback = true)
@Transactional("transactionManager")
public class AppTest
{
    @Autowired
    HeaderServiceImpl headerService;
    @Autowired
    MenuServiceImpl menuService;
    @Autowired
    SliderServiceImpl sliderService;
    @Autowired
    ListServiceImpl listService;
    /**
     * header
     */
    @Test
   public void insert(){
        TbHeader tbHeader=new TbHeader();
        tbHeader.setTitle("测试");
        tbHeader.setFixed(false);
      int  result=  headerService.save(tbHeader);
        System.out.println("result:"+result);
    }
    @Test
    public void select(){
        System.out.println("result:"+ headerService.findDataMapById(1));
        headerService.selectByKey(1);
    }
    /**
     * menu
     */
    @Test
    public void selectMenu(){

     TbMenu tbMenu=menuService.findAllMenuMessageById(1);
        System.out.println(tbMenu.toString());
        System.out.println(tbMenu.getContent());

    }
    @Test
    public void tbSlider(){
       TbSlider tbSlider= sliderService.findAllMenuMessageById(1);
        System.out.println(tbSlider.toString()+"--");
        System.out.println(tbSlider.toString());

    }
    @Test
    public void selectList(){

       TbList tbList= listService.findALlListById(1);
        System.out.println("----->"+tbList.toString());
    }
}
