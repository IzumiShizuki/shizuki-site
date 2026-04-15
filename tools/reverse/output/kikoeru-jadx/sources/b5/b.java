package b5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import b7.a1;
import b7.c1;
import b7.d1;
import c7.e1;
import c7.j0;
import c7.l0;
import c7.p1;
import c7.r0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1507a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Looper looper) {
        super(looper);
        this.f1509c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.os.Message r8, b5.f0 r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.obj
            b5.c r0 = (b5.c) r0
            boolean r1 = r0.f1511b
            r2 = 0
            if (r1 != 0) goto Lb
            goto L87
        Lb:
            int r1 = r0.f1513d
            r3 = 1
            int r1 = r1 + r3
            r0.f1513d = r1
            java.lang.Object r4 = r7.f1509c
            b5.e r4 = (b5.e) r4
            m3.l r4 = r4.f1532i
            r4.getClass()
            r4 = 3
            if (r1 <= r4) goto L1f
            goto L87
        L1f:
            j5.u r1 = new j5.u
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = r1 instanceof java.io.IOException
            if (r1 == 0) goto L36
            java.lang.Throwable r9 = r9.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto L40
        L36:
            androidx.media3.exoplayer.offline.e r1 = new androidx.media3.exoplayer.offline.e
            java.lang.Throwable r9 = r9.getCause()
            r1.<init>(r9)
            r9 = r1
        L40:
            java.lang.Object r1 = r7.f1509c
            b5.e r1 = (b5.e) r1
            m3.l r1 = r1.f1532i
            int r0 = r0.f1513d
            r1.getClass()
            boolean r1 = r9 instanceof m4.p0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof s4.v
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof n5.n
            if (r1 != 0) goto L82
            int r1 = s4.j.f19426b
        L62:
            if (r9 == 0) goto L77
            boolean r1 = r9 instanceof s4.j
            if (r1 == 0) goto L72
            r1 = r9
            s4.j r1 = (s4.j) r1
            int r1 = r1.f19427a
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r6) goto L72
            goto L82
        L72:
            java.lang.Throwable r9 = r9.getCause()
            goto L62
        L77:
            int r0 = r0 - r3
            int r0 = r0 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r0, r9)
            long r0 = (long) r9
            goto L83
        L82:
            r0 = r4
        L83:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L88
        L87:
            return r2
        L88:
            monitor-enter(r7)
            boolean r9 = r7.f1508b     // Catch: java.lang.Throwable -> L96
            if (r9 != 0) goto L98
            android.os.Message r8 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> L96
            r7.sendMessageDelayed(r8, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            return r3
        L96:
            r8 = move-exception
            goto L9a
        L98:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            return r2
        L9a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.b.a(android.os.Message, b5.f0):boolean");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objJ;
        int iP0;
        int iD0;
        boolean zF0;
        switch (this.f1507a) {
            case 0:
                c cVar = (c) message.obj;
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        objJ = ((e) this.f1509c).f1534k.j((w) cVar.f1512c);
                    } else {
                        if (i10 != 2) {
                            throw new RuntimeException();
                        }
                        e eVar = (e) this.f1509c;
                        objJ = eVar.f1534k.i(eVar.f1535l, (v) cVar.f1512c);
                    }
                } catch (f0 e10) {
                    boolean zA = a(message, e10);
                    objJ = e10;
                    if (zA) {
                        return;
                    }
                } catch (Exception e11) {
                    p4.c.C("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                    objJ = e11;
                }
                m3.l lVar = ((e) this.f1509c).f1532i;
                long j10 = cVar.f1510a;
                lVar.getClass();
                synchronized (this) {
                    try {
                        if (!this.f1508b) {
                            ((e) this.f1509c).f1537n.obtainMessage(message.what, Pair.create(cVar.f1512c, objJ)).sendToTarget();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                a1 a1Var = (a1) this.f1509c;
                d1 d1Var = a1Var.f1622e;
                if (this.f1508b) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            e1.t(data);
                            a1Var.h((String) message.obj, data);
                            return;
                        case 2:
                            a1Var.e((p1) message.obj);
                            return;
                        case 3:
                            a1Var.d((r0) message.obj);
                            return;
                        case 4:
                            a1Var.a((l0) message.obj);
                            return;
                        case 5:
                            a1Var.f((List) message.obj);
                            return;
                        case 6:
                            a1Var.g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            e1.t(bundle);
                            a1Var.c(bundle);
                            return;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            d1Var.f1712b.d();
                            return;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            int iIntValue = ((Integer) message.obj).intValue();
                            c1 c1Var = d1Var.f1723m;
                            d1Var.f1723m = new c1(c1Var.f1666a, c1Var.f1667b, c1Var.f1668c, c1Var.f1669d, c1Var.f1670e, iIntValue, c1Var.f1672g, c1Var.f1673h);
                            a1Var.k();
                            return;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                        default:
                            return;
                        case 11:
                            a1Var.b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            int iIntValue2 = ((Integer) message.obj).intValue();
                            c1 c1Var2 = d1Var.f1723m;
                            d1Var.f1723m = new c1(c1Var2.f1666a, c1Var2.f1667b, c1Var2.f1668c, c1Var2.f1669d, c1Var2.f1670e, c1Var2.f1671f, iIntValue2, c1Var2.f1673h);
                            a1Var.k();
                            return;
                        case 13:
                            if (!d1Var.f1721k) {
                                d1Var.j();
                                return;
                            }
                            c1 c1Var3 = d1Var.f1723m;
                            p1 p1VarD = d1.d(d1Var.f1718h.W0());
                            c7.h hVarA = ((j0) d1Var.f1718h.f968b).f3651e.a();
                            if (hVarA != null) {
                                try {
                                    iP0 = hVarA.p0();
                                } catch (RemoteException e12) {
                                    Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e12);
                                    iP0 = -1;
                                }
                            } else {
                                iP0 = -1;
                            }
                            c7.h hVarA2 = ((j0) d1Var.f1718h.f968b).f3651e.a();
                            if (hVarA2 != null) {
                                try {
                                    iD0 = hVarA2.d0();
                                } catch (RemoteException e13) {
                                    Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e13);
                                    iD0 = -1;
                                }
                            } else {
                                iD0 = -1;
                            }
                            d1Var.f1723m = new c1(c1Var3.f1666a, p1VarD, c1Var3.f1668c, c1Var3.f1669d, c1Var3.f1670e, iP0, iD0, c1Var3.f1673h);
                            c7.h hVarA3 = ((j0) d1Var.f1718h.f968b).f3651e.a();
                            if (hVarA3 != null) {
                                try {
                                    zF0 = hVarA3.f0();
                                } catch (RemoteException e14) {
                                    Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e14);
                                    zF0 = false;
                                }
                                break;
                            } else {
                                zF0 = false;
                            }
                            a1Var.b(zF0);
                            a1Var.f1621d.removeMessages(1);
                            d1Var.f(false, d1Var.f1723m);
                            return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a1 a1Var, Looper looper) {
        super(looper);
        this.f1509c = a1Var;
        this.f1508b = false;
    }
}
