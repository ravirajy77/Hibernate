package tnsif.c2tc.m07;

import tnsif.c2tc.m07.CertificateService.CertificateServiceImpl;
import tnsif.c2tc.m07.CertificateService.ICertificateService;
import tnsif.c2tc.m07.entities.Certificate;
import tnsif.c2tc.m07.entities.College;

public class StudentCertificate {

	public static void main(String[] args) 
	{
		
		ICertificateService certificateService=new CertificateServiceImpl();
		Certificate certificate=new Certificate();
		certificate.setCid(100);
		certificate.setCollege(College.SCE);
		certificate.setYear(2021);
		certificateService.addCertificate(certificate);
		//Certificate c=certificateService.getCertificate(1001);
		//System.out.println(c);
		System.out.println(certificate);
		certificateService.updateCertificate(certificate);
		//certificateService.searchCertificate(certificate);
	}

}
