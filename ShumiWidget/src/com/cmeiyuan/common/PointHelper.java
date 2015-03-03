package com.cmeiyuan.common;

import android.graphics.PointF;

public class PointHelper {

	// 求两点中点
	public static PointF center(PointF p1, PointF p2) {
		return new PointF((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}

	// 求两点间距离
	public static float distance(PointF p1, PointF p2) {
		float dx = Math.abs(p2.x - p1.x);
		float dy = Math.abs(p2.y - p1.y);
		return (float) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

	// 平移点
	public static PointF translate(PointF p, float x, float y) {
		return new PointF(p.x + x, p.y + y);
	}

	// 计算两点连线中的一点，这个点把这条线分成两段，比例是percent
	public static PointF percent(PointF p1, PointF p2, float percent) {
		float x = (p2.x - p1.x) * percent + p1.x;
		float y = (p2.y - p1.y) * percent + p1.y;
		return new PointF(x, y);
	}

}
