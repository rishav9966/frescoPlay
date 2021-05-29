package com.fresco;

import java.util.*;

public class TreemapHandson {

	public TreeMap<Integer, String> createPlayerPositionMap(String cricketDataset) {
		TreeMap<Integer, String> res = new TreeMap<Integer, String>();
		String[] players = cricketDataset.split("\\|");
		for (String s : players) {
			String[] playerDetail = s.split(",");
			res.put(Integer.parseInt(playerDetail[0]), playerDetail[1]);
		}
		return res;

	}

	public TreeMap<String, Integer> createPlayerScoreMap(String cricketDataset) {
		TreeMap<String, Integer> res = new TreeMap<String, Integer>();
		String[] players = cricketDataset.split("\\|");
		for (String s : players) {
			String[] playerDetail = s.split(",");
			res.put(playerDetail[1], Integer.parseInt(playerDetail[2]));
		}
		return res;

	}

	public TreeMap<?, ?> createMatchesMap(String cricketDataset) {
		TreeMap<Integer, String> res = new TreeMap<Integer, String>();
		String[] playerData = cricketDataset.split("\n");
		String data = "";
		for (String s : playerData) {
			String[] playerDetail = s.split("\\|");
			for (String str : playerDetail) {
				String[] currentPlayer = str.split(",");
				int position = Integer.parseInt(currentPlayer[0]);
				data = currentPlayer[1] + "," + currentPlayer[2];
				if (res.containsKey(position)) {
					String value = (String) res.get(position);
					value += "|" + data;
					res.put(position, value);
				} else {
					res.put(position, data);
				}
			}
		}
		return res;
	}

	public String getQuery(String cricketDataset, String query) {
		String[] queryData = query.split(" ");
		int queryNo = Integer.parseInt(queryData[0]);
		String res = "";

		TreeMap<Integer, String> playerPositionMap;
		TreeMap<String, Integer> playerScoreMap;
		TreeMap<?, ?> matchesMap;

		if (queryNo == 1) {
			playerPositionMap = createPlayerPositionMap(cricketDataset);
			for (int i = Integer.parseInt(queryData[1]); i <= Integer.parseInt(queryData[2]); i++) {
				res += i + " " + playerPositionMap.get(i) + "\n";
			}

		} else if (queryNo == 2) {
			playerPositionMap = createPlayerPositionMap(cricketDataset);
			playerScoreMap = createPlayerScoreMap(cricketDataset);
			for (Map.Entry m : playerPositionMap.entrySet()) {
				String playerName = (String) m.getValue();
				if (playerScoreMap.get(playerName) > Integer.parseInt(queryData[1])) {
					res += m.getKey() + " " + playerName + "\n";
				}
			}

		} else if (queryNo == 3) {
			matchesMap = createMatchesMap(cricketDataset);
			int position = Integer.parseInt(queryData[0]);
			TreeMap<String, Integer> openingStats = new TreeMap<String, Integer>();
			String stats = (String) matchesMap.get(1);

			String[] playerStats = stats.split("\\|");
			for (String s : playerStats) {
				String[] currentPlayer = s.split(",");
				String playerName = currentPlayer[0];
				int score = Integer.parseInt(currentPlayer[1]);
				if (openingStats.containsKey(playerName)) {
					int val = (Integer) openingStats.get(playerName);
					openingStats.put(playerName, score + val);
				} else {
					openingStats.put(playerName, score);
				}
			}
			int highestScore = 0;
			for (Map.Entry m : openingStats.entrySet()) {
				if ((Integer) m.getValue() > highestScore) {
					highestScore = (Integer) m.getValue();
					res = "The Efficient Opener is " + m.getKey();
				}
			}
		}

		return res;
	}

}
