# UncaughtExceptionSendEmail
#Android应用程序未捕获异常并提示用户发送给开发者
#效果图如下

<center>![img_2](./ScreenShots/微信截图_20160415150651.png)</center><center>![img_2](./ScreenShots/微信截图_20160415150719.png)<br /></center>


#### 使用Gradle构建时添加一下依赖即可:
```javascript
compile 'com.linglongxin24:UncaughtExceptionSendEmail:1.0.0'
```

继承系统的application
```java
/**
 * Created by yuandl on 2016/4/7 0007.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CustomActivityOnCrash.install(this);
        String[] emialTo = {"13468857714@qq.com"};//配置邮箱
        CustomActivityOnCrash.setEmailTo(emialTo);
        CustomActivityOnCrash.setDebugMode(true);
    }
}
```


