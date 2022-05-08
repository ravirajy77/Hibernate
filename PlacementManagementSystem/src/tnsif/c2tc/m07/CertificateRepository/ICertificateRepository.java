package tnsif.c2tc.m07.CertificateRepository;

import tnsif.c2tc.m07.entities.Certificate;

public interface ICertificateRepository {

	public void addCertificate(Certificate certificate);

	public void startEntries();
	
	public void endEntries();
	
	public void updateCertificate(Certificate certificate);
	
	public Certificate searchCertificate(long id); 

	public void deleteStudent(long cid);

	public Certificate getCertificate(int cid);

}
