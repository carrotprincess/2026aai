// week14-1 好玩的程式設計「真的有地鼠」- 加上點擊判定
PImage img; 
void setup() {
  size(300, 400); 
  img = loadImage("gopher.png"); 
}

int [][] a = { {0,0,0}, {0,0,0}, {0,0,0} }; 
int score = 0; // 增加一個分數變數

void draw() {
  background(#FFFFF2); 
  
  // 顯示分數
  fill(0);
  textSize(20);
  text("Score: " + score, 10, 50);
  
  if (frameCount%60==0) { 
    int i = int(random(3)), j = int(random(3)); 
    a[i][j] = 60; 
  }
  
  for (int i=0; i<3; i++) { 
    for (int j=0; j<3; j++) { 
      float x = j*100, y = i*100 + 100; // y軸下移100留給分數欄
      
      // 計算跳動位移
      float currentY = y - 100 * sin(a[i][j]*PI/60); 
      
      if(a[i][j]>0) a[i][j]--; 
      
      image(img, x, currentY, 100, 100); 
    }
  }
}

// 偵測滑鼠點擊
void mousePressed() {
  // 換算滑鼠點擊的位置對應到 2D 陣列的哪一個索引 (i, j)
  int j = mouseX / 100;
  int i = (mouseY - 100) / 100; // 因為 y 座標整體下移了 100
  
  // 確保點擊範圍在 3x3 網格內
  if (i >= 0 && i < 3 && j >= 0 && j < 3) {
    if (a[i][j] > 0) { // 如果地鼠正在跳
      score += 10;     // 加 10 分
      a[i][j] = 0;     // 讓地鼠立刻縮下去
      println("Hit! Score: " + score);
    }
  }
}