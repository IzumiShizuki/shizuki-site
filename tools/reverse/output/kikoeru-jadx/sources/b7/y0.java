package b7;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2204f;

    public /* synthetic */ y0(o2 o2Var, e4 e4Var, int i10, c7.k1 k1Var, n2 n2Var) {
        this.f2199a = 1;
        this.f2201c = o2Var;
        this.f2202d = e4Var;
        this.f2200b = i10;
        this.f2203e = k1Var;
        this.f2204f = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.f2199a) {
            case 0:
                d1 d1Var = (d1) this.f2201c;
                AtomicInteger atomicInteger = (AtomicInteger) this.f2202d;
                List list = (List) this.f2203e;
                ArrayList arrayList = (ArrayList) this.f2204f;
                if (atomicInteger.incrementAndGet() == list.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        cb.y yVar = (cb.y) arrayList.get(i10);
                        if (yVar != null) {
                            try {
                                bitmap = (Bitmap) g8.a.B(yVar);
                            } catch (CancellationException | ExecutionException e10) {
                                p4.c.m("MCImplLegacy", "Failed to get bitmap", e10);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        androidx.media3.exoplayer.offline.u uVar = d1Var.f1718h;
                        c7.q0 q0VarG = x.g((m4.i0) list.get(i10), bitmap);
                        int i11 = this.f2200b + i10;
                        c7.j0 j0Var = (c7.j0) uVar.f968b;
                        if ((j0Var.f3647a.getFlags() & 4) == 0) {
                            throw new UnsupportedOperationException("This session doesn't support queue management operations");
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", lc.b.o(q0VarG, MediaDescriptionCompat.CREATOR));
                        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i11);
                        j0Var.f3647a.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
                        break;
                    }
                    return;
                }
                return;
            case 1:
                o2 o2Var = (o2) this.f2201c;
                e4 e4Var = (e4) this.f2202d;
                c7.k1 k1Var = (c7.k1) this.f2203e;
                n2 n2Var = (n2) this.f2204f;
                b0.w1 w1Var = o2Var.f2007f;
                if (o2Var.f2008g.h()) {
                    return;
                }
                boolean zIsActive = ((c7.w0) o2Var.f2012k.f3618b).f3739a.isActive();
                int i12 = this.f2200b;
                if (!zIsActive) {
                    StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb.append(e4Var == null ? Integer.valueOf(i12) : e4Var.f1762b);
                    sb.append(", pid=");
                    sb.append(k1Var.f3655a.f3653b);
                    p4.c.B("MediaSessionLegacyStub", sb.toString());
                    return;
                }
                t1 t1VarL = o2Var.L(k1Var);
                if (e4Var != null) {
                    if (!w1Var.W(t1VarL, e4Var)) {
                        return;
                    }
                } else if (!w1Var.V(t1VarL, i12)) {
                    return;
                }
                try {
                    n2Var.b(t1VarL);
                    return;
                } catch (RemoteException e11) {
                    p4.c.C("MediaSessionLegacyStub", "Exception in " + t1VarL, e11);
                    return;
                }
            default:
                v4.q0 q0Var = (v4.q0) this.f2201c;
                Pair pair = (Pair) this.f2202d;
                q0Var.f22620b.f22643h.k(((Integer) pair.first).intValue(), (j5.d0) pair.second, (j5.u) this.f2203e, (j5.z) this.f2204f, this.f2200b);
                return;
        }
    }

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2199a = i11;
        this.f2201c = obj;
        this.f2202d = obj2;
        this.f2203e = obj3;
        this.f2204f = obj4;
        this.f2200b = i10;
    }
}
