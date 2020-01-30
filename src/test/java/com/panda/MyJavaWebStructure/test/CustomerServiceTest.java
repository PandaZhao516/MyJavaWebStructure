package com.panda.MyJavaWebStructure.test;

import com.panda.MyJavaWebStructure.model.Customer;
import com.panda.MyJavaWebStructure.services.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.spec.ECField;
import java.util.HashMap;
import java.util.Map;

/**
 * customerService的单元测试
 */
public class CustomerServiceTest {
    private CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init(){
        //TODO 初始化数据库
    }

    @Test
    public void getCustomerTest() throws Exception{
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception{
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("name","customer100");
        fieldMap.put("contact","John");
        fieldMap.put("telephone","15191682732");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception{
        long id = 1;
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("contact","Eric");
        boolean result = customerService.updateCustomer(id,fieldMap);
        Assert.assertTrue(result);
    }

    public void deleteCustomerTest() throws Exception{
        long id=1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
