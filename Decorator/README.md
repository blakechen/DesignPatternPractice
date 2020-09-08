#[Name]
##Decorator

#[Context]
有時我們會想額外權責單獨附加到個別物件身上，但不是加到整個類別裡。舉例來說，GUI工具箱應該能讓你將額外屬性(例如邊框、捲軸)單獨加到任何一個視覺元件身上。

#[Problem]
要如何將額外權責動態附加到物件身上，不必衍生子類別即可單性擴增功能?

#[Force]
* 想動態而透明地增加額外權責到各別物件身上，不影響其他物件時。
* 希望權責可動態撤銷時
* 想擴充功能，但子類別繼承方式卻不切實際時。例如：想擴充單項非常多，排列組合起來簡直是天文數字。

#[Solution]
透過Dectorator持有指向Compenent的reference。須制訂符合Compnoent的介面。透過ConcreteDecorator將額外權責增加到Compnoent身上

#[Resulting Content]
比靜態的繼承機制更有彈性。
避免將功能過剩的類別擺在類別階層頂端。
產生過多小型物件

#[Comapre]
* Decorator模式是包外物件外面的一層皮
* Strategy模式則是改變物件的內臟

#[Sample in JAVA]
java.io InputStream

***
#[Workshop]
