# e-commerce_project

## 개요
zerobase e-commerce project

Use : Spring, Jpa, Mysql, Redis, Docker, AWS

Goal : 셀러와 구매자 사이를 중개해 주는 커머스 서버를 구축한다.


## 회원
### 공통
- [x] 이메일을 통해서 인증번호를 통한 회원가입

### 고객
- [x] 회원 가입
- [x] 인증 (이메일)
- [x] 로그인 토큰 발행
- [x] 로그인 토큰을 통한 제어 확인(JWT, Filter를 사용해서 간략하게 )
- [x] 예치금 관리

### 셀러
- [x] 회원가입


## 주문 서버
### 셀러
- [x] 상품 등록, 수정
- [x] 상품 삭제

### 구매자
- [x] 장바구니를 위한 Redis 연동
- [ ] 상품 검색 & 상세 페이지
- [x] 장바구니에 물건 추가
- [x] 장바구니 확인
- [x] 장바구니 변경
- [ ] 주문하기
- [ ] 주문내역 이메일로 발송하기
