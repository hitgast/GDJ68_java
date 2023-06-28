package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Condition9 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int hp = 40;
		int monsterHp = 60;
		int skillCount = 3;
		
		System.out.println("1.평타, 2.스킬, 3.HP회복, 4.도망");
		int choose = sc.nextInt();
		
		if(hp > 0){
			while(true) {
				if(choose == 1) {
					monsterHp -= ran.nextInt(11);
					
					System.out.println("몬스터HP : " + monsterHp);
					
					if(monsterHp <= 0) {
						System.out.println("몬스터 퇴치 완료!");
						break;
					}
				}
				else if(choose == 2) {
					monsterHp -= ran.nextInt(11);
					skillCount--;
					System.out.println("스킬을 사용했습니다" + "\n" + "몬스터HP : " + monsterHp);
					System.out.println("남은 스킬 횟수 : " + skillCount);
					
					if(skillCount == 0) {
						System.out.println("스킬 잔여량이 없습니다");
						//break;
					}
				}
				else if(choose == 3) {
					int heal = ran.nextInt(41);
					
					if(heal == 40) {
						hp += heal;
						
						System.out.println("HP " + heal + "이 회복되었습니다");
						System.out.println("- 총HP : " + hp + " -");
					}
					else {
						System.out.println("HP " + heal + "이 회복되었습니다");
						System.out.println("- 총HP : " + hp + " -");
					}
					
				}
				else if(choose == 4) {
					int run = ran.nextInt(2);
					
					if(run == 0) {
						System.out.println("도망가기 성공!");
					}
					else if(run == 1) {
						System.out.println("도망가기 실패..");				
					}
				}
			}
		}
		
				
	}
}
