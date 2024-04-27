/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tugas;

import models.DataPassword;
import models.PasswordStore;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
          try {
            DataPassword.loadCSVData();
            MainPage mainPage = new MainPage(80);
            mainPage.draw();

            // Your application logic here (e.g., password input, display)
            // Use DataPassword.passData to manage password data

            // Save password data on exit (before exiting the application)
            DataPassword.saveCSVData();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
