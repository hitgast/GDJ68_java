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
		
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1.평타, 2.스킬, 3.HP회복, 4.도망");
			System.out.println("---------------------------");
			int choose = sc.nextInt();
			
			if(choose == 1) {
				monsterHp -= ran.nextInt(31);
				hp -= ran.nextInt(21);
				
				if(hp <= 0){
					hp = 0;
				}
				if(monsterHp <= 0){
					monsterHp = 0;
				}
				
				System.out.println("몬스터를 공격했습니다");
				System.out.println("몬스터HP : " + monsterHp + "\n");

				if(monsterHp <= 0) {
					System.out.println("몬스터 퇴치 완료!");
					break;
				}
				
				System.out.println("몬스터한테 공격 받았습니다");
				System.out.println("유저HP : " + hp + "\n");
				
				if(hp <= 0) {
					System.out.println("유저 사망..");	
					break;
				}
			}
			else if(choose == 2 && skillCount >= 1) {
				monsterHp -= ran.nextInt(16);
				skillCount--;
				System.out.println("스킬을 사용했습니다" + "\n" + "몬스터HP : " + monsterHp);
				System.out.println("남은 스킬 횟수 : " + skillCount + "\n");
				
				if(monsterHp <= 0){
					monsterHp = 0;
				}
				if(monsterHp <= 0) {
					System.out.println("몬스터 퇴치 완료!");
					break;
				}
				
				if(skillCount == 0) {
					System.out.println("스킬 잔여량이 없습니다");
					continue;
				}
			}
			else if(choose == 3) {
				int heal = ran.nextInt(21);
				
				if(hp >= 40) {
					System.out.println("체력이 전부 회복되었습니다" + "\n");
				}
				else {
					hp += heal;
					
					if(hp >= 40) {
						hp = 40;
					}
					System.out.println("HP " + heal + "이(가) 회복되었습니다");
					System.out.println("- 유저HP : " + hp + " -" + "\n");
				}
			}
			else if(choose == 4) {
				int run = ran.nextInt(2);
				
				if(run == 0) {
					System.out.println("도망가기 성공!");
					break;
				}
				else if(run == 1) {
					System.out.println("도망가기 실패..");				
				}
			}
			else {
				System.out.println("다시 선택하십시오");
			}
		}
		
				
	}
}
