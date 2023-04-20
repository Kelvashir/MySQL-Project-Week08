/**
 * 
 */
package projects;

import projects.dao.DbConnection;

/**
 * @author usertyrone
 *
 */
public class ProjectsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DbConnection.getConnection();

	}

}
