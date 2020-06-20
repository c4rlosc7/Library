# 📕 📗 📙 [Library](https://github.com/markdown-it/markdown-it-emoji)

The library is a room containing collections of __books__, __periodicals__, for use, or borrowing by the public or the __members__ of an institution. It provides physical or digital access to material and maybe a physical location or a virtual space, or both. A library's collection can include __books__, __periodicals__, __newspapers__, __manuscripts__, __films__, __maps__, __prints__, __documents__, __microform__, __CDs__, __cassettes__, __videotapes__, __DVDs__, __Blu-ray__ __Discs__, __e-books__, __audiobooks__, __databases__, and other formats.

## 💻 [Clean Architecture](https://github.com/markdown-it/markdown-it-emoji)

```bash
├── app
|   ├──book
|   |   ├── infrastructura
|   │   │   ├── settings
|   │   │   |   ├── SettingsBean.java
|   │   │   ├── controller
|   │   │   |   ├── commands
|   │   │   |   |   ├── ControllerCommandsBook.java
|   │   │   |   ├── queries
|   │   │   |   |   ├── ControllerQueriesBook.java
|   │   │   ├── persistence
|   │   │   |   ├── adapter
|   │   │   |   |   ├── dao
|   │   │   |   |   |   ├── DaoBookInMemory.java
|   │   │   |   ├── entidad
|   │   │   |   |   ├── EntityBook.java
|   │   │   |   ├── jpa
|   │   │   |   |   ├── JPABook.java
|   │   │   |   ├── mapper
|   │   │   |   |   ├── MapperBook.java
|   │   ├── application
|   │   │   ├── factory
|   │   │   |   ├── FactoryBook.java
|   │   │   ├── handler
|   │   │   |   ├── HandlerListBooks.java
|   │   ├── domain
|   │   │   ├── model
|   │   │   |   ├── dto
|   │   │   |   ├── entities
|   │   │   ├── port
|   │   │   |   ├── dao
|   │   │   |   ├── repository
|   │   │   ├── repository
|   │   │   |   ├── RepositoryBook.java
|   │   │   ├── services
|   │   │   |   ├── ServiceListBook.java
|   │   └── ApiApplication.java
├── pom.xml
├── JenkinsFile
├── sonar-project.properties
├── .gitignore
└── README.md
```

# 💿 [Application Properties](https://github.com/markdown-it/markdown-it-emoji)
```bash
server.port: 8081
server.servlet.context-path: /books

# H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2
spring.datasource.url=jdbc:h2:mem:~/books
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.platform=h2

# Datasource
#spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.hibernate.ddl-auto = update
spring.datasource.initialize=true
```

# 📖 [Books List JSON](https://github.com/markdown-it/markdown-it-emoji)

```json
[
    {
        "id": 1,
        "isbn": "9781593275846",
        "title": "Eloquent JavaScript, Second Edition",
        "subtitle": "A Modern Introduction to Programming",
        "author": "Marijn Haverbeke",
        "published": "2014-12-14T00:00:00.000Z",
        "pages": 472,
        "type": "book",
        "description": "JavaScript lies at the heart of almost every modern web application.",
        "website": "http://eloquentjavascript.net/",
        "state": "available"
    },
    {
        "id": 2,
        "isbn": "9781449331818",
        "title": "Learning JavaScript Design Patterns",
        "subtitle": "A JavaScript and jQuery Developer Guide",
        "author": "Addy Osmani",
        "published": "2014-12-14T00:00:00.000Z",
        "pages": 472,
        "type": "book",
        "description": "JavaScript lies at the heart of almost every modern web application.",
        "website": "http://eloquentjavascript.net/",
        "state": "available"
    },
    {
        "id": 3,
        "isbn": "9781449365035",
        "title": "The branching model",
        "subtitle": "A successful Git branching model",
        "author": "Axel Rauschmayer",
        "published": "2017-12-14T00:00:00.000Z",
        "pages": 472,
        "type": "paper",
        "description": "This model was conceived in 2010, now more than 10 years ago, and not very long after Git itself came into being.",
        "website": "https://nvie.com/posts/a-successful-git-branching-model/",
        "state": "available"
    }
]
```