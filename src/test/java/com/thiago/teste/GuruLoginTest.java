package com.thiago.teste;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGuruLogin;
import com.thiago.page.PageGuruSucess;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(InvokedMethodListener.class)
public class GuruLoginTest {

    public final String BASE_URL = "http://demo.guru99.com/test/login.html";


    @Test
    public void loginTest() throws Exception {
        new PageGuruLogin()
                .openPage(PageGuruLogin.class, BASE_URL)
                .fazerLogin("admin", "admin");
        String result = new PageGuruSucess().verificarMensagemLogin();
        Assert.assertEquals("Successfully Logged in...", result);
    }

}
