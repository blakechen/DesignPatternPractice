#[Name]
##Memento

#[Context]
有時我們需要記錄物件的內部狀態，例如：取消動作的復原機制(undo)，或者修復錯誤回到前一個查核點(checkpoint)，都需先將物件狀態另存某處，才能將物件弄回前一個狀態，可是物件通常都會將部份狀態封裝起來不讓外界
觸碰，也無法存到外面；如果硬將內部狀態曝光 又會違反封裝性，有損應用程式的穩固及擴充能力。

#[Problem]
如何在不違反封狀性的前提下，捕捉物件的部部態並存在外面 以便日後回復至此一狀態?

#[Force]
* 當物件的部份狀態必須先存起來，以備事後能回復至此一狀態時
* 直接取得狀態的介面會曝露內部實作細節，因而違反物件封裝性時

#[Solution]
透過Memento存放Originator物件的內部狀態。存放資訊量要視Originator的狀況而定，Memento有兩種介面Caretaker只看得到窄介面，只能將Memeto整個遞給其他物件；Originator可以看到寬介面，可以存取所有資料，以便回復至前一狀態。理論上，只有產生這個Memnto物件的那個Originator才有權存取內部狀態

#[Resulting Content]
* 維持封裝界線。
* 可簡化Originator
* Memnto 可能很耗資源。
* 定義寬介面和窄介面
* 管理Memento的在代價。

***
#[Workshop]
