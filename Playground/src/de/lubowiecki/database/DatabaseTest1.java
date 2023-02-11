package de.lubowiecki.database;


import java.util.List;

public class DatabaseTest1 {

	public static void main(String[] args) {
		
		// ORM: Object-Relational-Mapping
		// JPA: Java Persistence API
		// Implementierungen: Hibernate, EclipseLink, Apache OpenJPA
		
		
		try {
			//TodoRepository repoTodo = new TodoRepository();
			
			
			UserRepository repo = new UserRepository();
			
			// DELETE
//			if(repo.delete(5)) {
//				System.out.println("Gelöscht");
//			}
			
//			User user = new User("Peter", "Parker");
//			System.out.println(user);
//			
//			// INSERT
//			if(repo.save(user)) {
//				System.out.println("Gespeichert");
//			}
			
//			System.out.println(user);
//			
//			// UPDATE
//			user.setFirstname("Hans");
//			if(repo.save(user)) {
//				System.out.println("Geändert");
//			}
//			
//			System.out.println(user);
			
			User old = repo.findById(4);
			old.setFirstname("Bob");
			if(repo.save(old)) {
				System.out.println("Geändert");
			}
//			
//			// Alle abfragen
			List<User> users = repo.find();
			for(User u : users) {
				System.out.println(u.getId() + ": " + u.getFirstname() + " " + u.getLastname());
			}
			
			// Einen abfragen
//			User u = repo.findById(3);
//			System.out.println(u.getFirstname() + " " + u.getLastname());
			
		}
		catch (Exception e) {
			System.out.println("Probleme: " + e.getMessage());
		}
	}
}
