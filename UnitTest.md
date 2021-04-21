# Android 单元测试 #

## 准备 ##
android的单元测试需要导入依赖：

	androidTestCompile 'junit:junit:4.12'
	testCompile 'junit:junit:4.12'

android项目建立好后，as会自动默认为我们建立两个测试包。其中，test目录为在本机执行单元测试代码的目录， androidTest为在Android设备上执行单元测试代码的目录。如下图：

![](http://files.jb51.net/file_images/article/201608/201608141043313.png)


###1、InstrumentationTestCase框架：###

Instrumentation和Activity有点类似，只不过Activity是需要一个界面的，而Instrumentation并不是这样的，我们可以将它理解为一种没有图形界面的，具有启动能力的，用于监控其他类(用Target Package声明)的工具类。

举个例子，利用InstrumentationTestCase 启动一个activity：在androidTest下新建一个java类，并且继承自InstrumentationTestCase编写一个public void的方法，但是必须要是方法名以test打头，比如testPublishSubject，并不需要@Test注解

```java

	public class TestSubject extends InstrumentationTestCase {
  		private static final String LOG_TAG = "test";
 		public void testPublishSubject() {
    		launchActivity("demo.zts.com.demo",SecondActivity.class,null);
		}
	}

```