package tnsif.c2tc.m07.CertificateRepository;

import javax.persistence.EntityManager;

import tnsif.c2tc.m07.entities.Certificate;


public class CertificateRepositoryImpl implements ICertificateRepository{
	EntityManager entityManager;
	public CertificateRepositoryImpl()
	{
		entityManager=Configuration.getEntityManager();
	}
	@Override
	public void addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
	}
	@Override
	public void startEntries() {
		entityManager.getTransaction().begin();
	}
	@Override
	public void endEntries() {
		entityManager.getTransaction().commit();
	}
	@Override
	public void updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
	}
	@Override
	public Certificate searchCertificate(long id) {
		Certificate certificate=entityManager.find(Certificate.class, id);
		return certificate;
	}
	
	@Override
	public void deleteStudent(long cid) {
		Certificate certificate=entityManager.find(Certificate.class , cid);
		entityManager.remove(certificate);
	}
	@Override
	public Certificate getCertificate(int cid) {
		Certificate c=entityManager.find(Certificate.class, cid);
		return c;
	}
	
}
