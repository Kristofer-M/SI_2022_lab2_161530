# Втора лабораториска вежба по софтверско инжинерство
Кристофер Младеновски, индекс: 161530

![alt text](https://i.imgur.com/AhQQT2Z.png)


## Цикломатската комплексност
Цикломатската комплексност на оваа програма е 7. Бројот го добив со формулата P + 1, каде што P е бројот на предикатни јазли.

## Every Statement тест случаи

```new ArrayList(-1)``` Со овој случај поминуваме низ "List length should be greater than 0" exception.

```new ArrayList(5)``` Со овој случај поминуваме низ "List length should be a perfect square" exception.

```{"0", "#", "0", "#", "0", "#", "0", "#", "#","0", "0", "0","0","0", "0","0"}``` Со овој случај (листа од стрингови) минуваме низ секој друг јазол што не е опфатен од другите, како што може да се види од долунаведениот Excel screenshot.

![alt text](https://i.imgur.com/Pko1oNL.png)

## Every Branch тест случаи

Со истите случаи како и со Every Statement можеме да поминеме низ секое ребро на Control Flow Graph-от на програмата, како што може да се види од долунаведениот Excel screenshot.

![alt text](https://i.imgur.com/8E7CNxr.png)
