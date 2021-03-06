package cn.design.pattern2016032009InterfaceSegregationPrinciple;

/**
 * 
 * @ProjectName DesignPattern
 * @ClassName Dog
 * @Description 对于小鸟来说，他具有的特性是eatFood和sing以及fly
 * @author wy
 * @date 2016-4-17
 *
 */
public class Bird implements BirdInter{

	@Override
	public void eatFood() {
		System.out.println("Bird 吃粮食！");
	}

	@Override
	public void sing() {
		System.out.println("Bird 叽叽喳喳唱！");
	}

	@Override
	public void fly() {
		System.out.println("Bird 飞走了！");
	}

}
