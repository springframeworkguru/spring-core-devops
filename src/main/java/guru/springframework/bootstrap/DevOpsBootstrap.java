package guru.springframework.bootstrap;

import guru.springframework.domain.Author;
import guru.springframework.domain.Product;
import guru.springframework.domain.ProductCategory;
import guru.springframework.repositories.AuthorRepository;
import guru.springframework.repositories.ProductCategoryRepository;
import guru.springframework.repositories.ProductRepository;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by jt on 5/6/16.
 */
@Component
public class DevOpsBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private ProductCategoryRepository productCategoryRepository;
    private ProductRepository productRepository;

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Autowired
    public void setProductCategoryRepository(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        if(IteratorUtils.toList(authorRepository.findAll().iterator()).size() == 0) {

            Author jt = new Author();
            jt.setFirstName("John");
            jt.setLastName("Thompson");
            jt.setId(1);
            jt.setImage("instructor_jt.jpg");

            jt = authorRepository.save(jt);

            ProductCategory springIntroCat = new ProductCategory();
            springIntroCat.setId(1);
            springIntroCat.setCategory("Spring Introduction");

            springIntroCat = productCategoryRepository.save(springIntroCat);

            ProductCategory springCoreCat = new ProductCategory();
            springCoreCat.setId(2);
            springCoreCat.setCategory("Spring Core");

            springCoreCat = productCategoryRepository.save(springCoreCat);

            ProductCategory springBootCat = new ProductCategory();
            springBootCat.setId(3);
            springBootCat.setCategory("Spring Boot");

            springBootCat = productCategoryRepository.save(springBootCat);

            ProductCategory thymeleafCat = new ProductCategory();
            thymeleafCat.setId(4);
            thymeleafCat.setCategory("Thymeleaf");

            thymeleafCat = productCategoryRepository.save(thymeleafCat);

            ProductCategory geapCat = new ProductCategory();
            geapCat.setId(5);
            geapCat.setCategory("G.E.A.P");

            geapCat = productCategoryRepository.save(geapCat);

            Product springIntro = new Product();
            springIntro.setId(1);
            springIntro.setCourseName("Introduction to Spring");
            springIntro.setCourseSubtitle("Start Learning Spring!");
            springIntro.setAuthor(jt);
            springIntro.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                    "\n" +
                    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                    "\n" +
                    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
            springIntro.setPrice(new BigDecimal("0"));
            springIntro.setImageUrl("SpringIntroThumb.png");
            springIntro.getProductCategories().add(springIntroCat);
            springIntro.getProductCategories().add(springBootCat);

            springIntro = productRepository.save(springIntro);

            Product springCoreUltimate = new Product();
            springCoreUltimate.setId(2);
            springCoreUltimate.setCourseName("Spring Core Ultimate");
            springCoreUltimate.setCourseSubtitle("Ultimate Bundle of Spring Core!");
            springCoreUltimate.setAuthor(jt);
            springCoreUltimate.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                    "\n" +
                    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                    "\n" +
                    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
            springCoreUltimate.setPrice(new BigDecimal("199"));
            springCoreUltimate.setImageUrl("SpringCoreUltimateThumb.png");
            springCoreUltimate.getProductCategories().add(springCoreCat);
            springCoreUltimate.getProductCategories().add(springBootCat);

            springCoreUltimate = productRepository.save(springCoreUltimate);

            Product thymeleaf = new Product();
            thymeleaf.setId(3);
            thymeleaf.setCourseName("Thymeleaf");
            thymeleaf.setCourseSubtitle("Thymeleaf and Spring!");
            thymeleaf.setAuthor(jt);
            thymeleaf.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                    "\n" +
                    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                    "\n" +
                    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
            thymeleaf.setPrice(new BigDecimal("199"));
            thymeleaf.setImageUrl("ThymeleafThumb.png");
            thymeleaf.getProductCategories().add(thymeleafCat);

            thymeleaf = productRepository.save(thymeleaf);

            Product springCore = new Product();
            springCore.setId(4);
            springCore.setCourseName("Spring Core");
            springCore.setCourseSubtitle("Spring Core - mastering Spring!");
            springCore.setAuthor(jt);
            springCore.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                    "\n" +
                    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                    "\n" +
                    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
            springCore.setPrice(new BigDecimal("199"));
            springCore.setImageUrl("SpringCoreThumb.png");
            springCore.getProductCategories().add(springCoreCat);
            springCore.getProductCategories().add(springBootCat);

            springCore = productRepository.save(springCore);

            Product springCoreAdv = new Product();
            springCoreAdv.setId(5);
            springCoreAdv.setCourseName("Spring Core Advanced");
            springCoreAdv.setCourseSubtitle("Advanced Spring Core!");
            springCoreAdv.setAuthor(jt);
            springCoreAdv.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                    "\n" +
                    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                    "\n" +
                    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
            springCoreAdv.setPrice(new BigDecimal("199"));
            springCoreAdv.setImageUrl("SpringCoreAdvancedThumb.png");
            springCoreAdv.getProductCategories().add(springCoreCat);
            springCoreAdv.getProductCategories().add(springBootCat);

            springCoreAdv = productRepository.save(springCoreAdv);

            Product springCoreDevOps = new Product();
            springCoreDevOps.setId(6);
            springCoreDevOps.setCourseName("Spring Core Dev-Ops");
            springCoreDevOps.setCourseSubtitle("Deploying Spring in the Enterprise and the cloud!");
            springCoreDevOps.setAuthor(jt);
            springCoreDevOps.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                    "\n" +
                    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                    "\n" +
                    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.");
            springCoreDevOps.setPrice(new BigDecimal("199"));
            springCoreDevOps.setImageUrl("SpringCoreDevOpsThumb.png");
            springCoreDevOps.getProductCategories().add(springCoreCat);
            springCoreDevOps.getProductCategories().add(springBootCat);

            springCoreDevOps = productRepository.save(springCoreDevOps);
        }
    }
}
