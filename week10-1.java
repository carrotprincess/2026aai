// week10-1 好玩的程式設計 - 打地鼠
void setup() {
  size(300, 300); // 視窗大小
}

void draw() {
  background(#FFAAD5); // 綠色背景
  for (int i=0; i<3; i++) { // 左手 i 對應 y 座標
    for (int j=0; j<3; j++) { // 右手 j 對應 x 座標
      int x = j*100 + 50, y = i*100 + 50; // 算出座標
      ellipse(x, y, 80, 80); // 地鼠的洞
    }
  }
}