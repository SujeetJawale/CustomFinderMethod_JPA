package com.sujeet.SpringDataJpa1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujeet.SpringDataJpa1.view.ResultView;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> 
{
    public List<ResultView>findByCostLessThan(Integer cost);
}
