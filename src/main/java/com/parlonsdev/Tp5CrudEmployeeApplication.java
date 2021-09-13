package com.parlonsdev;

import com.parlonsdev.model.Gender;
import com.parlonsdev.model.Profile;
import com.parlonsdev.model.User;
import com.parlonsdev.repository.ProfileRepository;
import com.parlonsdev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Calendar;

@SpringBootApplication
@EnableJpaAuditing
public class Tp5CrudEmployeeApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(Tp5CrudEmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAllInBatch();
		profileRepository.deleteAllInBatch();

		//User user1 = new User("user1", "user1@test.sn", "salut124");

		// Create many users instances
		User user1 = userRepository.save(new User("user1", "user1@test.sn", "salut124"));
		User user2 = userRepository.save(new User("user2", "user2@test.sn", "salut124"));
		User user3 = userRepository.save(new User("user3", "user3@test.sn", "salut124"));
		User user4 = userRepository.save(new User("user4", "user4@test.sn", "salut124"));
		User user5 = userRepository.save(new User("user5", "user5@test.sn", "salut124"));

		Calendar dateOfBirth1 = Calendar.getInstance();
		dateOfBirth1.set(1992, 7, 21);

		Calendar dateOfBirth2 = Calendar.getInstance();
		dateOfBirth2.set(1982, 7, 9);

		Calendar dateOfBirth3 = Calendar.getInstance();
		dateOfBirth3.set(1995, 8, 11);

		Calendar dateOfBirth4 = Calendar.getInstance();
		dateOfBirth4.set(2002, 12, 01);

		Calendar dateOfBirth5 = Calendar.getInstance();
		dateOfBirth5.set(1998, 04, 14);

		// Create many profiles instances

		//Profile profile1 = new Profile("771240145",dateOfBirth.getTime(), Gender.MALE, "Thies", "Africa", "Thies", "451fdgb541der12s8", user1);

		profileRepository.save(new Profile("771240145",dateOfBirth1.getTime(), Gender.MALE,
				"Barcelona, Span", "European", "Barcelona", "451fdgb541der12s8", user1));
		profileRepository.save(new Profile("771541240",dateOfBirth4.getTime(), Gender.FEMALE,
				"Dakar", "Africa", "Dakar", "451fdgb541der12s8", user2));
		profileRepository.save(new Profile("771278124",dateOfBirth4.getTime(), Gender.FEMALE,
				"New York", "America", "New York", "145mlkj4587kjlf45", user4));
		profileRepository.save(new Profile("771240149",dateOfBirth2.getTime(), Gender.MALE,
				"Dakar, Senegal", "Africa", "Dakar", "751fdgb5kjl4er12s8", user5));
		profileRepository.save(new Profile("771240107",dateOfBirth5.getTime(), Gender.FEMALE,
				"Madrid", "European", "Madrid", "451fdhj541der12s8", user3));

	}
}
