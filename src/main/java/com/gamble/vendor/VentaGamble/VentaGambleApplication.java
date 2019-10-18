package com.gamble.vendor.VentaGamble;

import com.gamble.vendor.VentaGamble.entity.VSgpVendedoresActivos;
import com.gamble.vendor.VentaGamble.service.VendedorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class VentaGambleApplication {
    
 @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(VentaGambleApplication.class, args);
	}
        
        

}
