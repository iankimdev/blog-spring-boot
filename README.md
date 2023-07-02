# blog
springboot를 공부하기 위한 토이 프로젝트입니다.

## 기능
유저 인증 기능을 활용한 블로그

## 배포 URL
http://13.125.33.210:8080

## 프로젝트 구조
```
└── blog-spring-boot
    ├── Dockerfile
    └── src
        ├── main
        │   ├── java
        │   │   └── com
        │   │       └── example
        │   │           └── springbootblog
        │   │               ├── SpringBootBlogApplication.java
        │   │               ├── config
        │   │               │   ├── SeedData.java
        │   │               │   └── WebSecurityConfig.java
        │   │               ├── contorllers
        │   │               │   ├── HomeController.java
        │   │               │   ├── LoginController.java
        │   │               │   ├── PostController.java
        │   │               │   └── RegisterController.java
        │   │               ├── models
        │   │               │   ├── Account.java
        │   │               │   ├── Authority.java
        │   │               │   └── Post.java
        │   │               ├── repositories
        │   │               │   ├── AccountRepository.java
        │   │               │   ├── AuthorityRepository.java
        │   │               │   └── PostRepository.java
        │   │               └── services
        │   │                   ├── AccountService.java
        │   │                   ├── PostService.java
        │   │                   └── UserService.java
        │   └── resources
        │       ├── application.properties
        │       └── templates
        │           ├── 404.html
        │           ├── home.html
        │           ├── login.html
        │           ├── post.html
        │           ├── post_create.html
        │           ├── post_update.html
        │           └── register.html
        └── test
            └── java
                └── com
                    └── example
                        └── springbootblog
                            └── SpringBootBlogApplicationTests.java

```

