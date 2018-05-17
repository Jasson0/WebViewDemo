# WebViewDemo
一.js调用native
方法1：
使用JavascriptInterface映射一个对象，
mWebView.addJavascriptInterface(new AndroidtoJs(), AndroidtoJs.TAG);//AndroidtoJS类对象映射到js的test对象
在js中通过tag名来调用对应的方法
        AndroidtoJs.hello("js调用了android中的hello方法");
方法2：
在shouldOverrideUrlLoading中拦截url，
方法3：
在prompt中拦截url
二.native调用js
方法1：
loadurl：
mWebView.loadUrl("javascript:callJS()");
evaluateJavascript：
mWebView.evaluateJavascript("javascript:callJS()", new ValueCallback<String>() {
                                @Override
                                public void onReceiveValue(String value) {
                                    Toast.makeText(getBaseContext(), value, Toast.LENGTH_SHORT).show();
                                }
                            });
在js中返回的数据可以再onReceiveValue中获取，返回的是json格式的string。
