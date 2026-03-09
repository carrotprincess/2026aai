// week03-2 好玩的程式設計-互動畫圖
// Ctrl-N 開新的視窗

void setup() {        // 設定的函式
    size(400, 300);  // 視窗大小
}

void draw() {        // 畫圖的函式
    // 今天主題 if(判斷) 如果mouse按下去，就用紫色
    if (mousePressed) background(255, 128, 255);
    else background(0, 255, 0);  // 否則，就綠色
}