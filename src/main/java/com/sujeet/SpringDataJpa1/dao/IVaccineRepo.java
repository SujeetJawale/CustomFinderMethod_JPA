package com.sujeet.SpringDataJpa1.dao;

import java.util.Collection;
import java.util.List;

import com.sujeet.SpringDataJpa1.view.View;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> 
{
    //findByProperty
//    public List<Vaccine> findByCost(Integer cost);
//
//    public List<Vaccine> findByVaccineCompany(String companyName);
//
//    //findByPropertykeywords
//    public List<Vaccine> findByVaccineCompanyIs(String companyName);
//    public List<Vaccine> findByVaccineCompanyEquals(String companyName);
//
//    public List<Vaccine> findByCostLessThan(Integer cost);
//    public List<Vaccine> findByCostBetween(Integer startingCost, Integer endingCost);
//    public List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> vaccines, Integer startingCost, Integer endingCost);

    // public List<ResultView>findByCostLessThan(Integer cost);

    public <T extends View>List<T> findByCostLessThan(Integer cost, Class<T> cls);
}
