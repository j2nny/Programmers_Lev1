package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinMax {

	public MinMax() {
		System.out.println(Arrays.toString(solution(3, 12)));
		System.out.println(Arrays.toString(solution(2, 5)));

	}

	public int[] solution(int n, int m) {

		Map<Integer, Integer> nMap = inSooBoonHae(n);
		Map<Integer, Integer> mMap = inSooBoonHae(m);

		int[] answer = new int[] {1, 1};

		for (Integer i : nMap.keySet()) {
			if(mMap.keySet().contains(i)) {
				answer[0] *= Math.pow(i, Math.min(nMap.get(i), mMap.get(i)));
			}
		}

		Set<Integer> keySet = new HashSet<Integer>();
		keySet.addAll(nMap.keySet());
		keySet.addAll(mMap.keySet());

		for (Integer i : keySet) {
			if(nMap.keySet().contains(i) && mMap.keySet().contains(i)) {
				answer[1] *= Math.pow(i, Math.max(nMap.get(i), mMap.get(i)));
			} else if(nMap.keySet().contains(i)) {
				answer[1] *= Math.pow(i, nMap.get(i));
			} else if(mMap.keySet().contains(i)) {
				answer[1] *= Math.pow(i, mMap.get(i));
			}
		}

		return answer;
	}

	public Map<Integer, Integer> inSooBoonHae(int n){

		Map<Integer, Integer> res = new HashMap<Integer, Integer>();

		int divide = 2;
		while(n != 1) {
			if(n % divide == 0) {
				n = n / divide;
				res.put(divide, res.getOrDefault(divide, 0) + 1);
			} else {
				divide++;
			}
		}

		return res;
	}


	public static void main(String[] args) {
		new MinMax();
	}

}
