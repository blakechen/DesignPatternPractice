# [Name]
## Interpreter

# [Context]
搜尋特定符合特定模式的字串，這是一個很通用常見的問題，而 Regular Expression 就是一個用來指定字串模式的標準的語言。而要怎麼將一個這樣的語言轉換成程式語言可使用的表示

# [Problem]
在物件之間如何授與管理複雜流程的職責
要如何針對標的語言定義出文法，以及可解讀這種語句的方法?

# [Force]
* 文法簡單的語言
* 效率不是重要考量時

# [Solution]
建立一個AbstractExpression宣告抽像語法樹所有節當所共有的Interpret()抽象操作，TerminalExpression實作出終端符號所對應的Interprete操作。NonterminalExpression實做出非終端符號對應的Interprete()，並遞迴呼叫自己

# [Resulting Content]
* 容易改變及擴充方法
* 文法也很容易製作
* 文法如果太複雜就會變的很難維謢

***
#[Workshop]
