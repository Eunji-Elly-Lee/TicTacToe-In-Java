# Tic-Tac-Toe Game with GUI

## 💡 Overview

A simple 2-player grid game implemented with JavaFX. <br />
Tic-Tac-Toe is a classic game where two players take turns placing their mark (X or O) on a 3x3 grid. The first player to align three marks horizontally, vertically, or diagonally wins. If all spaces are filled with no winner, the game ends in a draw.

JavaFX로 구현된 2인용 간단한 격자 게임입니다. <br />
두 명의 플레이어가 번갈아가며 3x3 격자에 X 또는 O를 표시하고, 가로, 세로, 대각선 중 한 줄에 나란히 이어진 세 칸을 만들면 승리합니다. 모든 칸이 채워져도 승자가 없으면 무승부로 종료됩니다.

## 🎮 How to Play

- Players take turns placing X or O on empty blocks <br />
  플레이어가 번갈아 가며 빈 칸에 X 또는 O를 놓기
- Get three marks in a row to win <br />
  세 개의 연속된 마크를 만들면 승리
- If all blocks are filled with no winner, it’s a draw <br />
  모든 칸이 채워져도 승자가 없으면 무승부

## 🔍 Features

- **Turn-based gameplay**: Alternating turns between two players <br />
  두 플레이어가 번갈아 진행하는 턴 기반 게임
- **Visual feedback**: Grid updates immediately on player action <br />
  클릭 시 격자에 즉시 표시되는 시각적 피드백
- **Turn indicator**: UI shows whose turn it is <br />
  현재 누구의 턴인지 UI에 표시
- **Error handling**: Clicking already marked cells has no effect <br />
  이미 표시된 칸 클릭 시 무시
- **Instant result display**: Win/draw result shown in real-time <br />
  실시간 반영되는 승리 또는 무승부에 대한 결과

## 🛠 Run Instructions

### In Eclipse:

1. Right-click the project folder <br />
   프로젝트 폴더 우클릭
2. Select Run As > Java Application <br />
   Run As > Java Application 선택

### In VS Code:

1. Open `src/TicTacToe.java` <br />
   `src/TicTacToe.java` 파일 열기
2. Press F5 or click ▶️ to run the game <br />
   F5 키 또는 ▶️ 버튼 클릭하여 실행

## 🖼 Screenshots

<details>
<summary>Click to view</summary>

![Preview](/img/tictactoe.png)

</details>

## 🧰 Tech Stack

| Category | Tech                        |
| -------- | --------------------------- |
| Language | Java                        |
| GUI      | JavaFX                      |
| IDE      | Eclipse, Visual Studio Code |
