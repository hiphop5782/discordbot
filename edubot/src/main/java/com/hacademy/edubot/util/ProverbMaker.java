package com.hacademy.edubot.util;

import java.util.ArrayList;
import java.util.List;

import com.hacademy.edubot.entity.Proverb;

public class ProverbMaker {
	private static List<Proverb> list = new ArrayList<>();
	static {
		list.add(Proverb.builder()
				.who("공자")
				.content("가장 큰 영광은 한 번도 실패하지 않음이 아니라,\n실패할 때마다 다시 일어서는데에 있다")
				.build());
		list.add(Proverb.builder()
				.who("스피드스케이팅 국가대표 이상화 선수")
				.content("슬럼프는 자기 내면에 있는 꾀병인거 같아요.\n하기싫은 구석이 있는데 슬럼프를 핑계로 안하는 것이죠.\n\n하지만 저는 반대로 끊임없이 도전했어요.")
				.build());
		list.add(Proverb.builder()
				.who("크리스 그로서")
				.content("동기부여가 당신을 시작하게 한다.\n\n습관이 당신을 계속 움직이게 한다.")
				.build());
		list.add(Proverb.builder()
				.who("Carol Burnett")
				.content("꿈이 있다면\n그 꿈을 잡고 절대 놓아주지 마라")
				.build());
		list.add(Proverb.builder()
				.who("Mohatma Gandhi")
				.content("미래는 현재 우리가 무엇을 하는가에 달려 있다")
				.build());
		list.add(Proverb.builder()
				.who("Alan Kay")
				.content("미래를 예측하는 최선의 방법은 미래를 창조하는 것이다")
				.build());
		list.add(Proverb.builder()
				.who("Lewus carroll")
				.content("어제로 돌아갈 수 없다.\n왜냐하면 나는 어제와는 다른 사람이 되었기 때문이다.")
				.build());
		list.add(Proverb.builder()
				.who("Alan Kay")
				.content("미래를 예측하는 최선의 방법은 미래를 창조하는 것이다")
				.build());
//		list.add(Proverb.builder().who("").content("").build());
	}
	
	public static Proverb generate() {
		int index = (int)(Math.random() * list.size());
		return list.get(index);
	}
}