package in.anand.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class cmdRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {

			System.out.println("command line runnners");
	}

	
}
