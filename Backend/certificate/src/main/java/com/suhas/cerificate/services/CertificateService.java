package com.suhas.cerificate.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suhas.certificate.model.Certificate;
import com.suhas.certificate.repository.CertificateRepository;

@Service
public class CertificateService {

@Autowired	
private CertificateRepository certificaterepository;
	
public Certificate addCertificate (Certificate certificate) {
return certificaterepository.save(certificate);
}

public List<Certificate> getCertificate() {
List<Certificate> certificate = certificaterepository.findAll();
System.out.println("Getting data from DB : " + certificate);
return certificate;
}

public Optional<Certificate> getCertificatebyId(String id) {
return certificaterepository.findById(id);
}
}

