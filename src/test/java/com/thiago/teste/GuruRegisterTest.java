package com.thiago.teste;

import com.thiago.core.InvokedMethodListener;
import com.thiago.dto.RegisterDTO;
import com.thiago.page.PageGuruRegister;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(InvokedMethodListener.class)
public class GuruRegisterTest {

    public final String BASE_URL = "http://demo.guru99.com/test/newtours/register.php";

    @Test
    public void relizarRegistro() throws Exception {
        RegisterDTO registerDTO = new RegisterDTO();
        registerDTO.setImputFirstName("Sergio");
        registerDTO.setImputLastName("Diniz");
        registerDTO.setImputEmail("sergio@g.com.br");
        registerDTO.setImputPhone("123321123");
        registerDTO.setImputAddress("Rua 1");
        registerDTO.setImputCity("Santa Helena");
        registerDTO.setImputStateProvince("PB");
        registerDTO.setImputPostalCode("5555555");
        registerDTO.setSelectCountry("BRAZIL");
        registerDTO.setImputUserName("SergioDz");
        registerDTO.setImputPassword("123");
        registerDTO.setImputConfirmPassword("123");

        new PageGuruRegister()
                .openPage(PageGuruRegister.class, BASE_URL)
                .realizarRegistro(registerDTO)
                .validarRegistro();

    }
}
