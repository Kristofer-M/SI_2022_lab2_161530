# Втора лабораториска вежба по софтверско инжинерство
Кристофер Младеновски, индекс: 161530

## Control Flow Graph

![alt text](https://i.imgur.com/AhQQT2Z.png)


## Цикломатската комплексност
Цикломатската комплексност на оваа програма е 7. Бројот го добив со формулата P + 1, каде што P е бројот на предикатни јазли.

## Every Statement тест случаи

```new ArrayList(0)``` Со овој случај поминуваме низ "List length should be greater than 0" exception.

```new ArrayList(5)``` Со овој случај поминуваме низ "List length should be a perfect square" exception.

```{"0", "#", "0", "#", "0", "#", "0", "#", "#","0", "0", "0","0","0", "0","0"}``` Со овој случај (листа од стрингови) минуваме низ секој друг јазол што не е опфатен од другите, како што може да се види од долунаведениот Excel screenshot.

![alt text](https://i.imgur.com/5EBMVir.png)

## Every Branch тест случаи

Со истите случаи како и со Every Statement можеме да поминеме низ секое ребро на Control Flow Graph-от на програмата, како што може да се види од долунаведениот Excel screenshot.

![alt text](https://i.imgur.com/eLqt0GH.png)

## Unit Tests

Бидејќи Every Statement и Every branch случаевите се покриени со истите тестови, потребен беше само еден тест, кој што има 3 asserts, првиот ассерт е 

```
ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(new ArrayList(0)));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
```

Овој тест проверува кој Exception е фрлен кога тестот е поминат, и ако тој Exception ја има пораката "List length should be greater than 0" тогаш тестот е успешен.

Вториот assert исто така е assert за Exception, проверуваме дали повиканиот Exception ја има пораката "List length should be greater than 0".

```
ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(new ArrayList(5)));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
```

Третиот assert проверува дали ќе ја добиеме очекуваната листа од елементи откако функцијата ќе ја обработи дадената листа како input.

```
assertEquals(SILab2.function(new ArrayList(Arrays
                        .asList("0", "#", "0", "#", "0", "#", "0", "#", "#", "0", "0", "0", "0", "0", "0", "0"))),
                new ArrayList(Arrays.asList("1", "#", "2", "#", "2", "#", "2", "#", "#", "2", "0", "1", "1", "0", "0", "0")));
```


