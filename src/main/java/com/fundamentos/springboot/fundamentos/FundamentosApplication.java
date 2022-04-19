package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springboot.fundamentos.bean.MyExampleWithDependency;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import com.fundamentos.springboot.fundamentos.entity.User;
import com.fundamentos.springboot.fundamentos.pojo.UserPojo;
import com.fundamentos.springboot.fundamentos.repository.UserRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	Log LOGGER = LogFactory. getLog(FundamentosApplication.class);

	//INYECTAR DEPENDENCIA
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MyExampleWithDependency myExampleWithDependency;
	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;
	private UserRepository userRepository;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency,
								  MyExampleWithDependency myExampleWithDependency, MyBeanWithProperties myBeanWithProperties, UserPojo userPojo, UserRepository userRepository) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myExampleWithDependency= myExampleWithDependency;
		this.myBeanWithProperties=myBeanWithProperties;
		this.userPojo=userPojo;
		this.userRepository=userRepository;

	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	//Llamar implementación
	@Override
	public void run(String... args)  {
	 //EjemplosAnteriores();
	saveUsuariosInDataBase();

	}


	private void saveUsuariosInDataBase(){
		User user1 = new User ("Luisa" , "luisa889@gmail.com" , LocalDate.of(2022, 04,11));
		User user2 = new User ("Andrea" , "andrea@gmail.com" , LocalDate.of(2022, 05,8));
		User user3 = new User ("Sara" , "sara@gmail.com" , LocalDate.of(2022, 06,9));
		User user4 = new User ("Liliana" , "liliana@gmail.com" , LocalDate.of(2022, 07,7));
		List <User> list = Arrays.asList(user1,user2,user3,user4);
		list.stream().forEach(userRepository::save);
	}
	private void EjemplosAnteriores(){
//		//System.setProperty("value.random","text");
//		componentDependency.saludar();
//		myBean.print();
//		myBeanWithDependency.printWithDependency();
//		myExampleWithDependency.printMultiplicacion();
//		System.out.println(myBeanWithProperties.function());
//		System.out.println("Su Email es: "+ userPojo.getEmail() );
//		System.out.println("Su Contraseña es: "+ userPojo.getPassword());
//		System.out.println("Su edad es: " + userPojo.getAge());
//		System.out.println("Su direccion es: " + userPojo.getDireccion());
//		LOGGER.error("Error del sistema");
	}
}
