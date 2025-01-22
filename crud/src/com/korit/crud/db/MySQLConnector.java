package com.korit.crud.db;

import java.sql.Connection;

// JDBC(Java DataBase Connectivity): 
// Java에서 데이터베이스 연결을 위한 표준 API

// 특징
// - 플랫폼 독립적: 운영체제와 상관없이 사용 가능
// - 표준화: 특정 DBMS에 종속되지 않고 공통으로 사용할 수 있음
// - 확장성: DBMS에 따라 서로 다른 JDBC를 사용하여 확장 가능
// - 상호작용성: SQL 쿼리를 실행하고 결과를 처리할 수 있음
// - 유연성: 다양한 DBMS를 지원
public class MySQLConnector {

	public static Connection connection = null;
	
	private final String URL = "jdbc:mysql://127.0.0.1:3306/crud";
	private final String USER = "root";
	private final String PASSWORD = "root";
	
}







