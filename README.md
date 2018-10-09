# <user-example>

# 1. UserserverApplication.java
<img width="460" alt="userserverapplication" src="https://user-images.githubusercontent.com/37721713/46650767-c1d2eb00-cbd8-11e8-8e67-ced2cddee10a.PNG">



*@SpringBootApplication 

    -스프링부트 애플리케이션임을 나타내는 어노테이션을 의미


    -@Configuration, @EnableAutoConfiguration, @ComponentScan을 포함하는 의미를 갖는다. 


        @Configuration - 스프링의 자바 기반 구성 클래스를 지정한다. (스프링 컨테이너가 해당 클래스를 빈 정의의 소스로 사용한다는 의미)
                                             
                                             
        @EnableAutoConfiguration - classpath를 기반으로 ApplicationContext가 생성될 수 있도록 하는 역할.
                            
                            
        @ComponentScan - 메인클래스가 위치한 root package를 기본 속성으로 사용하여 자동으로 다른 컴포넌트 클래스들을 검색하여 빈으로 등록
                                             
                                             

*SpringApplication.run

    -스프링부트 애플리케이션을 실행시키는 메소드
    
    
*@Bean

    -클래스에 붙는 경우는 해당 클래스를 빈으로 등록, 메소드 위에 붙는 경우는 해당 메소드가 빈을 리턴한다는 의미
    

*CommanLineRunner

    -CommanLineRunner 인터페이스는 구동 시점에 실행되는 코드가 자바 문자열 아규먼트 배열에 접근해야 할 필요가 있는 
     경우에 사용한다. 이렇게 구현된 메소드가 먼저 실행되고, 이후 main 메소드의 run 메소드가 실행된다.

# 2. AccountController.java
<img width="460" alt="accountcontroller" src="https://user-images.githubusercontent.com/37721713/46650763-c13a5480-cbd8-11e8-95a6-9e8117c35ffd.PNG">


*@Autowired

    - @Autowired는 의존관계자동설정 어노테이션을 의미한다. Spring 설정 파일을 보고 자동으로 속성의 set 메서드에 해당하는 역할을 수행한다.
    
    
*@RequestMapping

    - 요청을 어떤 Controller, 어떤 메소드가 처리할지를 맵핑하기 위한 어노테이션
    
    
*@ResponseBody

    - @ResponseBody 어노테이션이 적용되어 있으면 메소드에서 리턴되는 값은 View 를 통해서 출력되지 않고 HTTP Response Body 에 직접 쓰여지게 된다.
      일반적으로는 JSON 또는 XML 형식이 가장 자주 사용된다.

    

*@PathVariable

    -@RequestMapping 어노테이션에 설정되어 있는 변수를 사용할 수 있도록 하는 것이 @PathVariable이다. @RequestMapping에서 설정된 이름과 같은 이름을 사용해야 한다.


# 3. AccounttService.java
<img width="460" alt="accountservice" src="https://user-images.githubusercontent.com/37721713/46650765-c13a5480-cbd8-11e8-8b8b-b9e324030b28.PNG">


*@Service

    - 해당 클래스가 Service 역할을 수행한다는 의미
      
      
*@Autowired

    - @Autowired는 의존관계자동설정 어노테이션을 의미한다. Spring 설정 파일을 보고 자동으로 속성의 set 메서드에 해당하는 역할을 수행한다.
    

# 4. AccounttRepository.java
<img width="460" alt="accountrepository" src="https://user-images.githubusercontent.com/37721713/46650764-c13a5480-cbd8-11e8-8b34-d9c7cd7e8139.PNG">


*@RepositoryRestResource

    - path를 지정하게 되면 해당 URL로 접근시 JPARepository에 저장되어 있는 Account에 대한 정보가 리턴된다.
    

*JpaRepository

    - Spring Data JPA에서 제공하는 JpaRepository 인터페이스를 상속하면, 지정된 Entity에 대한 기본적인 CRUD 기능이 제공된다.
    

# 5. Account.java
<img width="460" alt="account" src="https://user-images.githubusercontent.com/37721713/46650762-c0a1be00-cbd8-11e8-829c-cbf7f315755c.PNG">


*@Data

    - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode를 모두 포함하는 어노테이션
    

*@Entity

    - 해당 클래스가 엔터티임을 나타내는 어노테이션이다. 애플리케이션이 실행이 될 때 엔티티 자동검색을 통하여 
      이 어노테이션이 선언된 클래스들은 엔티티 빈으로 등록된다.


*@NoArgsConstructor

    - 파라미터가 없는 기본 생성자를 만들어주는 어노테이션
    
    
*@AllArgsConstructor

    - 모든 필드 값을 파라미터로 받는 생성자를 만들어 주는 어노테이션
   
   
*@Id

    - Spring Data JPA에서 Entity의 기본키를 의미한다.
    
    
*@GeneratedValue

    - 기본키를 자동으로 생성하기 위해 사용하는 어노테이션
    
    
*@Column

    - 필드와 테이블의 컬럼을 매핑시키며, length를 이용해 길이 지정이 가능하다.
    
    
# 6. application.yml
<img width="460" alt="application" src="https://user-images.githubusercontent.com/37721713/46650766-c13a5480-cbd8-11e8-9ca7-05928907ced7.PNG">
