# 🎂 CandleLight (캔들라이트) 🎂

‘남’이 아닌 ‘나’가 주체가 되어 ‘나’에게 중요한 나날들을 온전하게 기념할 수 있는 서비스. 나만의 기념일을 촛불로 표현하여, 카테고리 별 ‘케이크’에 ‘촛불’을 켜나갑니다.

<br/>

</div>

## ✨ CandleLight 주요 기능 

<h3> 1️⃣ 촛불 생성(기념일 생성 및 기록) </h3>
<!-- <img src=""  alt="기능1-대표이미지" /> -->
<div >유저에게 소중한 기념일을 생성하고, 그날의 제목/카테고리/기분/설명을 입력한다.

입력을 완료하면 해당 카테고리 테마에 있는 케이크에 촛불이 생성된다.  <br/></div>

<h3> 2️⃣ 기록 열람 </h3>
<!-- <img src=""  alt="기능1-대표이미지" /> -->
<div >카테고리별로 생성된 촛불을 클릭하여 기록을 열람할 수 있다.
’촛불에 다시 불붙이기’를 통해 마지막 확인 일자를 업데이트할 수 있다.  <br/></div>

<h3> 3️⃣ 케이크(기록 목록) </h3>
<!-- <img src=""  alt="기능1-대표이미지" /> -->
<div >케이크의 카테고리를 생성할 수 있다.
케이크에 켜진 촛불은 마지막 확인 일자로부터 경과한 기일에 따라 상태가 변화한다..  <br/></div>

<br>

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
<img width="1408" alt="스크린샷 2023-11-26 오전 1 19 19" src="https://github.com/DOSOPT-SOPKATHON-WEB4/Server/assets/75068759/b65b4c7f-2629-4c67-80e7-6ed7f5b608d6">


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

