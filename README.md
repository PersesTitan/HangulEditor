# HangulEditor
# 뷁어 번역기

코드
```java
String text1 = JapanRecovery.change("귦궫궢");
String text2 = JapanRecovery.change("궇궶궫");
String text3 = JapanRecovery.change("궺궞");

System.out.println(text1);
System.out.println(text2);
System.out.println(text3);
```

출력
```
わたし
あなた
ねこ
```

# HangulSplitItem
한글 1글짜를 저장하는 객체로 해당 클래스로 관리하면 자음, 모음을 분리해서 관리할 수 있습니다.
## 상수
```java
public final static char ㄹㄱ = 'ㄺ';
public final static char ㄹㅁ = 'ㄻ';
public final static char ㄱㅅ = 'ㄳ';
public final static char ㄴㅈ = 'ㄵ';
public final static char ㄴㅎ = 'ㄶ';
public final static char ㄹㅂ = 'ㄼ';
public final static char ㄹㅅ = 'ㄽ';
public final static char ㄹㅌ = 'ㄾ';
public final static char ㄹㅍ = 'ㄿ';
public final static char ㄹㅎ = 'ㅀ';
public final static char ㅂㅅ = 'ㅄ';
```

## 메소드
### 프로퍼티
#### setFirst
초성을 입력을 하는 로직 입니다.
메개변수 (char, int)
int일때 
```
'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ','ㅅ',
'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
```
의 순서의 값이 세팅됩니다.

#### setSecond
중성을 입력을 하는 로직 입니다.
메개변수 (char, int)
int일때 
```
'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ' ,'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 
'ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ' ,'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'
````
의 순서의 값이 세팅됩니다.

#### setThread
종성을 입력을 하는 로직 입니다.
메개변수 (char, int)
int일때 
```
' ','ㄱ','ㄲ','ㄳ','ㄴ','ㄵ','ㄶ','ㄷ','ㄹ','ㄺ','ㄻ','ㄼ','ㄽ',
'ㄾ','ㄿ','ㅀ','ㅁ','ㅂ','ㅄ','ㅅ','ㅆ','ㅇ','ㅈ','ㅊ','ㅋ',
'ㅌ','ㅍ','ㅎ'
```
의 순서의 값이 세팅됩니다.

### 예시
```java
HangulSplitItem word1 = new HangulSplitItem('안');
System.out.println(word1.getFirst());
System.out.println(word1.getSecond());
System.out.println(word1.getThread());
System.out.println(word1.getWord());

word1.setFirst('ㄱ');
System.out.println(word1.getWord());
```
코드
```
ㅇ
ㅏ
ㄴ
안
간
```

# HangulEditor
## isOnlyHangul(String)
한글만 있다면 true를 반환하고 아니면 false를 반환합니다.

## isInOnlyHangul(String)
한글이 포함되어 있다면 true를 반환하고 false를 반환합니다.

```
System.out.println(HangulEditor.isOnlyHangul("안녕"));
System.out.println(HangulEditor.isOnlyHangul("aa안녕"));

System.out.println(HangulEditor.isInOnlyHangul("aa안녕"));
System.out.println(HangulEditor.isInOnlyHangul("abc"));
```

```
true
false
true
false
```

## randomHangul()
한글을 램던으로 16자리를 반환합니다.
```
System.out.println(HangulEditor.randomHangul());
```
```
팊깉벭끪빊웓뽵쮴뵌웮룎톝웥뽋풞쐬
```

## randomHangul(int)
매개변수 갯수의 길이 많큼 램던으로 반환합니다.
```
System.out.println(HangulEditor.randomHangul(4));
```
```
췎삺햜내
```

## splitHangul(char)
HangulSplitItem를 생성하여 반환합니다.
```java
System.out.println(HangulEditor.splitHangul('안').getFirst());
```
```
ㅇ
```

## splitHangul(String)
List<HangulSplitItem\>를 생성하여 반환합니다.
```java
System.out.println(HangulEditor.splitHangul('안').getFirst());
for (HangulSplitItem item : HangulEditor.splitHangul("안녕하세요.")) {
      System.out.println(item.getFirst());
}
```
출력
```
ㅇ
ㄴ
ㅎ
ㅅ
ㅇ
.
```
