package com.tzz.design.shuffle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class ShuffleCard {

	public static void swap(List<?> list, int i, int j) {
		final List l = list;
		l.set(i, l.set(j, l.get(i)));
	}
	
	//随机洗牌
	@Test
	public void testShuffle2() {
		List<Card> cards = new ArrayList<Card>();
		// 生成一副牌
		for (int rank = Card.THREE; rank <= Card.DEUCE; rank++) {
			cards.add(new Card(Card.DIAMOND, rank));
			cards.add(new Card(Card.CLUB, rank));
			cards.add(new Card(Card.HEART, rank));
			cards.add(new Card(Card.SPADE, rank));
		}
		cards.add(new Card(Card.JOKER, Card.BLACK));
		cards.add(new Card(Card.JOKER, Card.COLOR));
		System.out.println(cards.toString());
		
		Random random = new Random();
		for (int i = cards.size(); i > 1; i--) {
			int m = random.nextInt(i);
			swap(cards, i - 1, m);
		}
		System.out.println(cards.toString());
	}

}
