package com.dododev.sailingcompetition.utils;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class DBConnection {

	private static final Logger LOG = LoggerFactory.getLogger(DBConnection.class);
	private ConnectionSource connectionSource;

	public ConnectionSource getConnectionSource() {

		if (connectionSource != null) {
			return connectionSource;
		} else {
			try {
				ResourceBundle appProperties = ResourceBundle.getBundle("app");

				StringBuilder urlBuilder = new StringBuilder();
				urlBuilder.append("jdbc:postgresql://");
				urlBuilder.append(appProperties.getString("db.host"));
				urlBuilder.append(":");
				urlBuilder.append(appProperties.getString("db.port"));
				urlBuilder.append("/");
				urlBuilder.append(appProperties.getString("db.name"));
				urlBuilder.append("?user=");
				urlBuilder.append(appProperties.getString("db.user"));
				urlBuilder.append("&password=");
				urlBuilder.append(appProperties.getString("db.pass"));

				String databaseUrl = urlBuilder.toString();
				urlBuilder = null;

				LOG.debug(">>> databaseUrl : " + databaseUrl);

				ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
				return connectionSource;

			} catch (Throwable ex) {
				LOG.error("Exception in getConnection. Exception details: {}", ex);
			}
		}

		return null;

	}

}
