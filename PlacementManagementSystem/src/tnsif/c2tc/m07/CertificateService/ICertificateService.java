package tnsif.c2tc.m07.CertificateService;

import tnsif.c2tc.m07.entities.Certificate;

public interface ICertificateService {
	//public Student searchStudentByHallTicket(long id);
	
	public void addCertificate(Certificate certificate);
	
	public void updateCertificate(Certificate certificate);
	
	public void deleteStudent(long cid);

	public Certificate getCertificate(int cid);

	public Certificate searchCertificate(long id);
}
