package Assignment7;

import java.util.*;
public class ProfileManager {

	public static void main(String[] args) {
		
        List<Profile> profiles = new ArrayList<>();

        //creating profiles
        Profile profile1 = new Profile("Venkat", 46, "Hyderabad", "Software engineer");
        Profile profile2 = new Profile("Vinay", 23, "Nellore", "FullStack  Developer");
        Profile profile3 = new Profile("Vishnu", 28, "Hyderabad", "Software Engineer");

        // Adding profiles to the list
        profiles.add(profile1);
        profiles.add(profile2);
        profiles.add(profile3);

        // Displaying profile details
        System.out.println("Profiles and Details:");
        
        for (Profile profile : profiles) {
        	
            System.out.println("Name: " + profile.getName());
            System.out.println("Age: " + profile.getAge());
            System.out.println("Location: " + profile.getLocation());
            System.out.println("Bio: " + profile.getBio());
           
        }


	}

}
