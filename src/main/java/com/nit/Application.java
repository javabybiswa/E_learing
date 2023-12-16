package com.nit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.entity.UserEntity;
import com.nit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		
		     UserRepository repository=context.getBean(UserRepository.class);
		     
		     //System.out.println(repository.getClass().getName());
		     
		     //for inserting single value
		     
		    /* UserEntity u=new UserEntity(100,"daya","gujurat",6451351212L);
		    repository.save(u);
		    System.out.println("insert successfully");*/
		     
		     
		     //for inserting multiple value at a time
		     
		   /*  UserEntity u1=new UserEntity(101,"jethalal","ahmedabad",654564654L);
		     UserEntity u2=new UserEntity(102,"tarak","delhi",865456455L);
		     UserEntity u3=new UserEntity(103,"bhide","mumbai",87855555L);
		     UserEntity u4=new UserEntity(104,"iyer","chennai",87444455L);
		     UserEntity u5=new UserEntity(105,"popot","kolkata",87875555L);
		     
		     
		     repository.saveAll(Arrays.asList(u1,u2,u3,u4,u5));*/
		     
		     //findById
		    /* Optional<UserEntity> id=repository.findById(101);
		       if(id.isPresent()) {
		    	   
		    	   System.out.println(id.get());
		       }
		       else{
		    	   System.out.println("data not avilable");
		       }
		       
		        //findAllById
		       
		       Iterable<UserEntity> allIds=repository.findAllById(Arrays.asList(100,101,102,103,104,105));
		       
		         allIds.forEach(user -> System.out.println(user));
		    */
		         //findAll
		         
		        /* List<UserEntity> allData = repository.findAll();
		         System.out.print(allData);
		         */
		              //or
		         
		        /* Iterable<UserEntity> allInfo=repository.findAll();
		             
		            allInfo.forEach(userinfo -> System.out.println(userinfo));*/
		                  
		            //count
		         
		   /* long count= repository.count();
		          
		              System.out.println("total count" +count);
		              
		              //exitsById()
		              boolean userstatus=repository.existsById(101);
		              System.out.println("record avilable::" +userstatus);*/
		         
		            //deleteById()
		              
		               //repository.deleteById(105);
		               
		     //deleteAllById
		              repository.deleteAllById(Arrays.asList(101,102));
		              
		              repository.deleteAll();
		              System.out.println("all data are deleted");
		              
		        }

}
