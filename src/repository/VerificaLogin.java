package repository;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class VerificaLogin {
	
	private static Connection conn = null;
	
	public static Connection getConnection() throws SQLException {
		if(conn == null) {
			Properties props =  loadPorperties();
			String url = props.getProperty("spring.datasource.url");
			conn = DriverManager.getConnection(url, props);
		}
		return conn;
	}
	
	private static Properties loadPorperties() {
		try (FileInputStream fs = new FileInputStream("appplication.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
