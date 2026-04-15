package b5;

import android.content.Intent;
import android.content.IntentSender;
import android.os.RemoteException;
import android.util.Pair;
import b7.i4;
import b7.t0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import v4.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1587d;

    public /* synthetic */ n(Object obj, int i10, Object obj2, int i11) {
        this.f1584a = i11;
        this.f1586c = obj;
        this.f1585b = i10;
        this.f1587d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b5.r, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        i4 i4Var;
        switch (this.f1584a) {
            case 0:
                q qVar = (q) this.f1586c;
                this.f1587d.w(qVar.f1593a, qVar.f1594b, this.f1585b);
                break;
            case 1:
                t0 t0Var = (t0) this.f1586c;
                cb.y yVar = (cb.y) this.f1587d;
                int i10 = this.f1585b;
                try {
                    i4Var = (i4) yVar.get();
                    p4.c.g(i4Var, "SessionResult must not be null");
                } catch (InterruptedException e10) {
                    e = e10;
                    p4.c.C("MCImplBase", "Session operation failed", e);
                    i4Var = new i4(-1);
                } catch (CancellationException e11) {
                    p4.c.C("MCImplBase", "Session operation cancelled", e11);
                    i4Var = new i4(1);
                } catch (ExecutionException e12) {
                    e = e12;
                    p4.c.C("MCImplBase", "Session operation failed", e);
                    i4Var = new i4(-1);
                }
                b7.t tVar = t0Var.f2091w;
                if (tVar != null) {
                    try {
                        tVar.V(t0Var.f2071c, i10, i4Var.b());
                    } catch (RemoteException unused) {
                        p4.c.B("MCImplBase", "Error in sending");
                        return;
                    }
                    break;
                }
                break;
            case 2:
                ((d.m) this.f1586c).a(this.f1585b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f1587d));
                break;
            case 3:
                ((k7.c) ((c0.s) this.f1586c).f3157c).f(this.f1585b, this.f1587d);
                break;
            case 4:
                CopyOnWriteArraySet<p4.m> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f1586c;
                p4.k kVar = (p4.k) this.f1587d;
                for (p4.m mVar : copyOnWriteArraySet) {
                    if (!mVar.f16587d) {
                        int i11 = this.f1585b;
                        if (i11 != -1) {
                            mVar.f16585b.a(i11);
                        }
                        mVar.f16586c = true;
                        kVar.a(mVar.f16584a);
                    }
                }
                break;
            default:
                q0 q0Var = (q0) this.f1586c;
                Pair pair = (Pair) this.f1587d;
                q0Var.f22620b.f22643h.w(((Integer) pair.first).intValue(), (j5.d0) pair.second, this.f1585b);
                break;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, int i10, int i11) {
        this.f1584a = i11;
        this.f1586c = obj;
        this.f1587d = obj2;
        this.f1585b = i10;
    }
}
