package com.thiago.teste;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGuruDeleteCustomer;
import com.thiago.page.PageGuruRegisterSucess;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(InvokedMethodListener.class)
public class GuruDeleteCustomerTest {

    public final String BASE_URL = "http://demo.guru99.com/test/delete_customer.php";

    @Test
    public void deleteCustomerById() throws Exception {
        new PageGuruDeleteCustomer()
                .openPage(PageGuruDeleteCustomer.class, BASE_URL)
                .deleteCustomerById("123");
    }

}
