package p5;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import m4.u1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f16658b;

    public h(i iVar, g5.k kVar) {
        this.f16658b = iVar;
        Handler handlerN = c0.n(this);
        this.f16657a = handlerN;
        kVar.h(this, handlerN);
    }

    public final void a(long j10) {
        Surface surface;
        i iVar = this.f16658b;
        if (this != iVar.f16682x1 || iVar.K == null) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            iVar.L0 = true;
            return;
        }
        try {
            y yVar = iVar.U0;
            iVar.t0(j10);
            u1 u1Var = iVar.f16677s1;
            if (!u1Var.equals(u1.f14594d) && !u1Var.equals(iVar.f16678t1)) {
                iVar.f16678t1 = u1Var;
                yVar.c(u1Var);
            }
            iVar.N0.f22474e++;
            r rVar = iVar.X0;
            boolean z10 = rVar.f16720d != 3;
            rVar.f16720d = 3;
            rVar.f16727k.getClass();
            rVar.f16722f = c0.N(SystemClock.elapsedRealtime());
            if (z10 && (surface = iVar.f16664f1) != null) {
                Handler handler = yVar.f16767b;
                if (handler != null) {
                    handler.post(new x(yVar, surface, SystemClock.elapsedRealtime()));
                }
                iVar.f16667i1 = true;
            }
            iVar.b0(j10);
        } catch (v4.m e10) {
            iVar.M0 = e10;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = c0.f16548a;
        a(((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11)));
        return true;
    }
}
