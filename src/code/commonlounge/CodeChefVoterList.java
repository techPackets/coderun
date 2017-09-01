package code.commonlounge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*Problem: https://www.codechef.com/problems/VOTERS*/	

public class CodeChefVoterList {

	public static void inputMap(Integer key, Map<Integer, Integer> idFreq) {
		if (idFreq.containsKey(key)) {
			Integer freq = idFreq.get(key);
			idFreq.put(key, freq + 1);
		} else {
			idFreq.put(key, 1);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] numOfVotersInRespectiveList = br.readLine().split(" ");
		int nVL1 = Integer.parseInt(numOfVotersInRespectiveList[0]);
		int nVL2 = Integer.parseInt(numOfVotersInRespectiveList[1]);
		int nVL3 = Integer.parseInt(numOfVotersInRespectiveList[2]);
		Integer[] list1 = new Integer[nVL1];
		Integer[] list2 = new Integer[nVL2];
		Integer[] list3 = new Integer[nVL3];
		List<Integer> finalList = new ArrayList<Integer>();

		Map<Integer, Integer> idFreq = new TreeMap<Integer, Integer>();

		for (int i = 0; i < nVL1; i++) {
			list1[i] = Integer.parseInt(br.readLine());
			CodeChefVoterList.inputMap(list1[i], idFreq);
		}
		for (int i = 0; i < nVL2; i++) {
			list2[i] = Integer.parseInt(br.readLine());
			CodeChefVoterList.inputMap(list2[i], idFreq);
		}
		for (int i = 0; i < nVL3; i++) {
			list3[i] = Integer.parseInt(br.readLine());
			CodeChefVoterList.inputMap(list3[i], idFreq);
		}

		for (Map.Entry<Integer, Integer> entry : idFreq.entrySet()) {
			Integer value = entry.getValue();
			if (value >= 2)
				finalList.add(entry.getKey());
		}

		System.out.println(finalList.size());
		for(Integer i: finalList) {
			System.out.println(i);
		}
	}
}
