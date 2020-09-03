#[Name]
##Flyweight

#[Context]
玩Game時，怪獸可以隨時產生N個分身,但如果每產生一個分身都需要一定的記憶體用量，數量一多，就會造成系統越來越慢

#[Problem]
要如何用最節省的方式產生大量物件?

#[Force]
* 當應用程式使用了一大堆物件
* 過多物件耗用過多空間時
* 物件的大部份狀態都可歸為外在狀態時
* 如果將外在狀態拿掉，就能將好幾群物件換成少數幾個共用物件時
* 如果應用程式並不仰賴「物件等同性質」時。

#[Solution]
建立Flyweight來存取外狀態的介面。透過ConcreteFlyweight實做Flyweight介面，並增加內在狀態所需儲存空間。ConcreteFlyweight物件必預是可共用的，所存的狀態必須是內在狀態，並且與所處環境無關。FlyweightFactory建立與管理Flyweight物件。Client持有指向一個或多個Flyweight物件，計算或儲存Flywight的外在狀態。

#[Resulting Content]
Flyweight模式可能會在傳遞、搜尋、計算外在狀態時耗費時間、其是當這些資訊原本是列在內在狀態時；不過可由省下來的空間得到補償，而且共用的Flyweight越多，空間就越省。

***
#[Workshop]
