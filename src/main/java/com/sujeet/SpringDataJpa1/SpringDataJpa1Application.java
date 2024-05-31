package com.sujeet.SpringDataJpa1;

import com.sujeet.SpringDataJpa1.view.ResultView2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sujeet.SpringDataJpa1.service.VaccineServiceImpl;

import java.util.Collection;
import java.util.HashSet;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);

		VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
		
		//	service.fetchByCostLessThan(2500).forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));

		//	service.fetchByCost(945).forEach(v->System.out.println(v));

		//	service.fetchByVaccineCompany("Astrazenca").forEach(v->System.out.println(v));
		//	service.fetchByCostLessThan(5000).forEach(v->System.out.println(v));
		//	service.fetchByCostBetween(500, 1500).forEach(v->System.out.println(v));

//		Collection<String> vaccines=new HashSet<>();
//		vaccines.add("CovidShield");
//		vaccines.add("Sputnik");
//		service.fetchByVaccineNameInAndCostBetween(vaccines, 500, 1500).forEach(v->System.out.println(v));

//		service.fetchByCostLessThan(2500, ResultView3.class).forEach(v->System.out.println(v.getCost()+ " "+ v.getVaccineName()));
		service.fetchByCostLessThan(2500, ResultView2.class).forEach(v->System.out.println(v.getId()+ " "+ v.getVaccineName()));
	}
}
