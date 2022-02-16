package com.suhas.certificate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.suhas.certificate.model.Certificate;

public interface CertificateRepository extends MongoRepository<Certificate, String> {

}
