package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(partRepository.count() == 0){
            OutsourcedPart o1= new OutsourcedPart();
            o1.setCompanyName("Happy Electronics LLC");
            o1.setName("Lenovo X1 Laptop Charger");
            o1.setInv(15);
            o1.setPrice(25.0);
            o1.setId(1001L);
            o1.setMaxinv(40);
            o1.setMininv(1);
            outsourcedPartRepository.save(o1);
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("out test"))thePart=part;
            }

            if (thePart != null) {
                System.out.println(thePart.getCompanyName());
            }

            OutsourcedPart o2 = new OutsourcedPart();
            o2.setCompanyName("Happy Electronics LLC");
            o2.setName("Happy S3 Mobile Charger");
            o2.setInv(10);
            o2.setPrice(15.0);
            o2.setId(1002L);
            o2.setMaxinv(47);
            outsourcedPartRepository.save(o2);
            thePart=null;
            outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("out test"))thePart=part;
            }

            if (thePart != null) {
                System.out.println(thePart.getCompanyName());
            }

            OutsourcedPart o3 = new OutsourcedPart();
            o3.setCompanyName("Happy Electronics LLC");
            o3.setName("HappyPad Charger");
            o3.setInv(19);
            o3.setPrice(20.0);
            o3.setId(1003L);
            outsourcedPartRepository.save(o3);
            thePart=null;
            outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("out test"))thePart=part;
            }

            if (thePart != null) {
                System.out.println(thePart.getCompanyName());
            }

            InhousePart i1 = new InhousePart();
            i1.setName("HappyPad Case");
            i1.setInv(8);
            i1.setPrice(5.0);
            i1.setId(1004L);
            inhousePartRepository.save(i1);
            InhousePart theinPart=null;
            List<InhousePart> inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
            for(InhousePart part:inhouseParts){
                if(part.getName().equals("in test"))theinPart=part;
            }
            if (theinPart != null) {
                System.out.println(theinPart.getName());
            }

            InhousePart i2 = new InhousePart();
            i2.setName("Happy S3 Mobile Case");
            i2.setInv(9);
            i2.setPrice(5.0);
            i2.setId(1005L);
            inhousePartRepository.save(i2);
            theinPart=null;
            inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
            for(InhousePart part:inhouseParts){
                if(part.getName().equals("in test"))theinPart=part;
            }
            if (theinPart != null) {
                System.out.println(theinPart.getName());
            }

        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        List<InhousePart> inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            System.out.println(part.getName()+" "+part.getName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if(productRepository.count() == 0){
            Product HappyPad = new Product("HappyPad",800.0,23);
            productRepository.save(HappyPad);

            Product HappyS3Phone = new Product("Happy S3 Phone",650.0,16);
            productRepository.save(HappyS3Phone);

            Product LenovoX1Laptop = new Product("Lenovo X1 Laptop",2200.0,20);
            productRepository.save(LenovoX1Laptop);

            Product HappyS2Phone = new Product("Happy S2 Phone",450.0,7);
            productRepository.save(HappyS2Phone);

            Product HappyBook = new Product("Happy Book",1200.0,5);
            productRepository.save(HappyBook);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
