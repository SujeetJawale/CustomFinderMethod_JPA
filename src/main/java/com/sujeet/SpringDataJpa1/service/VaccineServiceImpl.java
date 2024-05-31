package com.sujeet.SpringDataJpa1.service;

import java.util.List;

import com.sujeet.SpringDataJpa1.dao.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujeet.SpringDataJpa1.view.ResultView;

@Service
public class VaccineServiceImpl implements IVaccineService 
{

	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<ResultView> fetchByCostLessThan(Integer cost) {
		// TODO Auto-generated method stub
		return repo.findByCostLessThan(cost);
	}


	

}
