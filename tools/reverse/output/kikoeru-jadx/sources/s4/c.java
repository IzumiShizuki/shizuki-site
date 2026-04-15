package s4;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import ya.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19388b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f19390d;

    public c(boolean z10) {
        this.f19387a = z10;
    }

    public final void a(int i10) {
        m mVar = this.f19390d;
        int i11 = p4.c0.f16548a;
        for (int i12 = 0; i12 < this.f19389c; i12++) {
            f0 f0Var = (f0) this.f19388b.get(i12);
            boolean z10 = this.f19387a;
            n5.i iVar = (n5.i) f0Var;
            synchronized (iVar) {
                a1 a1Var = n5.i.f15339n;
                if (z10 && (mVar.f19451i & 8) != 8) {
                    iVar.f15353h += (long) i10;
                }
            }
        }
    }

    public final void b() {
        m mVar = this.f19390d;
        int i10 = p4.c0.f16548a;
        for (int i11 = 0; i11 < this.f19389c; i11++) {
            f0 f0Var = (f0) this.f19388b.get(i11);
            boolean z10 = this.f19387a;
            n5.i iVar = (n5.i) f0Var;
            synchronized (iVar) {
                try {
                    a1 a1Var = n5.i.f15339n;
                    if (z10 && (mVar.f19451i & 8) != 8) {
                        p4.c.i(iVar.f15351f > 0);
                        iVar.f15348c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = (int) (jElapsedRealtime - iVar.f15352g);
                        iVar.f15354i += (long) i12;
                        long j10 = iVar.f15355j;
                        long j11 = iVar.f15353h;
                        iVar.f15355j = j10 + j11;
                        if (i12 > 0) {
                            iVar.f15350e.a((j11 * 8000.0f) / i12, (int) Math.sqrt(j11));
                            if (iVar.f15354i >= 2000 || iVar.f15355j >= 524288) {
                                iVar.f15356k = (long) iVar.f15350e.b();
                            }
                            iVar.c(i12, iVar.f15353h, iVar.f15356k);
                            iVar.f15352g = jElapsedRealtime;
                            iVar.f15353h = 0L;
                        }
                        iVar.f15351f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f19390d = null;
    }

    public final void c() {
        for (int i10 = 0; i10 < this.f19389c; i10++) {
            ((f0) this.f19388b.get(i10)).getClass();
        }
    }

    public final void e(m mVar) {
        this.f19390d = mVar;
        for (int i10 = 0; i10 < this.f19389c; i10++) {
            f0 f0Var = (f0) this.f19388b.get(i10);
            boolean z10 = this.f19387a;
            n5.i iVar = (n5.i) f0Var;
            synchronized (iVar) {
                try {
                    a1 a1Var = n5.i.f15339n;
                    if (z10 && (mVar.f19451i & 8) != 8) {
                        if (iVar.f15351f == 0) {
                            iVar.f15348c.getClass();
                            iVar.f15352g = SystemClock.elapsedRealtime();
                        }
                        iVar.f15351f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // s4.h
    public Map p() {
        return Collections.EMPTY_MAP;
    }

    @Override // s4.h
    public final void t(f0 f0Var) {
        f0Var.getClass();
        ArrayList arrayList = this.f19388b;
        if (arrayList.contains(f0Var)) {
            return;
        }
        arrayList.add(f0Var);
        this.f19389c++;
    }
}
