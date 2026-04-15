package b5;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b0.w1;
import c7.k1;
import c7.u0;
import c7.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1519b;

    public /* synthetic */ d() {
        this.f1518a = 3;
    }

    private final void a(Message message) {
        w0 w0Var;
        u0 u0Var;
        d dVar;
        if (message.what == 1) {
            synchronized (((u0) this.f1519b).f3730a) {
                w0Var = (w0) ((u0) this.f1519b).f3733d.get();
                u0Var = (u0) this.f1519b;
                dVar = u0Var.f3734e;
            }
            if (w0Var == null || u0Var != w0Var.b() || dVar == null) {
                return;
            }
            w0Var.f((k1) message.obj);
            ((u0) this.f1519b).a(w0Var, dVar);
            w0Var.f(null);
        }
    }

    public void b(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r20) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.d.handleMessage(android.os.Message):void");
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j10) {
        switch (this.f1518a) {
            case 3:
                Bundle data = message.getData();
                ClassLoader classLoader = c7.o.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Looper looper, int i10) {
        super(looper);
        this.f1518a = i10;
        this.f1519b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Looper looper, w1 w1Var) {
        super(looper);
        this.f1518a = 2;
        this.f1519b = w1Var;
    }
}
