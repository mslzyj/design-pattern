package abstract_factory;



import abstract_factory.factory.AbstractCothingFactory;
import abstract_factory.factory.FactoryProducer;
import abstract_factory.product.SpringCothing;
import abstract_factory.product.WinterClothing;

/**
 *
 */
public class FactoryMethodDemo {

	public static void main(String[] args) {
		//1.获取春装工厂
		AbstractCothingFactory springCothingFactory = FactoryProducer.getFactory("SPRING");

		//2.获取“童装，春装”对象
		SpringCothing childrenWearSpringCothing =
				springCothingFactory.getSpringCothing("CHILDER");

		//3.调具体方法，生产“童装，春装”产品
		childrenWearSpringCothing.productionClothing();

		//4.获取“青年装，春装”对象
		SpringCothing youtWearSpringCothing =
				springCothingFactory.getSpringCothing("YOUTH");

		//5.调具体方法，生产“青年装，春装”产品
		youtWearSpringCothing.productionClothing();


		//========================================================
		//1.获取冬装工厂
		AbstractCothingFactory winterCothingFactory  = FactoryProducer.getFactory("WINTER");

		//2.获取“童装，冬装”对象

		WinterClothing childerWearWinterCothing =
				winterCothingFactory.getWinterCothing("YOUTH");
		//3.生产“童装，冬装”
		childerWearWinterCothing.productionClothing();
	}

}
