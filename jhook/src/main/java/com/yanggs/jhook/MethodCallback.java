package com.yanggs.jhook;

/**
 * Created by YangGuoShan on 2018/5/24.
 */
public abstract class MethodCallback  {
    public MethodCallback() {
    }

    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {}
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {}

//    public class MethodHookParam {
//
//        public Member method;
//
//        public Object thisObject;
//
//        public Object[] args;
//
//        private Object result = null;
//        private Throwable throwable = null;
//        boolean returnEarly = false;
//
//        public Object getResult() {
//            return result;
//        }
//
//        public void setResult(Object result) {
//            this.result = result;
//            this.throwable = null;
//            this.returnEarly = true;
//        }
//
//        public Throwable getThrowable() {
//            return throwable;
//        }
//
//        public boolean hasThrowable() {
//            return throwable != null;
//        }
//
//        public void setThrowable(Throwable throwable) {
//            this.throwable = throwable;
//            this.result = null;
//            this.returnEarly = true;
//        }
//
//        public Object getResultOrThrowable() throws Throwable {
//            if (throwable != null)
//                throw throwable;
//            return result;
//        }
//    }
}
