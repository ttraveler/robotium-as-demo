Appium 解决每次连接打开手机都会重复安装unlock ，Appium setting 等apk问题

在Appium 安装根目录下C:\Users\user\AppData\Local\Programs\appium-desktop



C:\Users\user\AppData\Local\Programs\appium-desktop\resources\app\node_modules\appium\node_modules\appium-android-driver\lib

android-helpers.js文件

注释 helpers.initUnicodeKeyboard 函数下的await adb.install(unicodeIMEPath, false);

注释 helpers.pushUnlock 中的 await adb.install(unlockApkPath, false);

注释 helpers.initDevice 中的await helpers.pushSettingsApp(adb);、await helpers.pushUnlock(adb);



/resources/node_modules/appium/node_modules/appium-android-driver/build/lib

android-helpers.js 文件

helpers.initUnicodeKeyboard 更改case 0 下的语句

注释：// return _regeneratorRuntime.awrap(adb.install(_appiumAndroidIme.path, false));

更改为: context$1$0.abrupt('return', defaultIME);



helpers.pushUnlock更改：case 0 改为如下：

 return context$1$0.abrupt('return', _appiumUnlock.path);





