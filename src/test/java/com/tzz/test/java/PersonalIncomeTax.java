package com.tzz.test.java;

/**
 * 个人所得税计算
 *
 */
public class PersonalIncomeTax {

	// 0元至1500元:3%
	// 1500元至4500元的部分 :10%
	// 超过4500元至9000元的部分:20%
	// 超过9000元至35000元的部分:25%
	// 超过35000元至55000元的部分:30%
	// 超过55000元至80000元的部分:35%
	// 超过80000元的部分:45%
	public static double calculate(double salary, double socialSecurity, double lowestTaxableLimit) {
		double tax = 0.0;
		double calculateNum = salary - socialSecurity - lowestTaxableLimit;
		// select 1500*0.03+3000*0.1+4500*0.2+1138.98*0.25 from dual
		if (calculateNum <= 1500) {// 0元至1500元:3%
			tax = calculateNum * 0.03;
		} else if (calculateNum <= 4500) {// 1500元至4500元的部分 :10%
			tax = 1500 * 0.03 + (calculateNum - 1500) * 0.1;
		} else if (calculateNum <= 9000) {// 超过4500元至9000元的部分:20%
			tax = 1500 * 0.03 + 3000 * 0.1 + (calculateNum - 4500) * 0.2;
		} else if (calculateNum <= 35000) {// 超过9000元至35000元的部分:25%
			tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + (calculateNum - 9000) * 0.25;
		} else if (calculateNum <= 55000) {// 超过35000元至55000元的部分:30%
			tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + (calculateNum - 35000) * 0.3;
		} else if (calculateNum <= 80000) {// 超过55000元至80000元的部分:35%
			tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + (calculateNum - 55000) * 0.35;
		} else {// 超过80000元的部分:45%
			tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + 25000 * 0.35
					+ (calculateNum - 80000) * 0.45;
		}
		return tax;
	}

	public static void main(String[] args) {
		double salary = 14910;// 收入
		double socialSecurity = 220.56 + 13.51 + 10.15 + 116.80;// 各项社会保险费
		double lowestTaxableLimit = 3500;// 起征点
		System.out.println(
				"salary:" + salary + ",socialSecurity" + socialSecurity + ",lowestTaxableLimit:" + lowestTaxableLimit);
		double tax = calculate(salary, socialSecurity, lowestTaxableLimit);
		System.out.println("实发工资：" + (salary - socialSecurity - tax) + "应缴税款:" + tax);
	}
}
