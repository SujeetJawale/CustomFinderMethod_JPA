package com.sujeet.SpringDataJpa1.service;

import java.util.List;

import com.sujeet.SpringDataJpa1.dao.IVaccineRepo;
import com.sujeet.SpringDataJpa1.view.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineServiceImpl implements IVaccineService 
{

	@Autowired
	private IVaccineRepo repo;

//	@Override
//	public List<ResultView> fetchByCostLessThan(Integer cost) {
//		// TODO Auto-generated method stub
//		return repo.findByCostLessThan(cost);
//	}

//	@Override
//	public List<Vaccine> fetchByCost(Integer cost) {
//		List<Vaccine> vaccines= repo.findByCost(cost);
//		//System.out.println(vaccines);
//		return vaccines;
//
//	}
//
//	@Override
//	public List<Vaccine> fetchByVaccineCompany(String companyName) {
//
//		//	return repo.findByVaccineCompany(companyName);
//		//	return repo.findByVaccineCompanyIs(companyName);
//		return repo.findByVaccineCompanyEquals(companyName);
//	}
//
//	@Override
//	public List<Vaccine> fetchByCostLessThan(Integer cost) {
//
//		return repo.findByCostLessThan(cost);
//	}
//
//	@Override
//	public List<Vaccine> fetchByCostBetween(Integer startingCost, Integer endingCost) {
//		// TODO Auto-generated method stub
//		return repo.findByCostBetween(startingCost, endingCost);
//	}
//
//	@Override
//	public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> vaccines, Integer startingCost, Integer endingCost) {
//		// TODO Auto-generated method stub
//		return repo.findByVaccineNameInAndCostBetween(vaccines, startingCost, endingCost);
//	}

	@Override
	public <T extends View>List<T> fetchByCostLessThan(Integer cost, Class<T> cls) {
		// TODO Auto-generated method stub
		return repo.findByCostLessThan(cost, cls);
	}
	

}
