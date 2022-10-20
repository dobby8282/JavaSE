파일명 sqlScript.md

**0. User & Database 생성**

- mysql 접속
```
mysql -u root 
```
- 외부 접속 권한 주기
```
- grant all privileges on *.* to root@"%" identified by 'qwe123' with grant option;
```
- Database 생성
```
CREATE DATABASE hr;
```
- 원격접속용 MySql 계정
```
# CREATE USER 'name'@'ip' IDENTIFIED BY 'password';
CREATE USER 'scott'@'%' IDENTIFIED BY 'tiger';
```
- 해당 계정에 필요한 권한을 준다.
``` 
GRANT ALL PRIVILEGES ON *.* TO 'scott'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;
```

- Scott Tieger 스키마 
```

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 데이터베이스: `scott`
--

-- --------------------------------------------------------

--
-- 테이블 구조 `bonus`
--

CREATE TABLE IF NOT EXISTS `bonus` (
  `ENAME` varchar(10) DEFAULT NULL,
  `JOB` varchar(9) DEFAULT NULL,
  `SAL` double DEFAULT NULL,
  `COMM` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `bonus`
--


-- --------------------------------------------------------

--
-- 테이블 구조 `dept`
--

CREATE TABLE IF NOT EXISTS `dept` (
  `DEPTNO` int(11) NOT NULL,
  `DNAME` varchar(14) DEFAULT NULL,
  `LOC` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`DEPTNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `dept`
--

INSERT INTO `dept` (`DEPTNO`, `DNAME`, `LOC`) VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

-- --------------------------------------------------------

--
-- 테이블 구조 `emp`
--

CREATE TABLE IF NOT EXISTS `emp` (
  `EMPNO` int(11) NOT NULL,
  `ENAME` varchar(10) DEFAULT NULL,
  `JOB` varchar(9) DEFAULT NULL,
  `MGR` int(11) DEFAULT NULL,
  `HIREDATE` datetime DEFAULT NULL,
  `SAL` double DEFAULT NULL,
  `COMM` double DEFAULT NULL,
  `DEPTNO` int(11) DEFAULT NULL,
  PRIMARY KEY (`EMPNO`),
  KEY `PK_EMP` (`DEPTNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `emp`
--

INSERT INTO `emp` (`EMPNO`, `ENAME`, `JOB`, `MGR`, `HIREDATE`, `SAL`, `COMM`, `DEPTNO`) VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17 00:00:00', 800, NULL, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20 00:00:00', 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22 00:00:00', 1250, 500, 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02 00:00:00', 2975, NULL, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28 00:00:00', 1250, 1400, 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01 00:00:00', 2850, NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09 00:00:00', 2450, NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19 00:00:00', 3000, NULL, 20),
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17 00:00:00', 5000, NULL, 10),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08 00:00:00', 1500, 0, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1987-05-23 00:00:00', 1100, NULL, 20),
(7900, 'JAMES', 'CLERK', 7698, '1981-12-03 00:00:00', 950, NULL, 30),
(7902, 'FORD', 'ANALYST', 7566, '1981-12-03 00:00:00', 3000, NULL, 20),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23 00:00:00', 1300, NULL, 10);

-- --------------------------------------------------------

--
-- 테이블 구조 `salgrade`
--

CREATE TABLE IF NOT EXISTS `salgrade` (
  `GRADE` double DEFAULT NULL,
  `LOSAL` double DEFAULT NULL,
  `HISAL` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `salgrade`
--

INSERT INTO `salgrade` (`GRADE`, `LOSAL`, `HISAL`) VALUES
(1, 700, 1200),
(2, 1201, 1400),
(3, 1401, 2000),
(4, 2001, 3000),
(5, 3001, 9999);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `emp`
--
ALTER TABLE `emp`
  ADD CONSTRAINT `PK_EMP` 
  FOREIGN KEY (`DEPTNO`) REFERENCES `dept` (`DEPTNO`) ON DELETE SET NULL ON UPDATE CASCADE;
```

### DQL (Data Query Language)

**1.SELECT ==> 테이블 내의 데이터를 조회할 때 사용한다**

```
  [기본형식]
  SELECT 컬럼명1, 컬럼명2.....					.5
  FROM 테이블명					       	        .1
  WHERE 조건절							.2		
  GROUP BY 칼럼명						.3
  HAVING 조건절 (GROUP묶은 다음에 조건 줄 때	)		.4
  ORDER BY 칼럼명[ASC|DESC] => 오름차순 혹은 내림차순		.6
```


**(1) SELECT 사용**
- emo 테이블에서 사원번호, 사원이름, 직업을 출력하기.
```
select empno, ename, job from emp;
```


- emp 테이블에서 사원번호, 급여, 부서번호를 출력해보세요.
	단,급여가 많은 순서대로 출력
```
select empno,sal,deptno 
from emp 
order by sal desc;
```

- emp 테이블에서 사원번호, 급여, 입사일을 출력해보세요.
	단,급여가 적은 순서대로 출력
```
select empno,sal,hiredate
from emp
order by sal asc;
```

- emp 테이블에서 직업,급여를 출력해보세요.
단,직업명으로 오름차순,급여로 내림차순 정렬해서
```
select job,sal
from emp
order by job asc,sal desc;
```

**(2) WHERE 절 사용하기 (조건을 주어서 검색하고자 할 때)**

- emp 테이블에서 급여가 2000 이상인 사원의 사원번호, 사원이름, 급여 출력하기
```
select empno,ename,sal
from emp
where sal >= 2000;
```
- emp 테이블에서 부서번호가 10번인 사원들의 모든 정보를 출력하세요
```
select * 
from emp
where deptno = 10;
```
	
- emp 테이블에서 입사일이 '81/02/20'인 사원의 사원번호,이름,입사일을 출력해보세요
```
select empno,ename,hiredate
from emp
where hiredate = '81/02/20';
```

- emp 테이블에서 직업이 'SALESMAN'인 사람들의 이름,직업,급여를 출력해보세요
	단, 급여가 높은 순서대로
```
select ename,job,sal
from emp
where job = 'SALESMAN'
order by sal desc;
```

**(3)ALIAS 사용하기 (칼럼에 별칭 붙이기)**
```
select empno, ename as "no", ename as "na" from emp;
```

- 큰 따옴표 " " 생략 가능
```
select empno, ename as no, ename as na from emp;
```

- as와 큰 따옴표 " " 는 생략이 가능하다 (공백문자가 있으면 안됨 = > 사원 번호)
```
select empno no, ename na from emp;
```


**(4)연산자**  
	1) 산술 연산자 ( +, -, *, / )

- 부서번호가 10번인 사원들의 급여를 출력하되 10% 인상 된 금액으로 출력
```
-- 부동소수점 오류
select sal*1.1
from emp
where deptno = 10;

SELECT CAST(sal AS DECIMAL(10,2))*1.1
FROM emp
WHERE deptno = 10;

```

- 급여 비교하여 출력
```
select sal,sal*1.1 from emp;
```

- 칼럼명 바꿔서 출력
```
select sal s, sal*1.1 ups from emp;
```


  **2) 비교 연산자 (=, !=, > , < , >= , <= )**

- 급여가 3000이상인 사원들의 모든 정보를 출력하세요
```
select * from emp
where sal >= 3000;
```

- 부서번호가 30번이 아닌 사람들의 이름과 부서번호를 출력해보세요.
```
select ename, deptno
from emp
where deptno != 30;

select ename, deptno
from emp
where deptno <> 30;
```

**3) 논리 연산자 ( AND(&&), OR(||), NOT(!=) )**
	
- 부서번호가 10번이고 급여가 3000 이상인 사원들의 이름과 급여를 출력하세요
```
select ename,sal
from emp
where deptno = 10 and sal >= 3000;
```
- 직업이 SALESMAN 이거나 MANAGER인 사원의 사원번호와 부서번호를 출력하세요
```
select empno,deptno
from emp
where job='SALESMAN' or job='MANAGER';
```

**4) SQL 연산자 (IN,BETWEEN,LIKE,IN NULL,IS NOT NULL)**

**<1> IN 연산자 (OR 연산자와 비슷한 역할)**
- 부서번호가 10번이거나 20번인 사원번호와 이름, 부서번호를 출력하세요
```
select empno,ename,deptno
from emp
where deptno=10 or deptno=20;
```
- IN 연산자를 사용한다면?
```
select empno,ename,deptno
from emp
where deptno in(10,20)
```

**<2> BETWEEN A AND B (A와 B 사이의 데이터를 얻어온다)**   
- 급여가 1000과 2000 사이인 사원들의 사원번호, 이름, 급여를 출력하세요
```
select empno,ename,sal
from emp
where sal >= 1000 and sal <=2000;
```
- BETWEEN A AND B 연산자를 사용한다면?
```
select empno,ename,sal
from emp
where sal between 1000 and 2000;
```

- 사원이름이 FORD와 SCOTT 사이의 사원들의 사원번호, 이름을 출력하세요
```
select empno,ename
from emp
where ename between 'FORD' and 'SCOTT';
```


**<3> IS NULL (NULL인 경우 true), IS NOT NULL (NULL이 아닌 경우 true)**   
> *null이면 비교자체가 불가하다*

- 커미션이 NULL인 사원의 사원이름과 커미션을 출력하세요  
```
select ename,comm
from emp
where comm is null;
```

- 커미션이 NULL이 아닌 사원의 사원이름과 커미션을 출력해보세요
```
select ename,comm
from emp
where comm is not null;
```

**<4> EXISTS (데이터가 존재하면 true)**
- 사원이름이 'FORD'인 사원이 존재하면 사원의 이름과 커미션을 출력하기
```
select ename,comm
from emp
where exists(select ename from emp where ename='FORD');
```
**<5> LIKE 연산자(문자열 비교) 중요!! **

- 사원이름이 'J'로 시작하는 사원의 사원이름과 부서번호를 출력
```
select ename,deptno
from emp
where ename like 'J%';
```

- 사원이름에 'J'가 포함되는 사원의 사원이름과 부서번호를 출력
```
select ename,deptno
from emp
where ename like '%J%';
```

- 사원이름의 두 번째 글자가 'A'인 사원의 이름,급여,입사일을 출력하기
```
select ename,sal,hiredate from emp
where ename like '_A%';
```

- 사원이름이 'ES'로 끝나는 사원의 이름, 급여, 입사일을 출력해보세요
```
select ename,sal,hiredate
from emp
where ename like '%ES';
```

- 입사년도가 81년인 사원들의 입사일과 사원번호를 출력해보세요
```
select hiredate,empno
from emp
where hiredate like '1981%';


select hiredate,empno
from emp
where hiredate between '1981-01-01'
AND '1981-12-31'
```


**2. 함수 (FUNCTION)**
- 어떠한 일을 수행하는 기능으로써 주어진 인수를 재료로 처리를 하여 그 결과를 반환하는 일을 수행한다

- 함수의 종류

**1) 단일행 함수**
하나의 row 당 하나의 결과값을 반환하는 함수

**2)복수행 함수**
여러개의 row 당 하나의 결과값을 반환하는 함수


**(1) 단일행 함수**


**1)문자함수**


**<1> CONCAT(칼럼명,'붙일문자') => 문자열 연결함수**
```
SELECT CONCAT(ename,'님')from emp;

select concat(ename,'님') name from emp;
~님
     ~님
     ~님
```
**<2> LOWER('문자열') => 문자열을 소문자로 바꿔준다**
```
select lower ('HELLO!')from dual;
hello!
```
**<3> UPPER('문자열') => 문자열을 대문자로 바꿔준다**
```
select upper ('hello!') from dual;
HELLO!
```
**<4> LPAD('문자열', 전체 자리수, '남는 자리를 채울 문자') => 왼쪽에 채운다**
```
select lpad('HI',10,'*')from dual;
********HI
```

**<5> RPAD('문자열', 전체 자리수, '남는 자리를 채울 문자') => 오른쪽에 채운다**
```
select rpad('HELLO','15','^')from dual;
HELLO^^^^^^^^
```

**<6> REPLACE('문자열1','문자열2','문자열3')**
=> 문자열1에 있는 문자열 중 문자열2를 찾아서 문자열3으로 바꿔준다
```
select replace('hello mimi','mimi','mama')from dual;
hello mama
```

**<7> SUBSTR('문자열',N1,N2)**
=> 문자열의 N1번째 위치에서 N2개 만큼 문자열 빼오기
```
select substr('ABCDEFGHIJ',3,5)from dual;
```

ex> emp 테이블에서 ename(사원이름)의 두번째 문자가 'A'인 사원의 이름을 출력한다면?
```
select ename
from emp
where substr(ename,2,1)='A';


select ename 
from emp
where ename like '_A%';
```
**<8> ASCII('문자') => 문자에 해당하는 ASCII 코드 값을 반환한다**
```
select ascii('A')from dual;
```
**<9> LENGTH('문자열') => 문자열의 길이를 반환한다**
```
select length('ABCDE')from dual;
5
```
ex> EMP 테이블에서 사원이름이 5자 이상인 사원들의 사번과 이름을 출력해보세요
```
select empno,ename 
from emp
where length(ename) >= 5;
```
**<10> LEAST('문자열1','문자열2','문자열3') => 문자열 중에서 가장 작은 값을 리턴한다**
```
select least('AB','ABC','D')from dual;
AB
```
**<11> IFNULL(컬럼명,값) => 해당 칼럼이 NULL인 경우 정해진 값을 반환한다**
```
select ename,IFNULL(comm,0) from emp;
select ename,IFNULL(comm,100) C from emp; -- 100씩 커미션 주기
```

**2) 숫자 함수**


**<1> ABS(숫자) => 숫자의 절대값을 반환함 (음수를 양수로 반환)**
```
select abs(-10)from dual;
```
**<2> CEIL(소수점이 있는 수) => 파라미터 값보다 같거나 가장 큰 정수는 반환(올림)**
```
select ceil(3.1234) from dual;
select ceil(5.9999) from dual;
```
**<3> floor(소수점이 있는 수) => 파라미터 값보다 같거나 가장 작은 정수 반환(내림)**
```
select floor(3.2241) from dual;
select floor(2.888829) from dual;
```
**<4> ROUND(숫자,자리수) => 숫자를 자리수 +1번째 위치에서 반올림한다**
```
select round(3.22645,2) from dual;
select round(5.2345,3) from dual;
```
**<5> MOD (숫자1,숫자2) => 숫자1을 숫자2로 나눈 나머지를 리턴한다**
```
select mod(10,3) from dual;
```

**<6> TRUNCATE(숫자1,자리수) => 숫자1의 값을 소수점이하 자리수까지만 나타난다. 나머지는 잘라낸다**
```
select truncate(12.23532576,2) from dual;
```

**3) 날짜 함수 ( * 중요!! 자주 쓰인다 * )**

**<1> 현재 시간을 리턴**
```
-- 함수 시작 시점 값 반환
select sysdate() from dual; 
-- 쿼리가 완료되는 시점 값 반환
select now() from dual;

-- 리눅스 타임존 변경
sudo ln -sf /usr/share/zoneinfo/Asia/Seoul /etc/localtime
-- mysql 재시작
sudo service mysql restart
```
**<2> 날짜 계산 (날짜,더해질월)**
- 현재 시간에 1초 더하기
```
SELECT DATE_ADD(NOW(), INTERVAL 1 SECOND);
```
- 현재 시간에 1분 더하기
```
SELECT DATE_ADD(NOW(), INTERVAL 1 MINUTE);
```
- 현재 시간에 1시간 더하기
```
SELECT DATE_ADD(NOW(), INTERVAL 1 HOUR);
```
- 현재 시간에 1일 더하기
```
SELECT DATE_ADD(NOW(), INTERVAL 1 DAY);
```
- 현재 시간에 1달 더하기
```
SELECT DATE_ADD(NOW(), INTERVAL 1 MONTH);
```
- 현재 시간에 1년 더하기
```
SELECT DATE_ADD(NOW(), INTERVAL 1 YEAR);
```
- 현재 시간에 1년 빼기
```
SELECT DATE_ADD(NOW(), INTERVAL -1 YEAR);
```

**<3> LAST_DAY (날짜) => 해당날짜에 해당하는 달의 마지막 날짜를 반환한다**
```
select last_day(now()) from dual;
```

**<4> TIMESTAMPDIFF(단위,날짜1,날짜2) => 두 날짜 차이**
```
select empno, TIMESTAMPDIFF(YEAR, hiredate, NOW()) from emp;
```

**4) 날짜 형식 변환 함수 ( * 중요!!! * )**
-DATE_FORMAT
```
select DATE_FORMAT(NOW(),'%Y-%m-%d') from dual;
```

**5) 숫자 변환 함수**
```
select CAST('999' AS UNSIGNED)+1 from dual;
```

**6) 날짜 변환 함수**
```
select STR_TO_DATE('2012-12-12', '%Y-%m-%d') from dual;
```

**(6) 복수행(그룹) 함수  * 중요 **


**1) COUNT(칼럼명) => 해당 칼럼이 존재하는 row의 갯수를 반환
단, 저장된 데이터가 NULL인 칼럼은 세지 않는다. **
```
select count(ename)from emp;

select count(comm)from emp;

select count(*) from emp; -- 모든 행(row)의 갯수를 얻어온다
```

**2)SUM(칼럼명) => 해당 칼럼의 값을 모두 더한 값을 러턴한다.**
```
select sum(sal)from emp;
```
**3) AVG(칼럼명) => 해당 칼럼의 모든 값을 더한 후, row의 갯수로 나눈 평균값을 리턴한다. 단 NULL은 제외된다.**
```
select AVG(sal) from emp;

select AVG(comm) from emp;
```

ex) comm이 null인 사원도 평균에 포함시켜서 출력을 하려면?
hint : IFNULL()함수를 이용한다
```
select avg(IFNULL(comm,0)) from emp;
```
**4) MAX(칼럼명) => 최대값을 리턴한다**
```
select max(sal)from emp;
```
**5) MIN(칼럼명) => 최소값을 리턴한다**
```
select min(sal)from emp;
```
 
#### GROUP BY 기준필드 => 기준필드를 기준으로 그룹으로 묶는다

- 부서별 급여의 총합을 출력
```
select deptno, sum(sal) 
from emp
group by deptno;
```
- 부서별 급여의 평균값을 출력
```
select deptno, avg(sal)
from emp
group by deptno;
```
- 부서별 급여의 평균값을 반올림해서 소수첫째 자리 까지만 구해보세요
```
select deptno,round(avg(sal),1) 
from emp
group by deptno;
```

- 직업별 최대 급여를 구해보세요
```
select job,max(sal)
from emp
group by job;
```

- 급여가 1000인 이상인 사원들의 부서별 평균 급여의 반올림 값을 
부서번호로 내림 차순해서 출력해보세요
```
select deptno,round(avg(sal))
from emp
where sal >=1000
group by deptno	
order by deptno desc;
```
- 급여가 2000 이상인 사원들의 부서별 평균 급여의 반올림 값을 
평균급여의 반올림값으로 오름차순해서 출력해보세요
```
select deptno,round(avg(sal))
from emp
where sal >= 2000
group by deptno
order by round(avg(sal)) asc;
```
- 각 부서별 같은 업무를 하는 사람의 인원수를 구하여
부서번호,직업, 인원수를 출력해보세요
```
select deptno,job,count(*)
from emp
group by deptno,job;
```
- 급여가 1000인 이상인 사원들의 부서별 평균 급여를 출력해보세요
단, 부서별 평균 급여가 2000이상인 부서만 출력하세요
```
select deptno, avg(sal)
from emp
where sal >= 1000
group by deptno
having avg(sal) >= 2000;
```

**3.JOIN**
- 하나의 테이블로 원하는 칼럼정보를 참조 할 수 없는 경우, 관련된 테이블을 논리적으로 결합하여 원하는 칼럼정보를 참조하는 방법을 JOIN 이라고 한다
 
[ 형식 ]
SELECT 칼럼명1, 칼럼명2.....
FROM 테이블명1, 테이블명2.....
WHERE JOIN 조건 AND 다른 조건.....


- emp 테이블의 사원이름, 부서번호, 부서명을 출력해보세요
```
select ename,emp.deptno,dname
from emp
join dept
on emp.deptno = dept.deptno;
```

- 급여가 3000에서 5000 사이의 사원이름과 부서명을 출력해보세요
```
select ename,dname
from emp
join dept
on emp.deptno = dept.deptno
and sal between 3000 and 5000;
```

- 부서명이 ACCOUNTING인 사원의 이름,입사일,부서번호,부서명을 출력해보세요
```
select ename,hiredate,emp.deptno,dname
from emp
join dept
on emp.deptno = dept.deptno
and dname = 'ACCOUNTING';
 
select ename,hiredate,emp.deptno,dname
from emp,dept
where emp.deptno = dept.deptno
and dname = 'ACCOUNTING';

select e.ename,e.hiredate,e.deptno,d.dname
from emp e,dept d
where e.deptno = d.deptno
and dname = 'ACCOUNTING';
```

- 커미션이 null이 아닌 사원의 이름, 입사일, 부서명을 출력해보세요
```
select e.ename,e.hiredate,d.dname
from emp e
join dept d
on e.deptno = d.deptno 
and e.comm is not null;
```

- 각 사원의 이름과 매니저 이름을 출력하세요
```
select e1.ename,e2.ename
from emp e1
join emp e2
on e1.mgr = e2.empno;
```

**3) OUTER JOIN 조인**
- 한 쪽 테이블에는 해당하는 데이터가 존재하는데 다른 테이들에는 데이터가 존재하지 않을 때에도 모든 데이터를 추출하도록 하는 JOIN 방법

- 사원번호, 부서번호, 부서명을 출력해보세요
단, 사원이 근무하지 않는 부서 정보도 같이 출력해보세요
```
select e.empno,d.deptno,d.dname
from emp e
left outer join dept d
on e.deptno = d.deptno;
```


[ QUIZ ] 


**1. emp 테이블과 dept 테이블을 조인하여 부서번호,부서명,이름,급여를 출력해보세요**
```
select d.deptno,d.dname,e.ename,e.sal
from emp e,dept d;
```
**2. 사원의 이름이 'ALLEN'인 사원의 부서명을 출력해보세요**
```
select e.ename,d.dname
from emp e
join dept d
on e.deptno = d.deptno
and e.ename='ALLEN';
```

**3. 모든 사원의 이름, 부서번호, 부서명, 급여를 출력해보세요
단,emp테이블에 없는 부서도 출력해보세요**
```
select e.ename,d.deptno,d.dname,e.sal
from emp e
left outer join dept d
on e.deptno = d.deptno;
```

**4. 다음과 같이 모든 사원의 매니저를 출력해보세요**
 
SMITH 의 매니저는 FORD 입니다
??? 의 매니저는 ??? 입니다
.
.
.
.

```
select e1.emp||'의 매니저는 '||e2.emp||'입니다'
from emp e1
join emp e2
on e1.mgr = e2.empno;
```

**4. 서브 쿼리(Sub-Query)**
- 하나의 SQL 문장 절에 포함된 또 다른 SELECT 문장으로
  두 번 질의를 해야 얻을 수 있는 결과를 한 번의 질의로 해결이 가능하게 하는 쿼리

- 용어 Main-Query 또는 Outer-Query
       Sub-Query 또는 Inner-Query 두 쌍이 같은 의미이다

- 특징 - 괄호를 반드시 묶어야 한다
       - 서브쿼리는 메인쿼리의 다음 부분에 위치할 수 있다

       1) SELECT / DELETE / UPDATE 문의 FROM 절과 WHERE 절
       2) INSERT 문의 INTO 절
       3) UPDATE 문의 SET 절

- 종류
**<1> 단일행 서브쿼리**
 - 서브쿼리의 실행결과가 하나의 칼럼과 하나의 행안을 리턴해주는 쿼리
   (하나의 데이터만 리턴해주는 쿼리)

 - 사원번호가 7900번인 사원과 같은 직업을 갖는 사원의 사번과 이름을 출력해보세요
```
select job from emp where empno = 7900;


실행결과
job
----
CLERK

 
select empno,ename from emp where job = 'CLERK';
```
- 합치면?
```
select empno,ename
from emp
where job = (select job from emp where empno = 7900);
```

- 사원들의 평균 급여보다 급여를 많이 받는 사원들의 사원번호,이름,급여를 출력해보세요
```
select empno,ename,sal
from emp
where sal > (select avg(sal) from emp) ;
```

- 사원번호가 7369인 사원과 같은 부서인 사원들의 부서번호, 이름, 급여를 출력해보세요
```
select deptno, ename, sal
from emp
where deptno = (select deptno from emp where empno = 7369);
```

- 사원번호가 7900인 사원과 같은 부서이고, 사원번호가 7369번인 사원보다 많은 급여를 받는 
 사원의 이름,부서번호,급여를 출력해보세요	 
```
select ename,deptno,sal
from emp
where deptno = (select deptno from emp where empno = 7900)
and sal > (select sal from emp where empno = 7369);
```

- 각 부서의 최소 급여가 부서번호가 30번인 부서의 최소 급여보다 
많은 급여를 받는 부서의 부서번호, 최소 급여를 출력해보세요
```
select deptno,min(sal)
from emp
group by deptno
having min(sal) > (select min(sal) from emp where deptno = 30);
```

**<2> 다중행 서브쿼리**


-쿼리의 실행 결과가 여러 개의 칼럼이거나 여러 행을 리턴해주는 쿼리
-반드시 다중행 연산자와 함께 써야 한다
- IN : 하나라도 일치하면
- EXISTS : 하나라도 존재한다면

**<1> IN 연산자 (OR 연산자와 비슷한 역할)**  
 - 부서번호가 10번이거나 20번인 사원번호와 이름, 부서번호를 출력하세요
```
select empno,ename,deptno
from emp
where deptno=10 or deptno=20;
```
IN 연산자를 사용한다면?
```
select empno,ename,deptno
from emp
where deptno in(10,20);
```

**<2> EXISTS (데이터가 존재하면 true)**
 - 사원이름이 'FORD'인 사원이 존재하면 사원의 이름과 커미션을 출력하기  



-부서 번호가 10번인 사원들과 급여과 같은 급여를 받는 사원의 이름과 급여를 출력  
단, 10번 부서는 제외  
```
select ename,sal,deptno
from emp
where sal in(select sal from emp where deptno=10)
and deptno != 10;


select ename,sal,deptno
from emp
where sal in(select sal from emp where deptno=10)
and deptno <> 10;
```

- 부서번호가 10번인 사원들이 받는 급여보다 많은 급여를 받는 사원들의 이름과 급여를 출력해보세요
```
select ename,sal
from emp
where sal > any(select sal from emp where deptno=10);
```

- 부서번호가 10번인 사원들이 모든 사원들이 받는 급여보다 
많은 급여를 받는 사원의 이름과 급여를 출력해보세요
(한 명이라도 10번 부서의 사원보다 급여가 적으면 안된다)
```
select ename,sal
from emp
where sal > all (select sal from emp where deptno=10);
```

**<3> 다중 칼럼 서브쿼리**
- 서브쿼리의 실행 결과가 여러개의 칼럼을 리턴할 때 사용

- 부서번호가 30번인 사원들의 급여와 커미션이 같은 사원의 이름과 커미션을 출력해보세요
```
select ename,comm,deptno
from emp
where (sal,comm) in (select sal,comm from emp where deptno=30);
```

**<4> 상호 관련 서브쿼리 *****
- 메인 쿼리 절에서 사용된 테이블이 서브 쿼리절에 다시 재사용되는 경우의 서브 쿼리이다

- 사원 테이블에서 적어도 한 명의 사원으로부터 보고를 받을 수 있는 
  사원의 사원번호, 이름, 직업, 입사일을 출력해보세요

```
select empno,ename,job,hiredate
from emp e1
where exists (select * from emp e2 where e2.mgr=e1.empno);

select empno,ename,job,hiredate
from emp
where empno in (select mgr from emp group by mgr);

select empno,ename,job,hiredate
from emp
where empno in (select distinct(mgr)from emp);

select e1.empno,e1.ename,e1.job,e1.hiredate
from emp e1,emp e2
where e1.empno = e2.mgr;
```

**[2] DML (Data Manipulation Language)**
- 테이블 내의 데이터를 입력,수정,삭제

**1)INSERT : 테이블에 데이터를 저장할 때 사용**

**(1) 형식**
	INSERT INTO 테이블명 (칼럼명1,칼럼명2.....)
	VALUES(값1,값2.....)
**(2) 입력시 제약 사항**
 - 한 번에 하나의 행만 입력할 수 있다
 - INSERT 절에 명시되는 칼럼의 갯수와 VALUES 절의 갯수는 일치해야 한다
 - 모든 칼럼의 내용을 다 저장할 때는 칼럼명은 생략 가능하다
 - commit을 반드시 입력해야 한다

 ex)EMP 테이블에 아래와 같은 사원을 추가해보세요
 EMPNO : 8000
 ENAME : 이현진
 JOB : 방장
 MGR : 7900
 HIREDATE : 오늘
 SAL : 18
 COMM : 100
 DEPTNO : 40
 delete from emp2
 where(ename='');

 
- 연습용 테이블 만들기
```
create table member
	(
        num  int,
        name varchar(30),
        addr varchar(50),
        PRIMARY KEY (`num`)
	);
(primary : null,중복 허용하지 않음. ID 값을 입력할 수 있는 키)

insert into member values(1,'김구리','노량진');
insert into member values(2,'홍길동','우리집');
insert into member values(3,'나야나','동대문');
```


**2) update 문 :  데이터를 수정할 때 사용하는 문장**

**(1) 형식**
 update 테이블명 set 칼럼명1 = 수정값, 칼럼명2 = 수정값
 where 조건절

ex) member 테이블의 내용 중 num 칼럼이 3인 회원의 주소를 인천으로 수정하세요
```
update member set addr = '인천' where num = 3;
update member set name = '김태호' where num = 1;
```
ex) member 테이블의 내용 중 num 칼럼이 2인 회원의 이름과 주소를 '철수','강남'으로 바꿔보세요
```
update member set name='철수',addr = '강남' where num = 2;
```
**3) delete 문 :  데이터를 삭제할 때 사용하는 문장**

(1) 형식
delete from 테이블명 where 조건절

ex) member 테이블에서 주소가 '강남'인 회원의 정보를 삭제해보세요
```
delete from member where addr='강남'; 
```


**[3] TCL (Transaction Control Language)**
- DML 문이 실행되어 DBMS에 저장되거나 되돌리기 위래 실행되어야 하는 SQL문

**1) 트랜젝션**
- 분리되어서는 안되는 논리적 작업단위

ex) 자신의 통장에서 타인에게 송금한다고 가정을 한다면...?

<-트랜젝션의 시작->
-내 통장에서 금액이 빠져나간다
-수취인 통장에 돈이 입금된다
<-트랜젝션의 끝->


**(1)트랜젝션의 시작**
- DBMS에 처음 접속 하였을 때
- DML 작업을 한 후 COMMIT 혹은 ROLLBACK을 실행했을 때

**(2)끝**
- COMMIT이나 ROLLBACK이 실행되는 순간
- DB가 정상/비정상 종료될 때
- 작업(세션을 종료할 때)

**(3)TCL의 종류**
- COMMIT : SQL문의 결과를 영구적으로 DB에 반영
- ROLLBACK : SQL문의 실행결과를 취소할 때
- SAVEPOINT : 트랜젝션의 한지점에 표시하는 임시 저장점

```
ex)
-- 오토커밋 해제
SET AUTOCOMMIT = FALSE
insert into member values(4,'AAA','BBB');
savepoint mypoint;
insert into member values(5,'bbb','BBB');
insert into member values(6,'ccc','BBB');
rollback to savepoint mypoint;
commit;
```
	
**[4] DDL(Data Definition Language)**
- 데이터 베이스 내의 객체(테이블,시퀀스...) 등을 생성하고 변경하고 삭제하기 위해서 사용되는 SQL문

**1) DDL의 종류**

```
ex) 일반적인 테이블 생성

create table test(num int,name varchar(20)); -테이블생성
```
- 참고 - 
```
DESC test; --테이블 구조 보기
```
```
ex) 테이블 복사하기
create table dept2(deptno int,dname varchar(14),loc varchar(13));

ex) dept테이블을 dept2에 복사하기
insert into dept2 select * from dept;


ex) 테이블 복사하기2 (CTAS 기법) => 제약조건은 복사가 안된다
create table dept3 as select*from dept;

ex) 테이블의 구조만 복사하려면 (조건이 항상 거짓이 되는 편법사용)
create table dapt4 as select*from dept where 1=2;
```

**2) ALTER : 객체를 변경할 때**
```
desc simple;

ex) 
create table simple(num int);    --테이블 생성

alter table simple add(name varchar(3)); 
alter table simple modify column name varchar(30);
alter table simple drop column name;

alter table simple add(addr varchar(50)); 
alter table simple modify column name varchar(30);
alter table simple modify column addr varchar(100);
alter table simple drop column addr;
```

**3) DROP :  객체를 삭제할 때**
```
drop table dept2;
drop table dept3;
drop table dept4;
drop table simple;
```
