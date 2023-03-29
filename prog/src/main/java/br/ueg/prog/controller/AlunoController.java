package br.ueg.prog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

@Api(tags = "Amigo API")
@RestController
@RequestMapping(path = "${app.api.base}/amigo")
public class AlunoController {
    
}
