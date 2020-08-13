#[Name] 
##Builder

#[Context]
從複雜物件的佈局中抽取出生成程序，以便用同一個生成程序製造各種不同的物件佈局

#[Problem]
要如何透過統一程序產生各種不同物件?

#[Force]
* 欲將「建造複雜物件的演算法」與物件的零件及組裝方式保持獨立時。
* 想讓同一個物件生成程序能夠產生數種不同佈局形式的物件時。

#[Solution]
定議抽像介面Builer用來生成Product的各零件
由ConcreteBuilder實做Builder介面負責建構及組裝Product的各零件，定義並記載他所造出的物件之佈局形式。
如果要產生的複雜物件，它的內部形式以及組裝程序，全部是由ContreteBuilder負責
建構流程都統一透過Director對Builder做操作

#[Resulting Content]
* 能夠改變成品物件的內部佈局形式。
* 將生成程序與內部佈局的程式碼隔離開來
* 對生成程序掌控得更細緻
***
#[Workshop]
