package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import b7.a1;
import b7.d1;
import b7.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f901b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f900a = i10;
        this.f901b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f900a) {
            case 0:
                m.a((m) this.f901b, message);
                break;
            case 1:
                u uVar = (u) this.f901b;
                if (message.what == 1) {
                    try {
                        t0 t0Var = (t0) uVar.f969c;
                        t0Var.f2091w.w0(t0Var.f2071c);
                    } catch (RemoteException unused) {
                        p4.c.B("MCImplBase", "Error in sending flushCommandQueue");
                    }
                }
                break;
            case 2:
                a1 a1Var = (a1) this.f901b;
                a1Var.getClass();
                if (message.what == 1) {
                    d1 d1Var = a1Var.f1622e;
                    d1Var.f(false, d1Var.f1723m);
                }
                break;
            default:
                p4.n nVar = (p4.n) this.f901b;
                for (p4.m mVar : nVar.f16591d) {
                    p4.l lVar = nVar.f16590c;
                    if (!mVar.f16587d && mVar.f16586c) {
                        m4.o oVarD = mVar.f16585b.d();
                        mVar.f16585b = new k5.d();
                        mVar.f16586c = false;
                        lVar.g(mVar.f16584a, oVarD);
                    }
                    if (nVar.f16589b.f16627a.hasMessages(1)) {
                        break;
                    }
                }
                break;
        }
        return true;
        return true;
    }
}
