package com.gl.orderService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.orderService.bean.SalesPerson;

@Repository
public interface SalesPersonRepository extends JpaRepository<SalesPerson, String> {
	@Query(value = "SELECT MAX(CAST(SUBSTRING(sales_person_id, 2, length(sales_person_id)-1) AS UNSIGNED)) FROM sales_person", nativeQuery = true)
	public Integer findMaxSalesPersonId();
}
