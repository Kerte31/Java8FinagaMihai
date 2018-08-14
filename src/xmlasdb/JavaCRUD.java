/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlasdb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Mihai
 */
public class JavaCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean running = true;
        File file = new File("C:\\Users\\Mihai\\Documents\\NetBeansProjects\\Java8FinagaMihai\\src\\xmlasdb\\users.xml");

        while (running) {
            System.out.println("Please select option from menu:"
                    + "\n1. Retrieve the user list from the xml file"
                    + "\n2. Validate user"
                    + "\n3. Add new user"
                    + "\n4. Update user from list"
                    + "\n5. Delete user from list"
                    + "\n0. Exit application");
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("That is not a valid option. Try again ...");
                scanner.next();
            }
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    showUserList(file);
                    break;
                case 2:
                    validateUser(file);
                    break;
                case 3:
                    addNewUser(file);
                    break;
                case 4:
                    updateUser(file);
                    break;
                case 5:
                    deleteUser(file);
                    break;
                case 0:
                   running = false;
                   break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }
    public static void showUserList(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Users u = (Users) jaxbUnmarshaller.unmarshal(file);
            for (User user : u.getUser()) {
                System.out.println("---------------------");
                System.out.println("Username: " + user.getUsername() + "\nPassword: " + user.getPassword()
                        + "\nRole: " + user.getRole());
                System.out.println("---------------------");
            }
            Thread.sleep(3000);
        } catch (JAXBException | InterruptedException e) {
        }
    }

    public static void addNewUser(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Users u = (Users) jaxbUnmarshaller.unmarshal(file);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new username:");
            String username = scanner.next();
            System.out.println("Enter password:");
            String password = scanner.next();
            System.out.println("Enter role:");
            String role = scanner.next();
            u.addUser(username, password, role);
            Marshaller marshallerObj = jaxbContext.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallerObj.marshal(u, new FileOutputStream(file));
            System.out.println("User " + username + " added!");
            Thread.sleep(3000);
        } catch (JAXBException | InterruptedException | FileNotFoundException e) {
        }
    }

    public static void validateUser(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Users u = (Users) jaxbUnmarshaller.unmarshal(file);
            boolean found = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert username:");
            String usernameSearch = scanner.next();
            System.out.println("Insert password:");
            String passwordSearch = scanner.next();
            for (User user : u.getUser()) {
                if (user.getUsername().equals(usernameSearch) && user.getPassword().equals(passwordSearch)) {
                    found = true;
                }
            }
            if (found) {
                System.out.println("Credentials OK! User is found!");
            } else {
                System.out.println("Username or password incorrect!");
            }
            Thread.sleep(3000);
        } catch (JAXBException | InterruptedException e) {
        }
    }

    public static void updateUser(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Users u = (Users) jaxbUnmarshaller.unmarshal(file);
            Scanner scanner = new Scanner(System.in);
            boolean found = false;
            System.out.println("Please enter user credentials to update");
            System.out.println("Insert username:");
            String usernameSearch = scanner.next();
            System.out.println("Insert password:");
            String passwordSearch = scanner.next();
            for (User user : u.getUser()) {
                if (user.getUsername().equals(usernameSearch) && user.getPassword().equals(passwordSearch)) {
                    found = true;
                    System.out.println("User found! Update: \nEnter new username:");
                    String updateUsername = scanner.next();
                    System.out.println("Enter new password:");
                    String updatePassword = scanner.next();
                    System.out.println("Enter new role:");
                    String updateRole = scanner.next();
                    user.setUsername(updateUsername);
                    user.setPassword(updatePassword);
                    user.setRole(updateRole);
                }
            }
            if (found) {
                System.out.println("User updated!");
            } else {
                System.out.println("User not updated");
            }
            Marshaller marshallerObj = jaxbContext.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallerObj.marshal(u, new FileOutputStream(file));
            Thread.sleep(3000);
        } catch (JAXBException | InterruptedException | FileNotFoundException e) {
        }
    }

    private static void deleteUser(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Users u = (Users) jaxbUnmarshaller.unmarshal(file);
            Scanner scanner = new Scanner(System.in);
            boolean deleted = false;
            System.out.println("Please enter user credentials to delete user");
            System.out.println("Insert username:");
            String usernameSearch = scanner.next();

            for (Iterator<User> it = u.getUser().iterator(); it.hasNext();) {
                User user = it.next();
                if (user.getUsername().equals(usernameSearch)) {
                    System.out.println("User found! \nInsert password to confirm delete:");
                    String passwordSearch = scanner.next();
                    if (user.getPassword().equals(passwordSearch)) {
                        it.remove();
                        deleted = true;
                    }
                }
            }
            if (deleted) {
                System.out.println("User deleted!");
                Marshaller marshallerObj = jaxbContext.createMarshaller();
                marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshallerObj.marshal(u, new FileOutputStream(file));
            } else {
                System.out.println("User not deleted");
            }
            Thread.sleep(3000);
        } catch (JAXBException | InterruptedException | FileNotFoundException e) {
        }
    } 
}
