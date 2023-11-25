# 🍿 서비스명 🍿

서비스 소개


## 🧑‍💻 Developers

| 최영린 | 신민철 | 
| :---: | :---: | 
|![영린](https://github.com/DOSOPT-SOPKATHON-WEB4/Server/assets/48898994/28643663-0a82-4515-981e-bfa6f23d100c) |![민철1](https://github.com/DOSOPT-SOPKATHON-WEB4/Server/assets/48898994/f9c5b02b-53b3-4779-b492-298d4f61bbcd) | 
| [0lynny](https://github.com/0lynny) | [its-sky](https://github.com/its-sky) |
|  |  | 

### 🌳 Git Branch 전략
[Git Branch 전략](https://naver.github.io/hackday-conventions-java/) 


### 💬 Code Convention
[Code Convention](https://naver.github.io/hackday-conventions-java/)   

### 🌳 Commit Convention

```swift
[prefix] #이슈번호 - 이슈 내용
```
```bash
[Feat]: 새로운 기능 구현
[Fix]: 버그, 오류 해결, 코드 수정
[Add]: Feat 이외의 부수적인 코드 추가
[Del]: 쓸모없는 코드, 주석 삭제
[Refactor]: 전면 수정이 있을 때 사용합니다
[Remove]: 파일 삭제
[Chore]: 그 이외의 잡일/ 버전 코드 수정, 패키지 구조 변경, 파일 이동, 파일이름 변경
[Docs]: README나 WIKI 등의 문서 개정
```

### 📁 Foldering
```
├─🗂️ main
│  ├─🗂️ java
│  │  └─🗂️ org
│  │      └─🗂️ sopt
│  │          └─🗂️ sopt
│  │              ├─🗂️ controller
│  │              ├─🗂️ domain
│  │              ├─🗂️ dto
│  │              │  └─🗂️ request
│  │              │  └─🗂️ response
│  │              ├─🗂️ global
│  │              │  └─🗂️ config
│  │              │  └─🗂️ exception
│  │              │  └─🗂️ response
│  │              ├─🗂️ repository
│  │              └─🗂️ service
│  └─🗂️ resources
│      ├─static
│      └─templates
├─🗂️ test
```

## 🔗 ERD

<img width="1097" alt="image" src="https://github.com/DOSOPT-SOPKATHON-WEB4/Server/assets/48898994/7132da9c-eacf-453d-94c4-c7f2a8573222">


## 📄 API 명세서

[API 명세서](https://snapdragon-desk-8fd.notion.site/aa15858aa903416983d6cf37d81301da?v=b60d53bc1d62431e9cfc179baedd565a&pvs=4)

## 🛠️ Tech
| 사용기술 |     |
| --- | --- |
| Spring 버전 | 3.1.6 |
| 데이터베이스 | AWS RDS(MySQL) |
| Deply | AWS EC2(Ubuntu) |
| Build Tool | Gradle |
| ERD | ERDCloud, MySQL Workbench |
| Java version | Java 17 |


## 🛠️ 실행 방법
./gradlew clean build -x test


## 🔨 Architecture

![image](https://github.com/DOSOPT-SOPKATHON-WEB4/Server/assets/48898994/8afd6551-b832-4954-9aed-4d13da8950ab)

