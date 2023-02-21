package com.decagon.adire.repository;

import com.decagon.adire.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSummaryRepository extends JpaRepository<Receipt, Long> {
}
