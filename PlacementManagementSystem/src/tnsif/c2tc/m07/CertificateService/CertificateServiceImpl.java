package tnsif.c2tc.m07.CertificateService;

import tnsif.c2tc.m07.CertificateRepository.CertificateRepositoryImpl;
import tnsif.c2tc.m07.CertificateRepository.ICertificateRepository;
import tnsif.c2tc.m07.entities.Certificate;

public class CertificateServiceImpl implements ICertificateService{
	ICertificateRepository cr;
	public CertificateServiceImpl()
	{
		cr=new CertificateRepositoryImpl();
	}
	@Override
	public void addCertificate(Certificate certificate) {
		cr.startEntries();
		cr.addCertificate(certificate);
		cr.endEntries();
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		cr.startEntries();
		cr.updateCertificate(certificate);
		cr.endEntries();
	}

	@Override
	public void deleteStudent(long cid) {
		cr.startEntries();
		cr.deleteStudent(cid);
		cr.endEntries();
	}
	@Override
	public Certificate getCertificate(int cid) {
		Certificate c=cr.getCertificate(cid);
		return c;
	}
	@Override
	public Certificate searchCertificate(long id) {
		Certificate c=cr.searchCertificate(id);
		return c;
	}

}
