package com.example.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	private final JdbcTemplate jdbcTemplate;

	public UserDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<String> getUserNames() {
		String sql = "SELECT username from public.auth_user";
		return jdbcTemplate.query(sql, (rs, i) -> rs.getString("username"));
	}

}
