package edu.gandhi.prajit.spring.batch.ex01;

import java.sql.ResultSet;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ExecutorExample01 {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmbededDatabaseConfig.class)){
			final Map<String,JdbcTemplate> h2HsqlDerbyTemplate=applicationContext.getBeansOfType(JdbcTemplate.class);
			for(Map.Entry<String,JdbcTemplate> entry:h2HsqlDerbyTemplate.entrySet()){
				System.out.println("JdbcTemplate Used:"+entry.getKey()+":Start");
				entry.getValue().query("Select PassengerId,Survived,Pclass,Name,Sex,Age,"
						+ "SibSp,Parch,Ticket,Fare,Cabin,Embarked From TitanicKraggleData",
				(ResultSet resultSet)->{
					System.out.println(
						TitanicPassengerDetails.builder()
						.passengerId(resultSet.getInt("PassengerId"))
						.survived(resultSet.getInt("Survived"))
						.Pclass(resultSet.getInt("Pclass"))
						.name(resultSet.getString("Name"))
						.sex(resultSet.getString("Sex"))
						.age(resultSet.getInt("Age"))
						.sibSp(resultSet.getInt("SibSp"))
						.parch(resultSet.getInt("Parch"))
						.ticket(resultSet.getString("Ticket"))
						.fare(resultSet.getDouble("Fare"))
						.cabin(resultSet.getString("Cabin"))
						.embarked(resultSet.getString("Embarked"))
						.build());
				});
				System.out.println("JdbcTemplate Used:"+entry.getKey()+":End");
			}
		}
	}
}