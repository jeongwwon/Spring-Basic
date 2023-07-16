# Spring-Basic
<br>
!(https://agilemanifesto.org/iso/ko/manifesto.html)

## 좋은 객체 지향 설계의 5가지 원칙(SOLID)
<br>

### SRP(Single responsibility principle) 단일 책임 원칙 
1.한 클래스는 하나의 책임만 가져야한다.(문맥과 상황에 따라)<br>
2.중요한 기준은 변경이다.변경이 있을때 파급 효과가 적으면 단일 책임 원칙을 잘 따른 것<br>
<br><br>
### OCP(Open/closed principle) 개방-폐쇄 원칙
1.소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.<br>
다형성을 통한 객체 확장, 코드의 변경은 없는 것이 좋음 but, 원칙을 지킬수 없다. ->Spring container가 해결<br>
<br><br>
### LSP(Liskov substitution principle) 리스코프 치환 원칙
1.프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.<br> 다형성에서 하위 클래스는 인터페이스 규약을 다 지켜야 한다.
<br><br>
### ISP(Interface segregation principle) 인터페이스 분리 원칙
1.특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.<br> 
ex) 자동차 인터페이스 -> 운전,정비 인터페이스로 분리 
<br><br>
### DIP(Dependancy inversion principle) 의존관계 역전 원칙 
1.프로그래머는 "추상화에 의존해야지,구체화에 의존하면 안된다." 의존성 주입은 이 원칙을 따르는 방법 중 하나다.<br> -> 구현클래스에 의존하지 않고 인터페이스에 의존, 역할에 의존하게 해야 하는것과 같다.

<br><br>
결론:다형성 만으로는 OCP,DIP를 지킬수 없다. 무언가 더 필요하다.
