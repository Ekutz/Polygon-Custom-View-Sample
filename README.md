# 다각형 뷰 만들기

![example](https://github.com/Ekutz/Polygon-Custom-View/blob/master/example.gif?raw=true)

뷰를 화면에 배치하다보면 뷰가 보여야할 영역 때문에 여러가지 추가적인 코드가 필요할 때가 있다. 그러면 코드도 길어지게 되고 지저분한 클래스를 쓸 수 밖에 없다. 순서 배치만으로 영역의 크기를 손 쓸 수 없는 경우도 꽤 있다. 이러한 불편함을 제거하기 위해 뷰가 보여야할 영역 자체를 커스텀 해본다.

## 커스텀 뷰

기존에 존재하는 뷰를 상속받는 새로운 클래스를 생성하고 뷰의 특정 기능을 바꾸어 새로운 기능을 추가한 뷰. 그야말로 커스터마이징한 뷰이다. 대다수의 라이브러리들은 이러한 커스텀 뷰를 포함하여 만들어진다.

## 캔버스 개념

디자인을 공부해봤다면 쉽게 알수 있겠지만 어떠한 그림이나 영상이 사각형으로 차지하고 있는 전체 화면을 뜻한다.

![3](https://github.com/Ekutz/Polygon-Custom-View/blob/master/3.png?raw=true)

위 그림에서 src 주변에 파란 네모 상자가 보일 것이다. 투명한 부분과 이미지를 포함한 파란 네모 상자가 저 ImageView의 캔버스이다.

## Path

좌표를 이용하여 직선이나 곡선을 그리는 기능

-------

## 예제

### 1. 커스텀 뷰 생성하기

![1](https://github.com/Ekutz/Polygon-Custom-View/blob/master/1.png?raw=true)

본인이 원하는 이름의 클래스를 생성하고

![2](https://github.com/Ekutz/Polygon-Custom-View/blob/master/2.png?raw=true)

커스터마이징 하고자 하는 뷰를 상속받은 후 기본 생성자를 import한다.

이 글에서는 RecyclerView를 커스텀하여 다각형으로 보이게 할 예정이다.

### 2. dispatchDraw 오버라이드

뷰가 화면에 그려지기 전에 캔버스를 잘라내보자

![4](https://github.com/Ekutz/Polygon-Custom-View/blob/master/4.png?raw=true)

Path를 이용하여 캔버스의 영역을 자른 후 clipPath() 메소드를 이용하여 뷰의 영역을 잘라내는 방식이다. 예제의 코드는 아래 그림의 하얀 영역을 그린 코드이다.

![5](https://github.com/Ekutz/Polygon-Custom-View/blob/master/5.png?raw=true)

### 3. 적용하기

**activity_main.xml**
![6](https://github.com/Ekutz/Polygon-Custom-View/blob/master/6.png?raw=true)

**MainActivity.class**
![7](https://github.com/Ekutz/Polygon-Custom-View/blob/master/7.png?raw=true)

이렇게 간단하게 코드 몇 글자를 바꾼것 만으로도 모든 적용이 끝났다.

### 4. 결과물 확인

![result](https://github.com/Ekutz/Polygon-Custom-View/blob/master/result.gif?raw=true)

-------

## 포스트를 마치며...

사실 지금은 이렇게 간단하게 한장의 포스트로 요약이 가능하지만 필자는 이 기능을 알아내기 위해 코드와 한달여 간을 씨름했다. 결국 제대로 적용됐을때는 정말 울고 싶은 심정이었다. iOS 에서는 기본으로 제공되는 마스킹 기능이 없어서 찾던 기능인데 너무나도 유용하게 잘 사용하고 있다. 누군가 나와 비슷한 문제로 씨름을 하게 된다면 이 글을 먼저 보고 시간 낭비를 하지 않았으면 좋겠다.

[테스트 소스](https://github.com/Ekutz/Polygon-Custom-View-Sample.git)
