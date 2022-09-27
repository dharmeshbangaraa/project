package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
	@Query(value="select sum(course_price) from transaction", nativeQuery = true)
	public int getTotalRevenue();
	
	@Query(value="select ifnull(sum(course_price), 0) from transaction where course_id = ?", nativeQuery = true)
	public int getTotalRevenueByCourse(int courseId);
	
	@Query(value = "select * from transaction where course_id = ?", nativeQuery = true)
	public List<Transaction> findRevenueById(int courseId);
	
	@Query(value="select * from transaction where transaction_date between ?1 and ?2", nativeQuery = true)
	public List<Transaction> findRevenueByDate(String startDate, String endDate);
	
	@Query(value="select ifnull(sum(course_price), 0) from transaction where transaction_date between ?1 and ?2", nativeQuery=true)
	public int findTotalRevenueByDate(String startDate, String endDate);

}
