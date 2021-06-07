package com.sri.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;
import com.sri.config.ExchangeValue;
import java.util.List;
import java.util.Optional;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	Optional<ExchangeValue> findByFromAndTo(String from,String to);
}
