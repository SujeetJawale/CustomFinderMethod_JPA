package com.sujeet.SpringDataJpa1.service;

import java.util.List;

import com.sujeet.SpringDataJpa1.view.ResultView;

public interface IVaccineService 
{
	public List<ResultView> fetchByCostLessThan(Integer cost);
}
