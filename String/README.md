## String
> Q2743

알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

문자열이 영어로만 이루어져 있는지 판별하는법
```java
import java.util.regex.Pattern;
public class BootSpringBootApplication {
  public static void main(String[] args) {
    String s1 = "abcd";
    System.out.println(Pattern.matches("^[a-zA-Z]*$", s1)); # true
  }
}
```
