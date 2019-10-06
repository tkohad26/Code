package com.mediaocean.productbilling;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mediaocean.productbilling.repositories.ProductRepository;
import com.mediaocean.productbilling.repositories.TransactionRepository;
import com.mediaocean.productbilling.entities.Products;
import com.mediaocean.productbilling.entities.Purchases;

@Component
public class App implements CommandLineRunner {
	
	@Autowired
	ProductRepository repo;
	

	@Autowired
	TransactionRepository repoTrans;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("************************Initializing data");
		
		Products product1=new Products("Apple", "Electronic", 500,1050);
		Products product2=new Products("Samsung", "Electronic", 500,75);
		Products product3=new Products("Micromax", "Electronic", 500,890);
		Products product4=new Products("Nokia", "Electronic", 500,76);
		Products product5=new Products("Redmi", "Electronic", 500,123);
		
		Products product6=new Products("Basket", "Home App", 500,200);
		Products product7=new Products("Bead", "Furniture", 500,300);
		Products product8=new Products("Bag", "Stationary", 500,890);
		Products product9=new Products("NoteBook", "Stationary", 500,90);
		Products product10=new Products("Pen", "Stationary", 500,90);
		
		repo.save(product1);
		repo.save(product2);
		repo.save(product3);
		repo.save(product4);
		repo.save(product5);
		
		repo.save(product6);
		repo.save(product7);
		repo.save(product8);
		repo.save(product9);
		repo.save(product10);
		
		
		Purchases p1=new Purchases(1,10,1,10);
		Purchases p2=new Purchases(1,9,1,5);
		Purchases p3=new Purchases(1,15,1,18);
		Purchases p4=new Purchases(2,15,1,218);
		
		repoTrans.save(p1);
		repoTrans.save(p2);
		repoTrans.save(p3);
		repoTrans.save(p4);
		

	}

}
