// week06-2 好玩的程式設計，mouse 拖曳畫面時，後面的格子會慢慢變淡
// 修改自 week06-1 好玩的程式設計 兩層for(迴圈) 配合 陣列
void setup() {
  size(800, 500); // 視窗大小 800 x 500
}

int [][] a = new int[10][16]; // Java 的陣列寫法，跟C/C++不同
// void mousePressed() { // mouse按下去時，執行這段
void mouseDragged() { // mouse拖曳時，執行這段
  int i = mouseY/50, j = mouseX/50; // 計算i, j座標
  a[i][j] = 120; // 數字變大了 試試 60 (1秒)再試試 120 (2秒)
}

void draw() {
  background(255);
  for (int i=0; i<10; i++) { // 上週是 for y 現在改成 for i 左手i
    for (int j=0; j<16; j++) { // 上週是 for x 現在改成 forj 右手j
      if ( a[i][j] > 0 ) {
        fill(#FFB7DD, a[i][j] * 4); // 若陣列有值，設綠色，並根據陣列值設定透明度
        a[i][j]--; // 讓數值逐幀減少，產生褪色效果
      } else fill(255); // 沒有值，設白色
      rect( j*50, i*50, 50, 50); // 畫四邊形
    }
  }
}