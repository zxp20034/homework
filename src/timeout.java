# 定位对象时给3s的时间
# 如果3s内还定位不到则抛出异常
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

# 页面加载超时时间设置为5s
dr.manage().timeouts().pageLoadTimesout(5,TimeUnit.SECONDS);

# 异步脚本的超时时间设置成3s
dr.manage().timeouts().setScriptTimeout(3,TimeUnit.SECONDS);

