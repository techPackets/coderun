package code.hackerrank.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem Statement: https://www.hackerrank.com/challenges/find-point/problem */
public class FindPoint {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());

		while (times-- > 0) {
			String s = br.readLine();
			String[] pts = s.split(" ");
			int px = Integer.parseInt(pts[0]);
			int py = Integer.parseInt(pts[1]);
			int qx = Integer.parseInt(pts[2]);
			int qy = Integer.parseInt(pts[3]);
			int rx = 0;
			int ry = 0;

			// Midpoint formula; Assuming q is the midpoint of p & r
			rx = 2 * qx - px;
			ry = 2 * qy - py;

			System.out.println(rx + " " + ry);
		}
	}
}
