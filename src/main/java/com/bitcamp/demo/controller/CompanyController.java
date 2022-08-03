package com.bitcamp.demo.controller;

import com.bitcamp.demo.model.Company;
import com.bitcamp.demo.mapper.CompanyMapper;
import com.bitcamp.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private CompanyService companyService;

    /**
    @PostMapping("")
    public int post(@RequestBody Company company){
        return companyMapper.insert(company);
    }*/

     @PostMapping("")
     public Company post(@RequestBody Company company){
         companyMapper.insert(company);
         return company;
     }

//    @GetMapping("")
//    public List<Company> getAll(){
//        return companyMapper.getAll();
//    }

    @GetMapping("")
    public List<Company> getAll(){
        return companyMapper.getAll();
    }
//    public List<Company> getAll(){
//        return companyService.getAll();
//    }


    @GetMapping("/{id}")
    public Company getById(@PathVariable("id") int id){
        return companyMapper.getById(id);
    }
}
