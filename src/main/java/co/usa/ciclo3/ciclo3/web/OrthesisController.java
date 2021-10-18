package co.usa.ciclo3.ciclo3.web;

import co.usa.ciclo3.ciclo3.service.OrthesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class OrthesisController {

    @Autowired
    private OrthesisService orthesisservice;

    @GetMapping()

}
