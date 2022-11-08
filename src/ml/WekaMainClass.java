package ml;

import weka.classifiers.Classifier;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.classifiers.lazy.IBk;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class WekaMainClass {
	public static void main(String[] args) throws Exception {
		classification("./data/iris_Train.arff", "./data/iris_Test.arff", "mlp", 4, 4);
		
	}
	
	public static void classification(
			String trainSet,
			String testSet,
			String algorithm,
			int trainIndex,
			int testIndex
			) throws Exception {
		
		// 학습데이터 파일 읽어오기
		DataSource source = new DataSource(trainSet);
		Instances train = source.getDataSet();
		
		// train 피처 index 셋팅
		train.setClassIndex(trainIndex);
		if(train.classIndex() == -1) {
			train.setClassIndex(train.numAttributes() -1);
		}
		
		// 테스트데이터 파일 읽어오기
		source = new DataSource(testSet);
		Instances test = source.getDataSet();
		
		// test 피처 index 셋팅
		test.setClassIndex(testIndex);
		if(test.classIndex() == -1) {
			test.setClassIndex(test.numAttributes() -1);
		}
		
		if(algorithm.equals("tree")) {	// 모델(알고리즘) 선택
			J48 j48 = new J48();	// 의사결정트리 모델 객체생성
			j48.setUnpruned(true);	
			Classifier cls = j48;	// 학습인터페이스 형변환(다형성)
			cls.buildClassifier(train);	// 학습!!!
			
			for(int i = 0; i < test.numInstances(); i++) {	// 테스트 데이터 만큼 반복
				double clsLabel = j48.classifyInstance(test.instance(i));	// 분류 -> 숫자로리턴 
				String label = test.classAttribute().value((int) clsLabel);	// 분류된 숫자값을 -> 타겟이름으로 변환
				System.out.println(test.instance(i));
				System.out.println("prediction : " + label);	// 예측 결과 출력!!
			}
		}
		
		
		if(algorithm.equals("knn")) {	// 모델(알고리즘) 선택
			IBk ibk = new IBk();	// knn 모델 객체생성
			Classifier cls = ibk;	// 학습인터페이스 형변환(다형성)
			cls.buildClassifier(train);	// 학습!!!
			
			for(int i = 0; i < test.numInstances(); i++) {	// 테스트 데이터 만큼 반복
				double clsLabel = ibk.classifyInstance(test.instance(i));	// 분류 -> 숫자로리턴 
				String label = test.classAttribute().value((int) clsLabel);	// 분류된 숫자값을 -> 타겟이름으로 변환
				System.out.println(test.instance(i));
				System.out.println("prediction : " + label);	// 예측 결과 출력!!
			}
		}
		
		
		if(algorithm.equals("mlp")) {	// 모델(알고리즘) 선택
			MultilayerPerceptron mlp = new MultilayerPerceptron();	// knn 모델 객체생성
			Classifier cls = mlp;	// 학습인터페이스 형변환(다형성)
			cls.buildClassifier(train);	// 학습!!!
			
			for(int i = 0; i < test.numInstances(); i++) {	// 테스트 데이터 만큼 반복
				double clsLabel = mlp.classifyInstance(test.instance(i));	// 분류 -> 숫자로리턴 
				String label = test.classAttribute().value((int) clsLabel);	// 분류된 숫자값을 -> 타겟이름으로 변환
				System.out.println(test.instance(i));
				System.out.println("prediction : " + label);	// 예측 결과 출력!!
			}
		}
		
		
		
		
		
		
		
		
	}

}








