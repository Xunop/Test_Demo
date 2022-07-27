# Test_Demo
SAST.2022 后端免试题Demo

文件结构

├─.idea                                   idea的文件夹，不用管
│  └─libraries                            
├─src           						
│  ├─main                                 main目录为主要编写代码的区域
│  │  ├─java                              用于存放代码
│  │  │  └─com
│  │  │      └─example
│  │  │          └─demo
│  │  │              ├─controller         controller层
│  │  │              ├─mapper             mapper层（也叫dao层）
│  │  │              └─service            service层
│  │  └─resources                         用于存放资源文件、配置文件等
│  │      ├─mapper                        存放mapper映射文件
│  │      ├─static
│  │      └─templates
│  └─test                                 测试专用文件夹，不用管
│      └─java          
│          └─com
│              └─example
│                  └─demo
└─target                                  项目编译后生成的target文件夹，不用管
    ├─classes
    │  ├─com
    │  │  └─example
    │  │      └─demo
    │  │          ├─controller
    │  │          ├─mapper
    │  │          └─service
    │  └─mapper
    ├─generated-sources
    │  └─annotations
    ├─generated-test-sources
    │  └─test-annotations
    └─test-classes
        └─com
            └─example
                └─demo
                
建表语句
```sql
CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pro_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
