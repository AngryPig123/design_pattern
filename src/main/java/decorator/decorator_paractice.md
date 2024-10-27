## 문제 1: 피자 주문 시스템

```
기본 기능: Pizza라는 기본 인터페이스가 있고, 다양한 피자 종류(예: Margherita, Pepperoni)가 있습니다.
데코레이터 기능: 피자에 토핑(예: Cheese, Olives, Peppers)을 추가할 수 있습니다.
요구사항: 토핑이 추가될 때마다 피자의 설명과 가격이 업데이트되어야 합니다.
```


```
테스트 케이스:
Margherita 피자에 Cheese와 Olives를 추가하면 설명이 "Margherita, Cheese, Olives"로 출력되고, 가격이 합산됩니다.
Pepperoni 피자에 Peppers를 추가하면 설명이 "Pepperoni, Peppers"로 출력되고, 가격이 합산됩니다.
```

--- 

## 문제 2: 문서 편집기 기능 추가

```
기본 기능: TextDocument라는 인터페이스가 있으며, 문서를 나타내는 기본 클래스가 있습니다.
데코레이터 기능: 문서에 기능(예: SpellCheck, AutoCorrect, GrammarCheck)을 동적으로 추가할 수 있습니다.
요구사항: 기능이 추가될 때마다 문서의 설명에 해당 기능이 포함되며, 동작이 바뀝니다.
```

```
TextDocument에 SpellCheck와 GrammarCheck를 추가했을 때 설명이 "TextDocument, SpellCheck, GrammarCheck"로 출력됩니다.
AutoCorrect 기능이 추가된 TextDocument가 작성된 문장을 자동으로 교정하는지 확인합니다.
```

---

## 문제 3: 온라인 쇼핑 장바구니 할인 시스템

```
기본 기능: Cart라는 인터페이스가 있으며, 기본 장바구니 클래스가 있습니다.
데코레이터 기능: 장바구니에 할인 기능(예: SeasonalDiscount, MemberDiscount, CouponDiscount)을 동적으로 추가할 수 있습니다.
요구사항: 할인이 추가될 때마다 장바구니의 총액이 업데이트되어야 합니다.
```


```
Cart에 SeasonalDiscount와 CouponDiscount를 추가했을 때 최종 금액이 두 할인 적용 후의 값과 같은지 확인합니다.
MemberDiscount가 적용된 장바구니의 설명이 "Cart, MemberDiscount"로 출력되는지 확인합니다.
```