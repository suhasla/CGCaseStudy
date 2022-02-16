package com.suhas.certificate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suhas.certificate.model.Certificate;
import com.suhas.certificate.repository.CertificateRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/certificate")
public class CertificateController {
	@Autowired
	private CertificateRepository crtrepo;
	
	@PostMapping("/add")
    public String saveCertificate(@RequestBody Certificate certificate) {
        crtrepo.save(certificate);
        return "Added Certificate with id:" +certificate.getCertificateid();
    }
	@GetMapping("{certificateid}")
	public Optional<Certificate> getCertificate(@PathVariable String certificateid){
	return crtrepo.findById(certificateid);
	}
	
	 @GetMapping("/findall")
   public List<Certificate> getCertificate() {
       return crtrepo.findAll();
   }


}
